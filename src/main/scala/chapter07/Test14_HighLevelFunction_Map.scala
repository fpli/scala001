package org.ebay.scala
package chapter07

object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 1 filter
    val evenList = list.filter((elem: Int) => {
      elem % 2 == 0
    })

    println(evenList)

    // odd
    println(list.filter(_ % 2 == 1))

    println("================")
    // 2 map
    println(list.map(_ * 2))
    println(list.map(x => x * x))

    println("================")
    // 3 flat
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))

    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)
    val flatList2 = nestedList.flatten
    println(flatList2)

    println("---- - --- " * 8)

    // 4. flat map
    // 将一组字符串进行分词，并保存成单词的列表
    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
    // flat
    val splitList: List[Array[String]] = strings.map(_.split(" ")) // 分词
    val flattenList = splitList.flatten
    println(flattenList)

    println(strings.flatMap(_.split(" ")))

    // 5. group
    println("group groupBy")
    val groupMap: Map[Int, List[Int]] = list.groupBy(_ % 2)
    println(groupMap)
    val groupMap2: Map[String, List[Int]] = list.groupBy(data => {
      if (data % 2 == 0){
        "even"
      } else {
        "odd"
      }
    })

    println(groupMap2)

    // 给定一组词汇，按照单词的首字母进行分组
    val wordList = List("china", "america", "alice", "canada", "cary", "bob", "japan")
    println(wordList.groupBy(_.charAt(0)))
  }

}
