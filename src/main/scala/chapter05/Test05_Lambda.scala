package org.ebay.scala
package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    // JavaScript Lambda
    val fun = (name: String) => {println(name)}
    fun("atguigu")

    // c callback (function's point)
    println("--------- " * 8)
    // define function
    def f(func: String => Unit): Unit = {
      func("atguigu")
    }

    f(fun);
    f( (name: String) => { println(name) })

    //
    f( (name) => { println(name) })

    f( name => { println(name) }) // only one parameter

    f( x =>  println(x) ) // only one line

    f( println(_) )
    // Consumer java function Interface
    f( println )

  }
}
