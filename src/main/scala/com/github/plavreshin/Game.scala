package com.github.plavreshin

import java.time.Instant

/**
  * Transitions
  * WaitingForBets -> BetsClosed, GameCancelled
  * BetsClosed -> DecisionOffered, GameCancelled
  *
  */

sealed trait Game {
  def startedAt: Instant
  def id: String
}
