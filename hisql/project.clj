(defproject hisql "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.jdbc "0.4.2"]
                 ;;[sqljdbc4/sqljdbc4 "4.0"]
                 ]
  :resource-paths ["resources/sqljdbc4.jar" "resources/sqljdbc.jar"]
  :main ^:skip-aot hisql.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
