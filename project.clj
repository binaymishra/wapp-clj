(defproject wapp-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-json "0.5.1"]
                 [ring/ring-defaults "0.3.2"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler wapp-clj.core/app :port 3311}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :uberjar-name "app.jar"
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
