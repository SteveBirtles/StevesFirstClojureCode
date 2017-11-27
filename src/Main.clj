(ns .Main
  (:require [clojure.string :as str]))


(def list1 (list 1 2 3))
(def list2 '(1 2 3))
(println list1)
(println list2)

(def vector1 (vector 1 2 3))
(def vector2 [1 2 3])
(println vector1)
(println vector2)

(def map1 (hash-map 1 10 2 20 3 30))
(def map2 {1 10 2 20 3 30})
(println map1)
(println map2)

(def set1 (hash-set 1 2 3))
(def set2 #{1 2 3})
(println set1)
(println set2)

(println (float 1))

(print "Hello:")
(println (count (list 1 2 3)))

(def x (list 1 2 3 4 5))

(println (every? even? x))
(println (some? x))
(println (some even? x))

(println (take 100 (cycle '(1 2 3))))

(println (conj '(1 2 3) 4))
(println (into '(1 2 3) '(4 5 6)))
(println (concat '(1 2 3) '(4 5 6)))