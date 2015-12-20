(set-env!
 :dependencies  '[[org.clojure/clojure "1.7.0"]
                  [boot/core           "2.4.2"]
                  [adzerk/bootlaces    "0.1.13"]
                  [hoplon/boot-hoplon  "0.1.10"]
                  [degree9/boot-semver "1.2.0"]]
 :resource-paths   #{"src"})

(require
 '[adzerk.bootlaces :refer :all]
 '[lounge.boot      :refer :all]
 '[boot-semver.core :refer :all])

(task-options!
 pom {:project 'degree9/lounge.boot
      :description ""
      :url         ""
      :scm {:url ""}})
