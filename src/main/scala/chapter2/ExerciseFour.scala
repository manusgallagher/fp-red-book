package chapter2

import scala.annotation.tailrec

object ExerciseFour extends App {
    def uncurry[A,B,C](f: A => B => C): (A, B) => C =
        (a, b) => f(a)(b) // (a: A, b: B) => f(a)(b)
}