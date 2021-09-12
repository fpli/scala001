package org.ebay.scala
package chapter08

object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("alice", 19)
    // match object
    val result = student match {
      case Student("alice", 18) => "alice, 18"
      case _ => "Else"
    }
    println(result)
  }
}

class Student(val name: String, val age: Int)

object Student{
  def apply(name: String, age: Int): Student = new Student(name, age)
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null){
      None
    } else {
      Some((student.name, student.age))
    }
  }
}
