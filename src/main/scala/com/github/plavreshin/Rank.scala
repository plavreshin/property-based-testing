package com.github.plavreshin

import scala.language.postfixOps

sealed trait Rank {
  def code: Char
}

object Rank {
  lazy val All = List(Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace)

  val Map: Map[Char, Rank] = All map { r => r.code -> r } toMap

  def of(rank: Char): Option[Rank] = Map.get(rank)

  case object Two extends Rank {def code = '2' }
  case object Three extends Rank {def code = '3' }
  case object Four extends Rank {def code = '4' }
  case object Five extends Rank {def code = '5' }
  case object Six extends Rank {def code = '6' }
  case object Seven extends Rank {def code = '7' }
  case object Eight extends Rank {def code = '8' }
  case object Nine extends Rank {def code = '9' }
  case object Ten extends Rank {def code = 'T' }
  case object Jack extends Rank {def code = 'J' }
  case object Queen extends Rank {def code = 'Q' }
  case object King extends Rank {def code = 'K' }
  case object Ace extends Rank {def code = 'A' }
}