;https://projecteuler.net/problem=4
(ns euler-clj.problem004
  (:require [euler-clj.utils.strings :refer [palindrome?]]
            [euler-clj.utils.operators :refer [pow]]))

(defn solve [max-digits]
  (apply max (loop [palindromes [] a (dec (pow 10 max-digits)) b (dec (pow 10 max-digits))]
               (if (= a (pow 10 (dec max-digits))) palindromes
                 (let [new-palindromes (if (palindrome? (str (* a b)))
                                         (conj palindromes (* a b)) palindromes)]
                   (if (= a b)
                     (recur new-palindromes (dec a) (dec (pow 10 max-digits)))
                     (recur new-palindromes a (dec b))))))))
