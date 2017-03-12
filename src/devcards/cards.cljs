(ns devcards.cards
  (:require-macros
    [devcards.core :refer [defcard]])
  (:require [om.next :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defcard my-first-card
         (dom/div nil
                  (dom/h1 nil "Devcards")))
