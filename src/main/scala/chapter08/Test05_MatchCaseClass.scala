package org.ebay.scala
package chapter08

object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("alice", 18)

    val result = student match {
      case Student1("alice", 18) => "alice, 18"
      case _ => "Else"
    }

    println(result)
  }
}

case class Student1(name: String, age: Int)
