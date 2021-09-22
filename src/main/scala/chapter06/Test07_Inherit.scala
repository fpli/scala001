package org.ebay.scala
package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student7("alice", 18)
    val student2 = new Student7("bob", 20, "std001")

    student1.printInfo()
    student2.printInfo()

    val teacher = new Teacher
    teacher.printInfo()

    def personInfo(person: Person7): Unit ={
      person.printInfo()
    }

    println("-----------------------")
    val person = new Person7()
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)
  }
}

class Person7() {
  var name: String = _
  var age: Int = _

  println("1. parent main constructor was invoke")

  def this(name: String, age: Int){
    this()
    println("2 parent helper constructor was invoke")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit ={
    println(s"Person: $name $age")
  }
}

class Student7(name: String, age: Int) extends Person7(name, age) {

  var stdNo: String = _

  println("3. child constructor was invoke")

  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("4. child helper constructor was invoke")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stdNo")
  }
}

class Teacher extends Person7 {

  override def printInfo(): Unit = {
    println("Teacher")
  }
}