(ns lounge.boot
  (:require [boot.core          :as boot]
            [boot.task.built-in :as task]
            [hoplon.boot-hoplon :as hoplon]
            [adzerk.bootlaces   :as bootlaces]
            [boot-semver.core   :as semver]))

(boot/deftask prod
  "Build project for development to clojars."
  []
  (comp
   (semver/version :minor 'inc)
   (hoplon/hoplon :manifest true)
   (bootlaces/build-jar)
   (bootlaces/push-release)))

(boot/deftask dev
  "Build project for development."
  []
  (comp
   (task/watch)
   (semver/version)
   (hoplon/hoplon :manifest true)
   (bootlaces/build-jar)))
