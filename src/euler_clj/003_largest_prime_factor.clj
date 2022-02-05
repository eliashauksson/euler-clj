;https://projecteuler.net/problem=3
(ns euler-clj.problem003
  (:require [euler-clj.utils.prime-numbers :refer [prime-factors]]))

(defn solve [n]
  (last (prime-factors n)))
