package org.ebay.scala
package chapter07

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple:(String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(tuple)

    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)

    //
    println()
    println(tuple.productElement(1))

    // 3 遍历元组数据
    println("==============")
    for (elem <- tuple.productIterator)
      println(elem)


    // 4. tuple 嵌套
    println()
    val mulTuple = (12, 0.3, "hello", (34, "scala", true), 29)
    println(mulTuple._4._2)
  }
}
