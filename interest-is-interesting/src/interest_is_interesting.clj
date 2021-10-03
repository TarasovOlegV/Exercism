(ns interest-is-interesting)

(defn interest-rate
  [balance]
  (cond (< balance 0) -3.213
        (< balance 1000) 0.5
        (< balance 5000) 1.621
        (>= balance 5000) 2.475)
  )

(defn annual-balance-update
  [balance]
     (+ balance
      (cond (neg? balance) (- (* balance (bigdec (/ (interest-rate balance) 100))))
        :else (* balance (bigdec (/ (interest-rate balance) 100))))
      )
  )

(defn amount-to-donate
  "TODO: add docstring"
  [balance tax-free-percentage]
  (cond (<= balance 0) 0
        :else (int (* balance 
                      (* 2 (/ tax-free-percentage 100)))))
  )