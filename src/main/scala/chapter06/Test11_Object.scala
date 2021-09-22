package org.ebay.scala
package chapter06


object Test11_Object {

  def main(args: Array[String]): Unit = {
//    val student11 = new Student11("alice", 18)
//    student11.printInfo()

    val alice = Student11.newStudent("alice", 18)
    alice.printInfo()

    val bob = Student11.apply("bob", 19)
    bob.printInfo()

    val cary = Student11("cary", 25)
    cary.printInfo()
  }

}

class Student11 private(val name: String, val age: Int) {

  def printInfo(): Unit = {
    println(s"student6: name = ${name}, age = ${age}, school = ${Student11.school}")
  }

}

object Student11 {
  val school: String = "atguigu"

  // define a class method
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}