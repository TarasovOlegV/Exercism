# Annalyn's Infiltration

Welcome to Annalyn's Infiltration on Exercism's Clojure Track.
If you need help running the tests or submitting your code, check out `HELP.md`.
If you get stuck on the exercise, check out `HINTS.md`, but try and solve it without using those first :)

## Introduction

Booleans in Clojure are represented by `true` or `false`.

Predicate functions (functions which return a boolean) will typically end with a quesion mark (`?`), but this is by convention only.

The core library includes functions for logical operators such as `not`, `and`, and `or`.

## Instructions

In this exercise, you'll be implementing the quest logic for a new RPG game a friend is developing. The game's main character is Annalyn, a brave girl with a fierce and loyal pet dog. Unfortunately, disaster strikes, as her best friend was kidnapped while searching for berries in the forest. Annalyn will try to find and free her best friend, optionally taking her dog with her on this quest.

After some time spent following her best friend's trail, she finds the camp in which her best friend is imprisoned. It turns out there are two kidnappers: a mighty knight and a cunning archer.

Having found the kidnappers, Annalyn considers which of the following actions she can engage in:

- Fast attack: a fast attack can be made if the knight is sleeping, as it takes time for him to get his armor on, so he will be vulnerable.
- Spy: the group can be spied upon if at least one of them is awake. Otherwise, spying is a waste of time.
- Signal prisoner: the prisoner can be signalled using bird sounds if the prisoner is awake and the archer is sleeping, as archers are trained in bird signaling so they could intercept the message.
- Free prisoner: if the prisoner is awake and the other two characters are sleeping, a sneaky entry into the camp can free the prisoner. This won't work if the prisoner is sleeping, as the prisoner will be startled by the sudden appearance of her friend and the knight and archer will be awoken. The prisoner can also be freed if the archer is sleeping and Annalyn has her pet dog with her, as the knight will be scared by the dog and will withdraw, and the archer can't equip his bow fast enough to prevent the prisoner from being freed.

You have four tasks: to implement the logic for determining if the above actions are available based on the state of the three characters found in the forest and whether Annalyn's pet dog is present or not.

## 1. Check if a fast attack can be made

Implement the `can-fast-attack?` function that takes a boolean value that indicates if the knight is awake. This function returns `true` if a fast attack can be made based on the state of the knight. Otherwise, returns `false`:

```clojure
(def knight-awake? true)

(can-fast-attack? knight-awake?)
;;=> false
```

## 2. Check if the group can be spied upon

Implement the `can-spy?` function that takes three boolean values, indicating if the knight, archer and the prisoner, respectively, are awake. The function returns `true` if the group can be spied upon, based on the state of the three characters. Otherwise, returns `false`:

```clojure
(def knight-awake? false)
(def archer-awake? true)
(def prisoner-awake? false)

(can-spy? knight-awake? archer-awake? prisoner-awake?)
;;=> true
```

## 3. Check if the prisoner can be signalled

Implement the `can-signal-prisoner?` function that takes two boolean values, indicating if the archer and the prisoner, respectively, are awake. The function returns `true` if the prisoner can be signalled, based on the state of the two characters. Otherwise, returns `false`:

```clojure
(def archer-awake? false)
(def prisoner-awake? true)

(can-signal-prisoner? archer-awake? prisoner-awake?)
;;=> true
```

## 4. Check if the prisoner can be freed

Implement the `can-free-prisoner?` function that takes four boolean values. The first three parameters indicate if the knight, archer and the prisoner, respectively, are awake. The last parameter indicates if Annalyn's pet dog is present. The function returns `true` if the prisoner can be freed based on the state of the three characters and Annalyn's pet dog presence. Otherwise, it returns `false`:

```clojure
(def knight-awake? false)
(def archer-awake? true)
(def prisoner-awake? false)
(def dog-present? false)

(can-free-prisoner? knight-awake? archer-awake? prisoner-awake? dog-present?)
;;=> false
```

## Source

### Created by

- @porkostomus