package org.ebay.scala
package chapter04

import scala.language.postfixOps
import scala.math.BigDecimal.double2bigDecimal

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // range
    for (i <- 1 to 10) {
      println(i + ". hello world")
    }

    // range
    for (i: Int <- 1.to(10)) {
      println(i + ". hello world")
    }

    println("Range(1, 10)")
    for (i <- Range(1, 10)){
      println(i + ". hello world")
    }
    println("for (i <- 1 until 10)")
    for (i <- 1 until 10){
      println(i + ". hello world")
    }

    // 2. collection iterate
    for (i <- Array(12, 34, 53)){
      println(i)
    }

    for (i <- List(12, 34, 53)){
      println(i)
    }

    for (i <- Set(12, 34, 53)){
      println(i)
    }

    println("===========================")
    // 3. cyclic sentinel
    for (i <- 1 to 10 ){
      if (i != 5)
        println(i)
    }

    for (i <- 1 to 10 if i != 5){
      println(i)
    }

    // 4 cyclic step
    println("cyclic step")
    for (i <- (1 to 10).by(2)){
      println(i)
    }

    for (i <- 1 to 10 by 2){
      println(i)
    }
    println("---------------------")
    for (i <- 13 to 30 by 3){
      println(i)
    }
    println("i <- 30 to 13 by -2")
    for (i <- 30 to 13 by -2){
      println(i)
    }

    println("i <- 10 to 1 by -1")
    for (i <- 10 to 1 by -1){
      println(i)
    }

    println("i <- 1 to 10 reverse")
    for (i <- 1 to 10 reverse){
      println(i)
    }

//    println("i <- 30 to 13 by 0")
//    for (i <- 30 to 13 by 0){//Exception in thread "main" java.lang.IllegalArgumentException: step cannot be 0.
//      println(i)
//    }
    println("data <- 1.0 to 10.0 by 0.3")
    for (data <- 1.0 to 10.0 by 0.3){
      println(data)
    }

    println("---------------------")
    // 5 cyclic nested
    for (i <- 1 to 3) {
      for (j <- 1 to 3){
        println("i = " + i + ", j = " + j)
      }
    }

    println()
    for (i <- 1 to 4; j <- 1 to 5){
      println("i = " + i + ", j = " + j)
    }

    // 6 cyclic refer variable
    println()
    for (i <- 1 to 10){
      val j = 10 - i
      println("i = " + i + ", j = " + j)
    }

    println()
    for (i <- 1 to 10; j = 10 - i){
      println("i = " + i + ", j = " + j)
    }

    println()
    for {
        i <- 1 to 10;
        j = 10 - i
    }{
      println("i = " + i + ", j = " + j)
    }

    // 6 cyclic return result
    println()
    val result: Unit = for (i <- 1 to 10) {
      println(i)
    }

    println("result = " + result)

    val b: IndexedSeq[Int] = for (i <- 1 to 10) yield i
    println("b = " + b)

    val c: IndexedSeq[Int] = for (i <- 1 to 10) yield {
      i * 2
    }
    println("c = " + c)

    val d: IndexedSeq[Int] = for (i <- 1 to 10) yield i * i
    println("d = " + d)
  }
}
