;https://projecteuler.net/problem=2
(ns euler-clj.problem002)

(defn fib-seq
  ([] (fib-seq 0 1))
  ([a b] (lazy-seq (cons a (fib-seq b (+ a b))))))

(defn solve []
  (->> (fib-seq)
       (filter even?)
       (take-while #(< % 4000000))
       (reduce +)))
