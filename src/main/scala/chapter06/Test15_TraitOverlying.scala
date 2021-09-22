package org.ebay.scala
package chapter06

object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase()

    println()
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}

trait Ball {
  def describe(): String = "ball"
}

trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

trait CategoryBall extends Ball {
  var category: String = "foot"
  override def describe(): String = category + "-" + super.describe()
}

class MyFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is a " + super.describe()
}

// define a trait
trait Knowledge15 {

  var amount: Int = 0

  def increase(): Unit = {
    println("knowledge increased")
  }

}

trait Talent15 {

  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("talent increased")
  }

}

// from right to left
class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def singing(): Unit = println("dancing")

  override def dancing(): Unit = println("singing")

  override def increase(): Unit = {
    super[Person13].increase()
  }
}