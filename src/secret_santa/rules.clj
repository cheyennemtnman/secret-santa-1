(ns secret-santa.rules)

;;A santa rule is a predicate written in such a way that an answer true causes the pairing to be rejected.
;;Each should take a me map, a santa map any any number of other parameters necessary for evaluation.
(defn santa-is-me? [me santa & _]
  (= me santa))

(defn santa-in-my-family? [me santa & _]
  (= (:family me) (:family santa)))

(defn santa-same-as-last-year? [me santa & xs]
  (let [last-year       (first xs)
        last-year-santa (last-year (keyword (:name me)))
        this-year-santa (keyword (:name santa))]
    (= this-year-santa last-year-santa)))

(defn santas-are-mutual? [me santa & xs]
  (let [santas       (first xs)
        my-name      (keyword (:name me))
        my-santa     (santas (keyword (:name me)))]
    (= my-name (my-santa santas))))

