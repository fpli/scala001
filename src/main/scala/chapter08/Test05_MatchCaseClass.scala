package org.ebay.scala
package chapter08

object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("alice", 18)

    val result = student match {
      case Student1("alice", 18) => "alice, 18"
      case _ => "Else"
    }

    println(result)

    println("------------")
    val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

    println(message1.sender)  // prints guillaume@quebec.ca
    //message1.sender = "travis@washington.us"  // this line does not compile


    val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
    val messagesAreTheSame = message2 == message3  // true
    println(messagesAreTheSame)

    println()
    val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
    val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
    println(message5.sender)  // travis@washington.us
    println(message5.recipient) // claire@bourgogne.fr
    println(message5.body)  // "Me zo o komz gant ma amezeg"

    println("showNotification")

    def showNotification(notification: Notification): String = {
      notification match {
        case Email(sender, title, _) =>
          s"You got an email from $sender with title: $title"
        case SMS(number, message) =>
          s"You got an SMS from $number! Message: $message"
        case VoiceRecording(name, link) =>
          s"you received a Voice Recording from $name! Click the link to hear it: $link"
      }
    }
    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voiceRecording.org/id/123")

    println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?

    println(showNotification(someVoiceRecording))  // you received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123


    println("--------------pattern guards--------")
    def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
      notification match {
        case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
          "You got an email from special someone!"
        case SMS(number, _) if importantPeopleInfo.contains(number) =>
          "You got an SMS from special someone!"
        case other =>
          showNotification(other) // nothing special, delegate to our original showNotification function
      }
    }

    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

    val someSms1 = SMS("867-5309", "Are you there?")
    val someVoiceRecording1 = VoiceRecording("Tom", "voicerecording.org/id/123")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")

    println(showImportantNotification(someSms1, importantPeopleInfo))
    println(showImportantNotification(someVoiceRecording1, importantPeopleInfo))
    println(showImportantNotification(importantEmail, importantPeopleInfo))
    println(showImportantNotification(importantSms, importantPeopleInfo))
  }

  /**
   * 如上代码中goIdle函数对不同类型的Device有着不同的表现。
   * 一般使用类型的首字母作为case的标识符，例如上述代码中的p和c，这是一种惯例。
   * @param device
   * @return
   */
  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }

  /**
   * 这对于模式匹配很有用，因为我们不再需要一个匹配其他任意情况的case。
   * @param piece
   * @return
   */
  def findPlaceToSit(piece: Furniture): String = piece match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }
}

case class Student1(name: String, age: Int)

case class Message(sender: String, recipient: String, body: String)

//
abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification


/**
 * 当不同类型对象需要调用不同方法时，仅匹配类型的模式非常有用，
 * 如上代码中goIdle函数对不同类型的Device有着不同的表现。
 * 一般使用类型的首字母作为case的标识符，例如上述代码中的p和c，这是一种惯例。
 */
abstract class Device

case class Phone(model: String) extends Device {
  def screenOff = "Turning screen off"
}
case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on..."
}

/**
 * 密封类
 * 特质（trait）和类（class）可以用sealed标记为密封的，这意味着其所有子类都必须与之定义在相同文件中，从而保证所有子类型都是已知的。
 * 这对于模式匹配很有用，因为我们不再需要一个匹配其他任意情况的case。
 */
sealed abstract class Furniture

case class Couch() extends Furniture

case class Chair() extends Furniture