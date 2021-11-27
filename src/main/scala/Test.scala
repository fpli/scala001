package org.ebay.scala

object Test {
  def main(args: Array[String]): Unit = {
    val start = System.currentTimeMillis()
    var sum: Long = 0
    for (i <- 1 to 1000000000){
      sum += i
    }
    println(sum)
    println(System.currentTimeMillis() - start)
  }
}
