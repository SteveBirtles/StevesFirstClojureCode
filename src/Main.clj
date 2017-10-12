(ns .Main)

(defn bubble-sort
  ([myList]
   (loop [x myList j (count myList)]
     (if (> j 0) (recur (bubble-sort x 0 j) (- j 1))
                 x)))

  ([myList i j]
   (if (< (+ i 1) j)
     (let [x (myList i) y (myList (+ i 1))]
       (recur (if (> x y) (assoc (assoc myList (+ i 1) x) i y) myList)
              (+ 1 i) j))
     myList))
  )

(def oldList [6 3 7 3 5 7 2 4])

(def newList (bubble-sort oldList))

(println newList)
