(ns com.climate.scouting.resources-test
  (:require
    [clojure.test :refer [is deftest]]
    [com.climate.scouting.resources :refer [user-routes]]))

(deftest test-api-docs
  (is
    (= 200
      (:status
        (user-routes
          {:headers {}
           :uri "/"
           :scheme :http
           :request-method :get})))))
