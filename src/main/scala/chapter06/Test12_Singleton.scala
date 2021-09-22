package org.ebay.scala
package chapter06

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student12 = Student12.getInstance()
    student12.printInfo()

    val student = Student12.getInstance()
    student.printInfo()

    println(student)
    println(student12)
  }
}

class Student12 private(val name: String, val age: Int) {

  def printInfo(): Unit = {
    println(s"student6: name = ${name}, age = ${age}, school = ${Student11.school}")
  }

}
//
//object Student12 {
//
//  private val student: Student12 = new Student12("alice", 18)
//
//  def getInstance(): Student12 = student
//
//}

//
object Student12 {

  private var student: Student12 = _

  def getInstance(): Student12 = {
    if (student == null){
      student = new Student12("alice", 18)
    }
    student
  }

}