package org.ebay.scala
package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()
    student.study()
    student.dating()
    student.play()
  }
}

//
class Person13 {
  val name: String = "person"

  var age: Int = 18

  def sayHello(): Unit = {
    println("hello from: " + name)
  }

  def increase(): Unit = {
    println("person increased")
  }
}

// define a trait
trait Young {
  // declare abstract attribute and method
  var age: Int

  val name: String = "Young"

  def play(): Unit = {
    println(s"young people $name is playing")
  }

  def dating(): Unit

}

class Student13 extends Person13 with Young {

  override val name: String = "student"

  def dating(): Unit = {
    println(s"student $name is dating")
  }

  def study(): Unit = println(s"student $name is studying")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }

}