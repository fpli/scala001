package org.ebay.scala
package chapter06

object Test10_AnonymousClass {

  def main(args: Array[String]): Unit = {

    val person10: Person10 = new Person10 {
      override var name: String = "alice"

      override def eat(): Unit = {
        println("person eat.")
      }
    }

    println(person10.name)
    person10.eat()

  }

}

abstract class Person10 {

  var name: String

  def eat(): Unit
}