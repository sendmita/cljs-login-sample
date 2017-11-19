(ns hellominion.core
  (:require [reagent.core :as reagent]))


(defn multiply [a b]
  (* a b))

(defn  say-hello []
  (js/console.log "Hello...")
  (js/console.log (multiply 2 5))
)

(say-hello)
