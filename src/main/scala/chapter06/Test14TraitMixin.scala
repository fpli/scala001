package org.ebay.scala
package chapter06

object Test14TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student14
    student.study()
    student.increase()

    student.play()
    student.increase()

    student.dating()
    student.increase()

    // dynamic mixin
    println()
    val studentWithTalent = new Student14 with Talent {
      override def singing(): Unit = {
        println(s"student is good at dancing")
      }

      override def dancing(): Unit = {
        println(s"student is good at singing")
      }
    }

    studentWithTalent.sayHello()
    studentWithTalent.play()
    studentWithTalent.study()
    studentWithTalent.dating()
    studentWithTalent.dancing()
    studentWithTalent.increase()
  }
}

// define a trait
trait Knowledge {

  var amount: Int = 0

  def increase(): Unit

}

trait Talent {

  def singing(): Unit

  def dancing(): Unit

}

class Student14 extends Person13 with Young with Knowledge {

  override val name: String = "student"

  def dating(): Unit = {
    println(s"student $name is dating")
  }

  def study(): Unit = println(s"student $name is studying")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }

  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased: $amount")
  }
}
