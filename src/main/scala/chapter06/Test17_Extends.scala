package org.ebay.scala
package chapter06

object Test17_Extends {
  def main(args: Array[String]): Unit = {
    val student = new Student17("alice", 18)
    student.study()
    student.sayHi()
    println()
    val person: Person17 = new Student17("bob", 20)
    person.sayHi()

    println("student is Student17:" + student.isInstanceOf[Student17])
    println("student is Person17:" + student.isInstanceOf[Person17])
    println("student is Person17:" + student.isInstanceOf[Person17])
    println("student is Student17:" + student.isInstanceOf[Student17])

    val person2: Person17 = new Person17("cary", 35)
    println("person2 is Student17: " + person2.isInstanceOf[Student17])

    // type cast
    if (person.isInstanceOf[Student17]){
      val student1 = person.asInstanceOf[Student17]
      student1.study()
    }

    //
    println(classOf[Student17])

    // test enum
    println(WorkDay.MONDAY)
  }
}

class Person17(val name: String, val age: Int){

  def sayHi(): Unit = {
    println("hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age){

  override def sayHi(): Unit = {
    println("hi from student " + name)
  }

  def study(): Unit = {
    println("student study")
  }
}

// enum
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}

// define App class
object TestApp extends App {
  println("app start")

  type MyString = String
  val a: MyString = "abc"
  println(a)
}