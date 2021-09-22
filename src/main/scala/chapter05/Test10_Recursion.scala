package org.ebay.scala
package chapter05

import scala.annotation.tailrec

object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }

  def fact(n: Int): Int = {
    if (n == 0){
      1
    } else {
      n * fact(n-1)
    }
  }

  // 尾递归实现
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, currentResult: Int): Int = {
      if (n == 0){
        currentResult
      } else {
        loop(n - 1, currentResult * n)
      }
    }
    loop(n, 1)
  }
}
