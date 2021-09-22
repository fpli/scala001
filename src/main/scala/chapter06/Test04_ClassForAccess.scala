package org.ebay.scala
package chapter06

object Test04_ClassForAccess {

}

//
class Person {
  private var idCard: String = "3523566"
  protected var name: String = "alice"
  var sex: String = "female"

  private[chapter06] var age: Int = 18

  def printInfo(): Unit ={
    println(s"Person: $idCard $name $sex $age")
  }
}
