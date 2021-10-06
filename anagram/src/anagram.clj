(ns anagram)
(require '[clojure.string :as str])

(defn anagrams-for [word prospect-list]
  (let [sorted-word (sort (str/upper-case word))]
    (filter #(not= (str/upper-case %) (str/upper-case word))
            (filter #(= (sort  (str/upper-case %)) sorted-word) prospect-list))))
