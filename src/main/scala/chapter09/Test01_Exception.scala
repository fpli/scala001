package org.ebay.scala
package chapter09

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 10 / 0
    } catch {
      case e: ArithmeticException => {
        println("occur an exception")
      }
      case e: Exception => {
        println("exception")
      }
    } finally {
      println("handle complete")
    }
  }
}
