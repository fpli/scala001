package org.ebay.scala
package chapter09

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 10 / 0
      println(n)
    } catch {
      case e: ArithmeticException => {
        println("occur an exception:" + e)
      }
      case e: Exception => {
        println("exception:" + e.getMessage)
      }
    } finally {
      println("handle complete")
    }
  }
}
