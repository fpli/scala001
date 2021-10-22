package org.ebay.scala
package chapter03

import scala.language.postfixOps

object Test03_TestOperator {
  def main(args: Array[String]): Unit = {
    //
    val result1 = 10 / 3
    println(result1)

    val result2: Double = 10 / 3
    println(result2)

    val result3: Double = 10.0 / 3
    println(result3.formatted("%5.2f"))

    val result4 = 10 % 3
    println(result4)

    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2)
    println(s1.equals(s2))

    // address is same ??
    println(s1.eq(s2))

    // 3 logic operator
    println("logic operator")
    def m(n: Int): Int = {
      println("m was invoke")
      n
    }
    val n = 1
    println( (4 < 5) && m(n) > 0)

    //
    def isNotEmpty(str: String): Boolean = {
      str != null && ! "".equals(str.trim)
    }

    println(isNotEmpty(null))

    // 4.
    var b: Byte = 10
    var i: Int = 12
    //b += 1
    i += 1
    println(i)

    // 5
    val a: Byte = 60
    println(a << 3)
    println(a >> 2)

    val c: Short = -13
    println(c << 2)
    println(c >> 2)
    println(c >>> 2)

    // scala中运算符的本质
    val n1: Int = 12
    val n2: Int = 37
    println(n1 + n2)
    println(n1.+(n2))
    println(1.34.*(25))
    println(1.34 * 25)
    println(7.5 toString)
  }
}
