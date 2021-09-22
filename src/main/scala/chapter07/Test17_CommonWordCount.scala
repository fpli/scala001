package org.ebay.scala
package chapter07

object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List(
      "hello",
      "hello word",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )

    // 1 对字符串进行切分，得到一个打散所有单词的列表
    val wordList1: List[Array[String]] = stringList.map(_.split(" "))
    val wordList2 = wordList1.flatten
    println(wordList2)

    val wordlist = stringList.flatMap(_.split(" "))
    println(wordlist)

    // 2 相同单词进行分组
    val group: Map[String, List[String]] = wordlist.groupBy(word => word)
    println(group)

    // 3 对分组后对list取长度， 得到每个单词的个数
    val countMap: Map[String, Int] = group.map(kv => (kv._1, kv._2.length))

    // 4 将map转换为list, 并排序取前3
    val sortedList: List[(String, Int)] = countMap.toList.sortWith(_._2 > _._2).take(3)
    println(sortedList)
  }
}
