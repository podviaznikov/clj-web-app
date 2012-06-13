(ns clj-web-app.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "clj-web-app"]
               (include-css "/css/reset.css")]
              [:body
               [:header
                "App header"]
               [:div#wrapper
                content]
               [:footer
                "App footer"]]))
