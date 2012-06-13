(ns clj-web-app.server
  (:require [noir.server :as server]))

(server/load-views "src/clj_web_app/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'clj-web-app})))

