package org.ebay.scala
package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    val person: Person = new Person()
    //person.idCard //error
    //person.name //error
    println(person.age)
    println(person.sex)

    person.printInfo()

    val worker: Worker = new Worker()
    worker.age = 23
    worker.printInfo()
  }
}

//
class Worker extends Person{
  override def printInfo(): Unit = {
    println("Work:")
    //println(idCard) // error
    name = "bob"
    age = 25
    sex = "male"
    println(name)
    println(s"Worker:  $name $sex $age")
  }
}
