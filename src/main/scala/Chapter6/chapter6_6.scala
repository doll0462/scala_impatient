package Chapter6

//6. Write a inumeration describing 4 set of card
// to make toString method returns ♣, ♦, ♥, or ♠.

object chapter6_6 {

  object CardShape extends Enumeration {

    type CardShape = Value
    val clover = Value("♣")
    val diamond = Value("♦")
    val heart = Value("♥")
    val spade = Value("♠")

  }
}
