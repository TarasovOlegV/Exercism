(ns tracks-on-tracks-on-tracks)

(defn new-list
  []
  ()
  )

(defn add-language
  [lang lang-list]
  (cons lang lang-list)
  )

(defn first-language
  [lang-list]
  (first lang-list)
  )

(defn remove-language
  [lang-list]
  (pop lang-list)
  )

(defn count-languages
  [lang-list]
  (count lang-list)
  )

(defn learning-list []
  (count-languages   
   (add-language "JavaScript"
     (add-language "Java" 
      (remove-language 
       (apply list
        (add-language "Lisp"
         (add-language "Clojure" (new-list)))) )))

))
