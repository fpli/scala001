package org.ebay.scala
package chapter05

/**
 * 控制抽象
 */
object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1 传值参数
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    f0(23)

    def f1(): Int = {
      println("f1 invoke")
      12
    }

    f0(f1())


    println("---- --- " * 10)
    // 2 传名参数, 传的是代码块(带返回值)，不是函数类型，所以不带输入类型和小括号
    def f2(a: =>Int): Unit = {
      println("a: " + a) // f1 第一次 a === f1()
      println("a: " + a) // f1 第二次
    }
    f2(f1()) // f1 总共两次
    f2({23})
    f2(23)

    f2({
      println("this is a code block")
      29
    })

  }
}
