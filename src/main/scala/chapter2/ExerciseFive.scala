package chapter2

import scala.annotation.tailrec

object ExerciseFive extends App {
    def compose[A,B,C](f: B => C, g: A => B): A => C =
        a => f(g(a)) // (a: A) => f(g(a))
}