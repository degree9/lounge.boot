(ns lounge.boot
  (:require [boot.core          :as boot]
            [boot.util          :as util]
            [boot.task.built-in :as task]
            [hoplon.boot-hoplon :as hoplon]
            [adzerk.bootlaces   :as bootlaces]
            [boot-semver.core   :as semver]
            [clojure.java.io    :as io]
            [clojure.string     :as string]
            [boot.pod           :as pod]))

(boot/deftask deploy
  "Build project for deployment to clojars."
  []
  (comp
   (semver/version :minor 'inc :patch 'zero)
   (hoplon/hoplon  :manifest true)
   (bootlaces/build-jar)
   (bootlaces/push-release)))

(boot/deftask dev
  "Build project for development."
  []
  (comp
   (task/watch)
   (semver/version :no-update true
                   :minor 'inc
                   :patch 'zero
                   :pre-release 'snapshot)
   (hoplon/hoplon  :manifest true)
   (bootlaces/build-jar)))

