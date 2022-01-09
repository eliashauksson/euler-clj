;https://projecteuler.net/problem=1
(ns euler-clj.problem001)

(defn solve []
  (->> (range 1000)
       (filter #(or (zero? (mod % 3))
                    (zero? (mod % 5))))
       (reduce +)))
