;; (ns hisql.core
;;   (:gen-class)
;;   (:require ))

;; (defn -main
;;   "I don't do a whole lot ... yet."
;;   [& args]
;;   (println "Hello, World!"))

(require '[clojure.java.jdbc :as j])

(def db-spec {:classname "com.microsoft.jdbc.sqlserver.SQLServerDriver"
              :subprotocol "sqlserver"
              :subname "//hostname.some.corp;Initial Catalog=mydb;"
              :database "mydb"
              :user "myuser"
              :password "mypass"})

(j/with-db-connection [connection db-spec]
  (let [rows (j/query connection
                    ["select * from MyTable"])]
    ;; this would output the "name" column in the People db
    (doseq [row rows] (println row))))
