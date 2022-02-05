(ns euler-clj.utils.operators)

(defn pow [x n]
  (if (zero? n) 1
    (* x (pow x (dec n)))))


