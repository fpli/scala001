package org.ebay.scala

object Test {
  def main(args: Array[String]): Unit = {
    val value = List("6.28.0",
      "6.9.5",
      "6.9.6",
      "6.9.1",
      "6.9.0",
      "6.5.1",
      "6.7.0",
      "6.12.1",
      "6.14.0",
      "6.35.0",
      "6.14.1",
      "6.16.0",
      "6.37.0",
      "6.31.1",
      "6.10.0",
      "6.31.0",
      "6.12.0",
      "6.33.0",
      "NULL",
      "6.18.0",
      "6.39.0",
      "6.18.1",
      "6.4.0",
      "6.40.0",
      "6.2.0",
      "6.25.0",
      "6.23.1",
      "6.27.0",
      "6.21.0",
      "6.23.0",
      "6.29.0",
      "6.6.6",
      "6.8.0",
      "6.8.1",
      "6.6.0",
      "6.30.0",
      "6.13.0",
      "6.36.0",
      "6.15.0",
      "6.38.0",
      "6.15.1",
      "6.32.0",
      "6.11.0",
      "6.34.0",
      "6.11.1",
      "6.17.0",
      "6.19.0",
      "6.5.0",
      "6.3.0",
      "6.1.0",
      "6.24.0",
      "6.26.1",
      "6.26.0",
      "6.20.0",
      "6.22.1",
      "6.22.0")

    val value1 = List(
      "6.10.0",
      "6.11.0",
      "6.11.1",
      "6.12.0",
      "6.12.1",
      "6.13.0",
      "6.14.0",
      "6.14.1",
      "6.15.0",
      "6.15.1",
      "6.16.0",
      "6.17.0",
      "6.18.0",
      "6.18.1",
      "6.19.0",
      "6.2.0",
      "6.20.0",
      "6.21.0",
      "6.22.0",
      "6.22.1",
      "6.23.0",
      "6.23.1",
      "6.24.0",
      "6.25.0",
      "6.26.0",
      "6.26.1",
      "6.27.0",
      "6.28.0",
      "6.29.0",
      "6.3.0",
      "6.30.0",
      "6.31.0",
      "6.31.1",
      "6.32.0",
      "6.33.0",
      "6.34.0",
      "6.35.0",
      "6.36.0",
      "6.37.0",
      "6.38.0",
      "6.39.0",
      "6.4.0",
      "6.40.0",
      "6.5.1",
      "6.6.0",
      "6.6.6",
      "6.7.0",
      "6.8.0",
      "6.8.1",
      "6.9.0",
      "6.9.1",
      "6.9.5",
      "6.9.6",
      "NULL")

    //val value2 = value.diff(value1)
    //println(value2)

    println(value1.diff(value))
  }
}
