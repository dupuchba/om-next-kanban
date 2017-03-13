(ns om-next-kanban.core
  (:require-macros [om.next :refer [defui]])
  (:require [om.next :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(println "This text is printed from src/om-next-kanban/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defui App
  Object
  (render [this]
          (dom/div nil
                   (dom/h1 nil "This is a title"))))

(def reconciler (om/reconciler {:state app-state}))

(om/add-root! reconciler
              App
              (.. js/document (getElementById "app")))
