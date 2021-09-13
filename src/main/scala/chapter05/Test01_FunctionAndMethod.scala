package org.ebay.scala
package chapter05

object Test01_FunctionAndMethod {

  def main(args: Array[String]): Unit = {
    // define function
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }
    // invoke function
    sayHi("alice")

    //
    Test01_FunctionAndMethod.sayHi("bob")
    val result = Test01_FunctionAndMethod.sayHello("cary")
    println(result)
  }

  // define method
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    println("Hello, " + name)
    "Hello"
  }
}
