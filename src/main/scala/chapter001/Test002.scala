package org.ebay.scala
package chapter001

object Test002 {
  def main(args: Array[String]): Unit = {
    val name: String = "zhangsan"
    println(name)
    printInfo()
    val stu = new Student("lisi", 50, "changsha")
    stu.printInfo()

    stu.dancing()
    stu.increase()

    stu.singing()
    stu.increase()
  }

  def printInfo() : Unit = {
    println("scala method define.")
    println("welcome to write scala.")
  }
}

class Student(name: String, age: Int, address: String) extends Talent with Knowledge {
  def printInfo(): Unit = {
    println("scala method define.")
    println("welcome to write scala.")
    println(s"${name}---${age}-----${address}")
  }

  override def singing(): Unit = {
    println("wo, a pretty boy, he can sing. ")
  }

  override def dancing(): Unit = {
    println("yeah, really good. you can dance. I love you.")
  }

  override def increase(): Unit = {
    println("if you study, you will be smart, else you will be ignorance")
  }
}

trait Talent{

  def singing(): Unit

  def dancing(): Unit
}

trait Knowledge {

  def increase(): Unit

}


