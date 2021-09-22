package org.ebay.scala
package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

object test06_Break {
  def main(args: Array[String]): Unit = {
    //
    try {
      for (i <- 0 until 5){
        if (i == 3){
          throw new RuntimeException
        }
        println(i)
      }
    } catch {
      case e: Exception =>

    }

    // 2. use Breaks break method
    Breaks.breakable(
      for (i <- 0 until 5){
        if (i == 3){
          Breaks.break()
        }
        println(i)
      }
    )
    // import scala.util.control.Breaks._
    breakable(
      for (i <- 0 until 5){
        if (i == 3){
          break()
        }
        println(i)
      }
    )

    println("this is outer code.")
  }
}
