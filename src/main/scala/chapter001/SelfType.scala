package org.ebay.scala
package chapter001

trait User {

  def username: String

}

trait Tweeter {

  self : User =>

  def tweet(tweetText: String): Unit = println(s"$username: $tweetText")

}

class VerifiedTweeter(val username_ : String) extends Tweeter with User {  // 我们混入trait User 因为 Tweeter 需要
  def username = s"real $username_"
}

object SelfType {

  def main(args: Array[String]): Unit = {
    val realBeyoncé = new VerifiedTweeter("Beyoncé")
    realBeyoncé.tweet("Just spilled my glass of lemonade")  // 打印出 "real Beyoncé: Just spilled my glass of lemonade"
  }

}