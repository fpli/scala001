package org.ebay.scala
package chapter003

object LoopTest {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 20){
      println(i)
    }
    println("a very colorful line separator------")
    for (i <- 1 until 12){
      println(i)
    }
    println("scala fp demo ")
    println(func(20)(2))
  }

  def func(i: Int): Int => Int = {
    def f(i: Int) : Int = {
      20 * i
    }
    f _
  }
}
