package org.ebay.scala
package chapter08

object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    // match variable
    val (x, y) = (10, "hello")
    println(s"x: $x, y: $y")

    println("------ " * 10)
    val List(first, second, _*) = List(23, 15, 9, 78)
    println(s"first: $first, second: $second")

    println("******** " * 10)
    val fir :: sec :: rest = List(23, 15, 9, 78)
    println(s"fir: $fir, sec: $sec, rest: $rest")

    println("+++++++ " * 10)
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 50))
    // 2.1
    for (elem <- list) {
      println(elem._1 + " " + elem._2)
    }
    // 2.2
    for ((word, count) <- list) {
      println(word + " " + count)
    }
    // 2.3 only access _1
    for ((word, _) <- list) {
      println(word)
    }
    // 2.4  only match _1 == "a"
    for (("a", count) <- list) {
      println(count)
    }
  }
}
