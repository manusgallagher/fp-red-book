package chapter2

import scala.annotation.tailrec

object ExerciseThree extends App {
    def curry[A,B,C](f:(A, B) => C): A => (B => C) =
        a => b => f(a, b) // (a: A) => (b: B) => f(a,b)
}