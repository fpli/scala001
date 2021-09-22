package org.ebay.scala
package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1
    val arr: Array[Int] = new Array[Int](5)

    // 2
    val arr2 = Array(12, 37, 42, 58, 97)
    //
    println(arr(0))
    println(arr(1))
    println(arr(4))
    //println(arr(5)) //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
    println("---- " * 10)
    arr(0) = 12
    arr(4) = 57
    println(arr(0))
    println(arr(1))
    println(arr(4))

    println("------ ==== --- " * 8)
    // 3 iterate
    for (i <- 0 until  arr.length){
      println(arr(i))
    }
    for (i <- arr.indices){
      println(arr(i))
    }
    println("----- ")
    // 3.2 直接遍历所有元素，增强for循环
    for (elem <- arr2){
      println(elem)
    }

    println("----- ----------- " * 2)
    // 3.3 迭代器的使用
    val iter = arr2.iterator
    while (iter.hasNext){
      println(iter.next())
    }

    println("----- ----------- " * 2)
    // 3.4 调用foreach 方法
    arr2.foreach((elem: Int) => println(elem))
    arr.foreach(println)

    println("------")
    println(arr2.mkString("--"))
    println()
    // 4 向数组添加数据
    val newArr = arr2.:+(73)
    println(arr2.mkString("--"))
    println(newArr.mkString("--"))

    val newArr2 = newArr.+:(30)
    println(newArr2.mkString("--"))

    println()
    val newArr3 = newArr2 :+ 15
    val newArr4 = 19 +: 29 +: newArr3 :+ 26 :+ 73
    println(newArr3.mkString("--"))
    println(newArr4.mkString(", "))
  }
}
