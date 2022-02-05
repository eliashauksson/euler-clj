;https://projecteuler.net/problem=2
(ns euler-clj.problem002
  (:require [euler_clj.utils.sequences :refer [fibonacci]]))

(defn solve []
  (->> (fibonacci)
       (filter even?)
       (take-while #(< % 4000000))
       (reduce +)))
