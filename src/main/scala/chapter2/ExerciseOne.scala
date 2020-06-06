package chapter2

import scala.annotation.tailrec

object ExerciseOne extends App {
    def fib(n: Long): Long = {

        @tailrec
        def loop(n: Long, acc: Long, curr: Long): Long = {
            if (n == 0) curr
            else loop(n - 1, acc + curr, acc)
        }
        loop(n, 0, 1)
    }
}