(set-env!
 :dependencies  '[[org.clojure/clojure       "1.7.0"]
                  [hoplon/boot-hoplon        "0.1.13"  :scope "test"]
                  [degree9/lounge.boot       "0.3.0-SNAPSHOT"  :scope "test"]
                  [degree9/boot-semver       "1.2.0-SNAPSHOT"  :scope "test"]]
 :resource-paths   #{"src"})

(require
 '[hoplon.boot-hoplon :refer :all]
 '[lounge.boot :refer :all]
 '[boot-semver.core :refer :all])

(task-options!
 pom {:project 'degree9/lounge.boot
      :description ""
      :url         ""
      :scm {:url ""}})
