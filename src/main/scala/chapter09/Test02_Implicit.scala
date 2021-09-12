package org.ebay.scala
package chapter09

object Test02_Implicit {
  def main(args: Array[String]): Unit = {
    val new12 = new MyRichInt(12)
    println(new12.myMax(15))


    // 1 implicit function
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)
    println(23.myMax(40))
    println("------ " * 10)

    // 2 implicit class
    implicit class MyRichInt2(val self: Int){
      //
      def myMax2(n: Int): Int = if (n < self) self else n
      def myMin2(n: Int): Int = if (n < self) n else self
    }
    println(12.myMax2(30))
    println(12.myMin2(21))

    println("******** " * 10)
    // 3 implicit parameter
    def sayHello(name: String = "alice"): Unit = {
      println("hello, " + name)
    }
    sayHello("alice")
    sayHello()

    implicit val str: String = "alice" // only one
    def sayHi(implicit name: String): Unit = {
      println("hi, " + name)
    }
    sayHi

    def sayHi2(implicit name: String): Unit = {
      println("hi, " + name)
    }
    sayHi2

    implicit val num: Int = 20

    //
    def hiAge(): Unit = {
      println("hi, " + implicitly[Int])
    }
    hiAge()
  }
}

class MyRichInt(val self: Int){
  //
  def myMax(n: Int): Int = if (n < self) self else n
  def myMin(n: Int): Int = if (n < self) n else self
}
