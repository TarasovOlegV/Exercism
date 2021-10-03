(ns log-levels
  (:require [clojure.string :as str]))

(defn message
  [s]
  (str/trim 
    (str/join  
      (rest 
        (str/split s #":")))))

(defn log-level
  [s]
    (str/lower-case
      (str/join
        (rest 
          (re-find #"\[(.*?)\]" s)))))

(defn reformat
  [s]
  (str/join [(message s), " (" ,(log-level s), ")"]))
