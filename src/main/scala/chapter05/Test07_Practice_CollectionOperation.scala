package org.ebay.scala
package chapter05

object Test07_Practice_CollectionOperation {

  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12, 45, 75, 98)

    // 1 对数组进行处理， 将操作抽象出来
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    //
    def addOne(elem: Int): Int = {
      elem + 1
    }

    val newArray = arrayOperation(arr, addOne)
    println(newArray.mkString(", "))

    //
    //val newArray2 = arrayOperation(arr, elem => elem * 2)
    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(", "))
  }
}
