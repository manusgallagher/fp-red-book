package chapter2

import scala.annotation.tailrec

object ExerciseTwo extends App {
    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        @tailrec
        def loop(n: Int): Boolean = {
            if(n + 1 == as.length) true
            else if (ordered(as(n), as(n+1))) loop(n + 1)
            else false
        }       

        loop(0)
    }


    // println(isSorted(Array("a", "ab", "abc", "abc"),(a: String, b: String) => a.length <= b.length))
    // println(isSorted(Array(0,1,2,3,4,5,6,7,8,9,10),(i: Int, j: Int) => i <= j))
}