package org.ebay.scala
package chapter08

object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 50))

    // 1. map  key not change, value *2
    val newList = list.map(tuple => (tuple._1, tuple._2 * 2))
    println(newList)
    // 2.
    val newList2 = list.map(
      tuple => {
//        println(tuple)
        tuple match {
          case (word, count) => (word, count * 2)
        }
//        println(tuple)
      }
    )
    println(newList2)


    // 3
    val newList3 = list.map {
      case (word, count) => (word, count * 2)
    }

    println(newList3)
    // 4 partial function  example: abs(x)
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
      case 0 => 0
    }

    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
      case  0 => 0
    }

    val zeroAbs: PartialFunction[Int, Int] = {
      case  0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)
    println(abs(20))
    println(abs(-30))
    println(abs(0))
  }
}
