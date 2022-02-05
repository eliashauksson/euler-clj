(ns euler-clj.utils.strings)

(defn palindrome? [word]
  (= word (apply str (reverse word))))
