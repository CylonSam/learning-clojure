(ns learning-clojure.playground)

; basic math
(+ 17 25)
(* 6 7)
(- 45 3)
(/ 84 2)

; defining a variable
(def programming-language "Clojure")

(println programming-language "is definitely something!")

; defining a function and calling it
(defn welcome-message
   []
   (println "Welcome to Clojure Hell!"))

(welcome-message)

; using let
(defn welcome-message-with-name
  [name]
  (let [message (str "Welcome to Clojure Hell, " name "!")]
    (println message)))

(welcome-message-with-name "Sam")

; using if
(def learning-coljure true)

(if learning-coljure
  (println "Good luck!")
  nil)
