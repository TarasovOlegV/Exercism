(ns acronym)
(require '[clojure.string :as str])

(defn acronym [s]
  (str/upper-case
   (str/join ""
             (map first (re-seq  #"[A-Z]+[a-z]*|[a-z]+" s)))))