package org.ebay.scala
package chapter05

object Test06_HighOrderFunction {

  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f invoke")
      n + 1
    }

    def fun(): Int = {
      println("fun invoke")
      1
    }

    val result = f(123)
    println(result)

    fun()
    fun
    //
    println("------------- " * 8)

    // 1 函数作为值进行传递
    val f1: Int => Int = f
    val f2 = f _
    println(f1)
    println(f1(12))
    println(f2)
    println(f2(35))

    println("---- " * 10)
    val f3 = fun
    val f31: () => Int = fun
    val f4 = fun _
    println(f3)
    println(f31)
    println(f4)

    // 2 函数作为参数进行传递
    println("函数作为参数进行传递")
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }
    println(dualEval(add, 12 ,35))
    println(dualEval((a, b) => a + b, 12 ,35))
    println(dualEval( _ + _, 12 ,35))

    // 3 函数作为函数的返回值 (函数嵌套函数)
    println("函数作为函数的返回值")
    def f55() = {
      def f66(a: Int): Unit = {
        println("f6 invoke" + a)
      }
      f66 _
    }

    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6 invoke " + a)
      }
      f6
    }
    val f6 = f5()
    println(f6)
    println(f6(25))

    println(f5()(25))


    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
      val schema = if (ssl) "https://" else "http://"
      (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query) // "https://www.example.com/users?id=1": String

  }
}

object SalaryRaiser0 {

  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)
}

object SalaryRaiser {

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def bigPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)
}
