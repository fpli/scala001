package org.ebay.scala
package chapter06

object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1()
    student1.Student1()

    val student2 = new Student1("alice")
    val student3 = new Student1("bob", 25)

  }
}

class Student1() {
  // define attribute
  var name: String = _
  var age: Int = _

  println("1. main constructor was invoked")

  //
  def this(name: String) {
    this()
    println("2. helper constructor was invoke")
    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age: Int) {
    this(name)
    println("3. helper constructor was invoke")
    this.age = age
    println(s"name: $name age: $age")
  }

  def Student1(): Unit ={
    println("this isn't a constructor. only a common method.")
  }
}