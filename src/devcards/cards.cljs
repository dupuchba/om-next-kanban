(ns devcards.cards
  (:require [devcards.core :as dc :refer-macros [defcard]]
            [om.next :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [om-next-kanban.components.card :as kanban-card]))

(defcard
  "# Kanban cards

   Examples demonstrating how Kanban cards look given different properties
   or layout constraints.")

(defcard
  "## Properties

  Kanban cards are identified by IDs, have a text and assignees. But what
  happens if some of these properties are missing? And what happens if there
  are many assignees?")

(defcard
  "### Card with no id, text and assignees"
  (fn [props _] (kanban-card/card @props))
  {}
  {:inspect-data true})

(defcard my-first-card
         (dom/div nil
                  (dom/h1 nil "Devcarssds")))
