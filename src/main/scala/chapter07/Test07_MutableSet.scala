package org.ebay.scala
package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    val set1: mutable.Set[Int] = mutable.Set(13, 23, 53, 12, 13, 23, 78)
    println(set1)

    println("=========================")
    // 2 add element
    val set2 = set1 + 11
    println(set1)
    println(set2)

    println("set1 += 11")
    set1 += 11
    println(set1)

    println()
    val flag1 = set1.add(10)
    println(flag1)
    println(set1)
    val flag2 = set1.add(10)
    println(flag2)
    println(set1)

    // 3 remove element
    println("set1 -= 11")
    set1 -= 11
    println(set1)

    println()
    val flag3 = set1.remove(10)
    println(flag3)
    println(set1)
    val flag4 = set1.remove(10)
    println(flag4)
    println(set1)
    println("=====================")

    // 4. 合并set
    val set3 = mutable.Set(13, 12, 13, 27, 98, 29)
    println(set1)
    println(set3)
    val set4 = set1 ++ set3
    println()
    println(set1)
    println(set3)
    println(set4)

    println("-----  --  ")
    //set1 ++= set3
    set3 ++= set1
    println(set1)
    println(set3)

  }
}
