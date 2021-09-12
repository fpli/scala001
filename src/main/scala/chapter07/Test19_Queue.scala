package org.ebay.scala
package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object Test19_Queue {

  def main(args: Array[String]): Unit = {
    val queue:mutable.Queue[String] = new mutable.Queue[String]()
    queue.enqueue("a", "b", "c")
    println(queue)
    println(queue.dequeue())
    println(queue)

    val queue1 = Queue("a", "v", "b")
    println(queue1)
    val queue2 = queue1.enqueue("g")
    println(queue2)
    println(queue1)
  }
}
