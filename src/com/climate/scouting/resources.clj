(ns com.climate.scouting.resources
  (:require [compojure.core :refer [defroutes GET]]))

(defroutes user-routes
  (GET "/" []
    {:status 200}))
