package org.ebay.scala
package chapter001

object Tes {

  private[Tes] var add: String = _

  def main(args: Array[String]): Unit = {
    say()
    println(add)
    new Tes().hello()
  }

  def say(): Unit ={
    this.synchronized {
      println("==========" + this)
    }
  }
}

class Tes {
  var name: String = _

  def hello() = {
   println(name)
  }
}
