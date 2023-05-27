(ns wapp-clj.core
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as ring])
  (:gen-class))

(defroutes routes
  (GET "/" []
    (str "<h2>Hello World</h2>" "reduce binay-to" " Maverick" ", Loner" ", Engineer")))

(defn -main []
  (ring/run-jetty #'routes {:port 5000 :join? false}))