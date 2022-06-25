package org.ebay.scala
package chapter07

import scala.collection.mutable

object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)
    println(map1 ++ map2)

    val map3: mutable.Map[String, Int] = map1.foldLeft(map2)(
      (mergedMap, keyValue) => {
        val key = keyValue._1
        val value = keyValue._2
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value
        mergedMap
      }
    )

    println(map3)
    println(map2 == map3)
  }
}
