package org.ebay.scala
package chapter06

object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9;
    println(student.name)
    student.eat()
    student.sleep()
  }
}

abstract class Person9 {
  //
  val name: String = "person"
  //
  var age: Int

  def eat(): Unit = {
    println("person eat.")
  }

  def sleep(): Unit

}

class Student9 extends Person9 {
  //
  var age: Int = 18
  //
  def sleep(): Unit = {
    println("student sleep")
  }

  //
  override val name: String = "student"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}