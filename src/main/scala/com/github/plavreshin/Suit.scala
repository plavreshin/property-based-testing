package com.github.plavreshin

sealed trait Suit {
  def code: Char
}

object Suit {
  lazy val All: List[Suit] = List(Spades, Diamonds, Clubs, Hearts)

  case object Spades extends Suit {def code = 'S' }
  case object Diamonds extends Suit {def code = 'D' }
  case object Clubs extends Suit {def code = 'C' }
  case object Hearts extends Suit {def code = 'H' }
}
