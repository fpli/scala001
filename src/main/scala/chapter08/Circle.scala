package org.ebay.scala
package chapter08

import scala.math._

object Circle {

  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)

  def main(args: Array[String]): Unit = {
    val circle1 = Circle(5.0)

    println(circle1.area)
  }
}

case class Circle(radius: Double) {
  import Circle._
  def area: Double = calculateArea(radius)
}
