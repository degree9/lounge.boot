(set-env!
 :dependencies  '[[org.clojure/clojure "1.7.0"]
                  [boot/core           "2.4.2"]
                  [adzerk/bootlaces    "0.1.13"]
                  [hoplon/boot-hoplon  "0.1.10"]]
 :resource-paths   #{"src"})

(require
 '[adzerk.bootlaces :refer :all])

(def +version+ "0.1.0")

(task-options!
 pom {:project 'degree9/lounge.boot
      :version +version+
      :description ""
      :url         ""
      :scm {:url ""}})

(deftask dev
  "Build lounge.boot for development"
  []
  (comp
   (watch)
   (build-jar)))
