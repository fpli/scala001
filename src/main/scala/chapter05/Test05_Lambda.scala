package org.ebay.scala
package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    // JavaScript Lambda
    val fun = (name: String) => {println(name)}
    fun("atguigu")
    ((name: String) => println(name))("alice")
    // c callback (function's point)
    println("--------- " * 8)
    // define function
    def f(func: String => Unit): Unit = {
      func("atguigu")
    }

    f(fun);
    f( (name: String) => { println(name) })

    // ignore parameter type
    f( (name) => { println(name) })

    f( name => { println(name) }) // only one parameter

    f( x =>  println(x) ) // only one line

    f( println(_) )
    // Consumer java function Interface
    f( println )

    //
    println("dualFunctionOneAndTwo -- " * 8)
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo( _ + _ ))

    println(dualFunctionOneAndTwo(minus))
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a - b))
    println(dualFunctionOneAndTwo((a, b) => a - b))
    println(dualFunctionOneAndTwo( _ - _))
    println("b -a ")
    println(dualFunctionOneAndTwo((a, b) => b - a))
    println(dualFunctionOneAndTwo((a, b) => -a + b))
    println(dualFunctionOneAndTwo( -_ + _))

    //
    println("---- -- - -- " * 8)

  }
}
