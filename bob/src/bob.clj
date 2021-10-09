(ns bob)
(require '[clojure.string :as str])

(defn capitalize? [s]
  (and (some? (re-seq  #"[A-Za-z]" s))
       (= s (str/upper-case s))))

(defn response-for [string]
  (let [s (str/trim string)]
    (cond (empty? s) "Fine. Be that way!"
          (and (capitalize? s) (= \? (last s)))  "Calm down, I know what I'm doing!"
          (= \? (last s)) "Sure."
          (capitalize? s) "Whoa, chill out!"
          :else "Whatever.")))

