package org.ebay.scala
package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)
    println("===============================")

    // 2. add element
    map1.put("c", 5)
    map1.put("d", 9)
    println(map1)

    //
    map1 += (("e", 7))
    println(map1)
    println("-------------------")

    // 3. remove element
    println(map1("c"))
    map1.remove("c")
    println(map1)

    map1 -= "d"
    println(map1)
    println()


    // 4. update element
    map1.update("c", 5)
    map1.update("e", 10)
    println(map1)
    map1 += (("e", 7))
    println(map1)
    println()

    // 5. 合并两个map
    val map2: Map[String, Int] = Map("aaa" -> 11, "b" ->29, "hello" -> 5)
    //map1 ++= map2
    println(map1)
    println(map2)

    println("=++++++++++===== ")
    //map2 ++= map1 //error
    val map3: Map[String, Int] = map2 ++ map1
    println(map1)
    println(map2)
    println(map3)
  }
}
