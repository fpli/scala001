package org.ebay.scala
package chapter09

object Test03_Generics {
  def main(args: Array[String]): Unit = {
    // 协变和逆变
    val child: Parent = new Child
    //val childList: MyCollection[Parent] = new MyCollection[Child]

    val childList: MyCollection[SubChild] = new MyCollection[Child]

    // 上下限
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }

    test[Child](new SubChild)
  }
}

class Parent {}

class Child extends Parent {}

class SubChild extends Child {}

//class MyCollection[+E] {}
class MyCollection[-E] {}


