(defproject hellominion "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main hellominion.core
  :dependencies [[org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.8.51"]
                  [reagent "0.6.2"]]

  :plugins [[lein-cljsbuild "1.1.6"]
            [lein-figwheel "0.5.10"]]

  :cljsbuild
    {:builds [{:id           "dev"
              :source-paths ["src"]
              :figwheel     true
              :compiler{
                :optimizations :none
                :output-to            "resources/public/js/dev.js"
                :output-dir           "resources/public/js/cljs-dev/"
                :pretty-print true
                :asset-path           "js/out"
                :source-map true
              }
              }]
    }

)
