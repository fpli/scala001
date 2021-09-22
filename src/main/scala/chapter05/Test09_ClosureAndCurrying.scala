package org.ebay.scala
package chapter05

object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {

    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1. 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2. 扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3. 将固定加数作为另一个参数传入，但是是作为第一层参数传入
    def addByFour1(): Int => Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    println(addByA(35)(24))
    // 通用性和实用性结合
    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)

    println(addByFour2(13))
    println(addByFive2(25))

    // 4. lambda
    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int => Int = {
      b  => {
        a + b
      }
    }

    def addByA3(a: Int): Int => Int = {
      b => a + b
    }

    def addByA4(a: Int): Int => Int = a + _

    println(addByA4(13)(21))
    println(addByA4(25))

    // 5 curry 柯里化
    def addCurring(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurring(35)(24))

  }
}
