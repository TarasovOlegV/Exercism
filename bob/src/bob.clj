(ns bob)
(require '[clojure.string :as str])

(defn get-last-char [s]
  (subs s (- (count s) 1)))

(defn string-empty? [s]
  (not (some? (re-seq #"[A-Za-z0-9-!$%^&*()_+|~=`{}\[\]:;'<>?,.\/]" s))))

(defn capitalize? [s]
  (and (some? (re-seq  #"[A-Za-z]" s))
       (= s (str/upper-case s))))

(defn response-for [string]
  (let [s (str/trim string)]
    (cond (string-empty? s) "Fine. Be that way!"
          (and
           (capitalize? s)
           (= "?" (get-last-char s)))  "Calm down, I know what I'm doing!"
          (= "?" (get-last-char s)) "Sure."
          (capitalize? s) "Whoa, chill out!"
          :else "Whatever.")))

