(ns secret-santa.rules)

;;A santa rule is a predicate written in such a way that an answer true causes the pairing to be rejected.
;;TODO how to deal with input parameters? Variadic after me and santa? (i.e. [me santa & xs])
(defn santa-is-me? [me santa]
  (= me santa))

(defn santa-in-my-family? [me santa]
  (= (:family me) (:family santa)))

(defn santa-same-as-last-year? [me santa last-year]
  (let [last-year-santa (last-year (keyword (:name me)))
        this-year-santa (keyword (:name santa))]
    (= this-year-santa last-year-santa)))

(defn santas-are-mutual? [me santa santas]
  (let [my-santa     (santas (keyword (:name me)))
        santas-santa (santas (keyword (:name santa)))]
    (= my-santa santas-santa)))
