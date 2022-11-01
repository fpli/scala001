package org.ebay.scala
package chapter08

import scala.util.Random

object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("alice", 19)
    // match object
    val result = student match {
      case Student("alice", 18) => "alice, 18"
      case _ => "Else"
    }
    println(result)
    println()


    val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
    customer1ID match {
      case CustomerID(name) => println(name)  // prints Sukyoung
      case _ => println("Could not extract a CustomerID")
    }

    val customer2ID = CustomerID("Nico")
    val CustomerID(name) = customer2ID
    println(name)  // prints Nico

    //val name = CustomerID.unapply(customer2ID).get

    val CustomerID(name2) = "hhh--asdfasdfasdf"
    println(name2)

    val CustomerID(name3) = "-asdfasdfasdf"
    println(name3)
  }
}

class Student(val name: String, val age: Int)

object Student {

  def apply(name: String, age: Int): Student = new Student(name, age)

  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) {
      None
    } else {
      Some((student.name, student.age))
    }
  }
}

object CustomerID {

  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}
