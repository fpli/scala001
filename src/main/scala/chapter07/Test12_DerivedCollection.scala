package org.ebay.scala
package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 3, 5, 7, 2, 89)
    val list2 = List(3, 7, 2, 45, 4, 8, 19)
    // 1 获取集合的头
    println(list1.head)
    // 2 获取集合的尾
    println(list1.tail) // List(3, 5, 7, 2, 89)
    // 3 集合最后一个元素
    println(list2.last)
    // 4 集合初始数据(不包含最后一个)
    println(list2.init)
    // 5 reverse
    println(list1.reverse)
    // 6 取前n个元素
    println(list1.take(3))
    println(list1.takeRight(4)) // right
    // 7 去掉前n个数据
    println(list1.drop(3))
    println(list1.dropRight(4))

    println()
    println()
    // 8 并集
    println(list1.union(list2))
    println()
    println(list1 ::: list2)

    // set distinct
    val set1 = Set(1, 3, 5, 7, 2, 89)
    val set2 = Set(3, 7, 2, 45, 4, 8, 19)
    val union2 = set1.union(set2)
    println("union2: " + union2)
    println(set1 ++ set2)
    // 9 交集
    println("===========--- ")
    val intersection = list1.intersect(list2)
    println("intersection: " + intersection)
    // 10 差集
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println("diff1: " + diff1)
    println("diff2" + diff2)
    // 11 zip
    val zip = list1.zip(list2)
    println("zip: " + zip)
    println("list2.zip(list1): " + list2.zip(list1))
    // 12 slide
    println()
    println(list1.sliding(2)) // iterator
    //list1.sliding(3).foreach(println)
    for (elem <- list1.sliding(3))
      println(elem)

    println("--------------")
    list2.sliding(4, 2).foreach(println)

    println("--------------")
    list2.sliding(3, 3).foreach(println)
  }
}
