(ns euler-clj.utils.prime-numbers)

(defn prime? [n]
  (empty? (filter #(zero? (mod n %))
                  (range 2 (inc (Math/sqrt n))))))

(defn next-prime [n]
  (if (<= n 2) (inc n)
    (inc (last (take-while #(not (prime? %))
                           (map #(inc (+ % n)) (range)))))))

(defn prime-factors [n]
  (loop [factors [] x 1 r n]
    (if (>= 1 r)
      factors
      (if (zero? (mod n x))
        (recur (conj factors x) (next-prime x) (/ r x))
        (recur factors (next-prime x) r)))))
