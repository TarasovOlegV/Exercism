(ns annalyns-infiltration)

(defn can-fast-attack?
  [knight-awake?]
  (false? knight-awake?)
  )

(defn can-spy?
  [knight-awake? archer-awake? prisoner-awake?]
  (if (some true? [knight-awake? archer-awake? prisoner-awake?]) 
      true 
      false))

(defn can-signal-prisoner?
  [archer-awake? prisoner-awake?]
  (= true (false? archer-awake?) (true? prisoner-awake?)) 
  )

(defn can-free-prisoner?
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (or
       (= true 
          (false? archer-awake?)
          (false? knight-awake?)
          (true? prisoner-awake?))
       (= true 
          (false? archer-awake?)
          (true? dog-present?)))
  )
