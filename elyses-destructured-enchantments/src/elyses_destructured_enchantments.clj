(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck]
  (let  [[first] deck] first))

(defn second-card
  "Returns the second card from deck."
  [deck]
  (let [[_ second] deck] second))

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (let [[one two & rest] deck]
    (concat [two] [one] rest)))

(defn discard-top-card
  "Returns a vector containing the first card and
   a vector of the remaining cards in the deck."
  [deck]
  (let [[one & rest] deck]
    [one rest]))

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
  (let [[one & rest] deck]
    (concat (if (= nil one) [] [one])
            face-cards
            rest)))

(comment)