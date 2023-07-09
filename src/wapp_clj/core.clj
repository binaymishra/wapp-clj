(ns wapp-clj.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]
            [ring.middleware.json :as json]
            [ring.util.response :as response]
            [clojure.java.io :as io]
            [clojure.pprint :as pp]))

(defroutes app-routes
		(GET "/" [] (io/resource "public/index.html"))
				  (defroutes api-routes
    		(context "/api" []
	      	(GET "/" request {:status 200 :headers {"content-type" "text/clojure"} :body (with-out-str (pp/pprint request))})
	      	;; curl -v -X GET 'http://localhost:3311/api'
	      	(POST "/" {body :body} (response/response body)) 
	      	;; curl -v -X POST 'http://localhost:3311/api' -H 'Content-Type: application/json' --data-raw '{"message": "Hello Clojure"}'
      ))
		(route/resources "/")
  (route/not-found "Not Found"))

;; app run default ring port 3000
(def app (-> app-routes
             (json/wrap-json-body {:keywords? true :bigdecimals? true})
             (json/wrap-json-response)
             (wrap-defaults api-defaults)))