(ns lounge.boot
  (:require [boot.core          :as boot]
            [boot.task.built-in :as task]
            [hoplon.boot-hoplon :as hoplon]
            [adzerk.bootlaces   :as bootlaces]))

(boot/deftask prod
  "Build project for development to clojars."
  []
  (comp
   (hoplon/hoplon :manifest true)
   (bootlaces/build-jar)))

(boot/deftask dev
  "Build project for development."
  []
  (comp
   (task/watch)
   (prod)))
