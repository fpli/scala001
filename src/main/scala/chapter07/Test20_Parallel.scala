package org.ebay.scala
package chapter07

object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val result: IndexedSeq[String] = (1 to 100).map(_ => Thread.currentThread().getName)
    println(result)


  }
}
