package org.ebay.scala
package chapter05

object Test08_Practice {

  def main(args: Array[String]): Unit = {
    /**
     * 1 定义一个匿名函数， 并将它作为值赋给变量fun. 函数有3个参数，类型分别是Int, String, Char, 返回值类型为Boolean
     * 要求调用函数fun(0, "", '0')得到返回值为false, 其他情况返回true
     */
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(23, "", '0'))
    println(fun(0, "hello", '0'))

    println("-------- - -- " * 8)

    /**
     * 2 定义一个函数func, 它接收一个Int类型的参数，返回一个函数(记作f1).
     * f1, 接收一个String类型的参数，同样返回一个函数(记作f2).
     * f2接收一个Char类型的参数，返回一个Boolean的值
     * func(0)("")('0')得到false， 其他情况返回true
     */
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println(func(23)("")('0'))
    println(func(0)("hello")('0'))

    // 匿名函数简写
    def func1(i: Int): String => (Char => Boolean) = {
      (s: String) => {
        (c: Char) => {
          if (i == 0 && s == "" && c == '0') false else true
        }
      }
    }

    def func2(i: Int): String => (Char => Boolean) = {
      s => {
        c => {
          if (i == 0 && s == "" && c == '0') false else true
        }
      }
    }

    def func3(i: Int): String => (Char => Boolean) = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }
    println("func ---- " * 8)
    println(func3(0)("")('0'))
    println(func3(0)("")('1'))
    println(func3(23)("")('0'))
    println(func3(0)("hello")('0'))

    // 柯里化
    def func4(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println("func 4 ---- " * 8)
    println(func4(0)("")('0'))
    println(func4(0)("")('1'))
    println(func4(23)("")('0'))
    println(func4(0)("hello")('0'))
  }
}
