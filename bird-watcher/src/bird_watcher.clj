(ns bird-watcher)

(def last-week [0,2,5,3,7,8,4])
(def birds-per-day [2 5 0 7 4 1])

(defn today [birds]
  (last birds)
  )

(defn inc-bird [birds]
  (assoc birds 
         ( - (count birds) 1) 
         (+ (last birds) 1))
  )

(defn day-without-birds? [birds]
  (cond (nil? (some #(= 0 %) birds)) false :else true)
  )

(defn n-days-count [birds n]
  (reduce + (take n birds))
  )

(defn busy-days [birds]
  (count (filter #(<= 5 %) birds))
  )

(defn odd-week? [birds]
  (= birds [1 0 1 0 1 0 1])
  )
