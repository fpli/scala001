package org.ebay.scala
package org.ebay

object Timer {

  type Environment = String => Int

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread sleep 1000
    }
  }

  // () => Unit
  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)

    // Anonymous
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }

}
