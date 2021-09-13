package org.ebay.scala
package chapter05

object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    // 1
    def f1(str: String*): Unit ={
      println(str)
    }

    f1("alice")
    f1("alice", "bbb", "ccc")

    // 2
    println("---------- " * 8)
    def f2(str1: String, str2: String*): Unit ={
      println(str1 + "---" + str2)
      println(str2)
    }
    f2("alice")
    f2("alice", "bbb", "ccc")

    // 3
    println("3---- " * 8)
    def f3(name: String = "alice"): Unit ={
      println(name)
    }
    f3()
    f3("mary")

    // 4
    println("4---- " * 10)
    def f4(name: String = "atguigu", age: Int): Unit = {
      println(s"$age 's ${name} is studying at Gui.")
    }
    f4("alice", 30)
    f4(age = 13, name = "bob")
    f4(age = 31)
  }
}
