package org.ebay.scala
package chapter07

import scala.collection.MapView

object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello word", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    // solution 1
    val newStringList: List[String] = tupleList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )

    println(newStringList)
    // 接下来操作与普通版本完全一致
    val wordCountList: List[(String, Int)] = newStringList.flatMap(_.split(" ")).groupBy(word => word).map(kv => (kv._1, kv._2.size)).toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    println(wordCountList)


    println("-------------------")

    // solution 2
    // 将字符串打散为单词， 并结合对应的个数包装成二元组
    val preCountList: List[(String, Int)] = tupleList.flatMap(tuple => {
      val strings: Array[String] = tuple._1.split(" ")
      strings.map(word => (word, tuple._2))
    })

    println(preCountList)
    // 2 对二元组按照单词进行分组
    val preCountMap: Map[String, List[(String, Int)]] = preCountList.groupBy(_._1)
    println(preCountMap)

    // 3 叠加每个单词统计的个数值
    val countMap: MapView[String, Int] = preCountMap.mapValues(tupleList => tupleList.map(_._2).sum)
    println(countMap.toList)

    // 4 转换成list， 取前3
    val countList = countMap.toList.sortWith(_._2 > _._2).take(3)
    println(countList)
  }
}
