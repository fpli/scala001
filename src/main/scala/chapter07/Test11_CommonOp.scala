package org.ebay.scala
package chapter07

object Test11_CommonOp {

  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 5, 7, 2, 89)
    val set = Set(23,34, 423, 75)
    // 1 length
    println(list.length)
    // 2 size
    println(set.size)

    // 3 visit
    for (elem <- list){
      println(elem)
    }

    set.foreach(println)

    // 4 iterator
    for (elem <- list.iterator)
      println(elem)

    // 5
    println(list)
    println(set)
    val str = list.mkString(", ")
    println(str)
    println(set.mkString("--"))

    // 6
    println(list.contains(23))
    println(set.contains(23))
  }
}
