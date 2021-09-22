package org.ebay.scala
package chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    val student = new Student()
    //student.name // private can't access
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)
  }
}

class Student {
  //
  private var name: String = "alice"
  @BeanProperty
  var age: Int = _
  var sex: String = _



}