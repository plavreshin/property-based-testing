package com.github.plavreshin

case class Player(playerId: Long, firstName: String, lastName: String, state: PlayerState)

sealed trait PlayerState

object PlayerState {
  val PlayerStates: Set[PlayerState] = Set(Blocked, Active)
  case object Blocked extends PlayerState
  case object Active extends PlayerState
}