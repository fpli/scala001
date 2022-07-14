package org.ebay.scala
package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    // match const
    def describeConst(x: Any): String = x match {
      case 1 => "Int one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => ""
    }

    println(describeConst("hello"))
    println(describeConst('+'))
    println(describeConst(0.3))

    println("============================")
    // match type
    def describeType(x: Any): String = x match {
      case i: Int => "Int " + i
      case s: String => "String " + s
      case list: List[String] => "List " + list
      case array: Array[Int] => "Array[Int] " + array.mkString(",")
      case a => "Something else: " + a
    }
    println(describeType(35))
    println(describeType("hello"))
    println(describeType(List("hi", "hello")))
    println(describeType(List(2, 23)))
    println(describeType(Array("hi", "hello")))
    println(describeType(Array(2, 23)))

    println("=================================")
    // match array
    for (arr <- List(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(2, 3, 7, 15), Array("hello", 1, 30))){
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1, 0)"
        case Array(x, y) => "Array: " + x + ", " + y
        case Array(0, _*) => "start with 0"
        case Array(x, 1, z) => "*, 1, *"
        case _ => "something else"
      }

      println(result)
    }

    println("===========")
    // match list
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88),
      List("hello")
    )){
      val result = list match {
        case List(0) => "0"
        case List(x, y) => "List(x, y): " + x + ", " + y
        case List(0, _*) => "List(0, ...)"
        case List(a) => "List(a): " + a
        case _ => "something else"
      }
      println(result)
    }

    println("match list 2 ----------------------" * 3)
    // match list 2
    val list1 = List(1, 2, 5, 7, 24)
    val list = List(24)
    list1 match {
      case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
      case _ => println("something esle")
    }

    list match {
      case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
      case _ => println("something esle")
    }

    // match tuple
    println("match tuple ----------------------" * 5)
    for (tuple <- List((0, 1), (0, 0), (0, 1, 0), (0, 1, 1), (1, 23, 56), ("hello", true, 0.5))){
      val result = tuple match {
        case (a, b) => "" + a + ", " + b
        case (0, _) => "(0, _)"
        case (a, 1, _) => "(a, 1, _) " + a
        case (x, y, z) => "(x, y, z) " + x + ", " + y + ", " + z
        case _ => "something else"
      }
      println(result)
    }
  }
}
