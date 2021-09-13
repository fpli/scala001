package org.ebay.scala
package chapter05

object Test02_FunctionDefine {

  def main(args: Array[String]): Unit = {
    // 1
    def f1(): Unit = {
      println("1. zero args, no return")
    }
    f1()
    println(f1()) // ()

    // 2
    println("------ " * 12)
    def f2(): Int = {
      println("f2()")
      12
    }

    f2()
    println(f2())

    //3
    println("-------- " * 12)
    def f3(name: String): Unit = {
      println(name)
    }
    f3("bob")
    println(f3("alice"))

    // 4
    println("-------- 4 " * 12)
    def f4(name: String): String = {
      println(name)
      name + " is studying"
    }
    f4("bob")
    println(f4("alice"))


    //5
    println("--------5 " * 12)
    def f5(name: String, age: Int): Unit = {
      println(s"${name} and ${age}. -------")
    }
    f5("bob", 34)
    println(f5("alice", 30))

    //6
    println("--------5 " * 12)
    def f6(name: String, age: Int): Int = {
      println(s"${name} and ${age}. -------")
      age * 20
    }
    f6("bob", 34)
    println(f6("alice", 30))
  }

}
