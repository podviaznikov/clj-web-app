(ns clj-web-app.views.app
  (:require [clj-web-app.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/app" []
         (common/layout
           [:p "Hello world"]))

(defpage "/" []
  (common/layout
    [:h1 "Welcome to my site!"]
    [:p "Hope you like it."]))