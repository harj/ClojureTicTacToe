(ns tic-tac-toe)

;Grid representation
(defn initial-grid []
  (->> {:square nil}
       (repeat 3) vec
       (repeat 3) vec))

(defn get-square [grid [row col]]
  (get-in grid [row col]))
