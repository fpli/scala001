package org.ebay.scala
package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(23, 57, 92)
    println(arr1)
    println(arr1.mkString(", "))
    println(arr2)
    println(arr2.toString())
    println(arr2.mkString(", "))
    println()

    // visit element
    // println(arr1(0)) // Exception in thread "main" java.lang.IndexOutOfBoundsException: 0 is out of bounds (min 0, max -1)
    println(arr2(1))
    arr2(1) = 39
    println(arr2(1))

    println()
    // add element into array
    val newArr1 = arr1 :+ 15
    println(arr1)
    println(newArr1)
    println(arr1 == newArr1)

    println("----")
    val newArr2 = arr1 += 19
    println(arr1)
    println(newArr2)
    println(newArr2 == arr1)
    newArr2 += 13
    println(arr1)

    println("----** " * 3)
    77 +=: arr1
    println(arr1)
    println(newArr2)

    println("   -====  ")
    arr1.append(36)
    arr1.prepend(11, 76)
    arr1.insert(1, 13)
    println(arr1)

    arr1.insertAll(1, newArr1)
    println(arr1)
    arr1.appendedAll(newArr2)
    arr1.prependAll(newArr2)
    println(arr1)

    // remove
    arr1.remove(3)
    println(arr1)

    arr1.remove(0, 10)
    println(arr1)

    //arr1 -= 14
    arr1 -= 13
    println(arr1)

    println()
    // 5. 可变数组转不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 56, 98)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString(", "))
    println(arr)

    // 6. 不可变数组转可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)
  }
}
