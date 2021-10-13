(ns collatz-conjecture)

(defn iter [num, answer]
  (cond (= 1 num) answer
        (even? num) (iter (/ num 2) (inc answer))
        :else (iter (+ (* 3 num) 1) (inc answer))))

(defn collatz [num]
  (iter num 0))