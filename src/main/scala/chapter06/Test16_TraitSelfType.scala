package org.ebay.scala
package chapter06

object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("alice", "123456")
    user.insert()
  }
}

class User(val name: String, val password: String)

trait UserDao {

  _: User =>

  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}

// define subclass
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao