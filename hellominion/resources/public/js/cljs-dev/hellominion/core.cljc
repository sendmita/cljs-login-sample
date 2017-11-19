(ns hellominion.core
  (:require [reagent.core :as reagent]))


(defn multiply [a b]
  (* a b))

(defn  say-hello []
  #?(:cljs (js/console.log "Hello..."))
  #?(:cljs (js/console.log (multiply 2 5)))
)

(say-hello)
