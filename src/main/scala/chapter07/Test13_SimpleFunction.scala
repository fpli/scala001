package org.ebay.scala
package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(5, 1, 8, 2, -3, 4)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))
    // 1 sum
    var sum = 0
    for (elem <- list){
      sum += elem
    }
    println(sum)

    println(list.sum)

    println(list.max)
    println(list2.max)
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy((tuple) => tuple._2))
    println(list2.maxBy(tuple => tuple._2))
    println(list2.maxBy(_._2))
    // 2 乘积
    println(list.product)
    // 3
    println(list.max)
    // 4
    println(list.min)
    println(list2.minBy(_._2))
    // 5.1 sort
    println()
    println(list.sorted)

    println(list.sorted.reverse)
    println(list.sorted(Ordering[Int].reverse))

    println(list2.sorted)
    // 5.2 sortBy
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))
    // 5.3
    println(list.sortWith((a: Int, b: Int) => { a < b}))
    println(list.sortWith(_ < _))
    println(list.sortWith(_ > _))
  }
}
