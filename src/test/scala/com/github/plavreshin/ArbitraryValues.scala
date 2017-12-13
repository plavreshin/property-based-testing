package com.github.plavreshin

import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.{Arbitrary, Gen}

trait ArbitraryValues {
  implicit val RanksArbitrary: Arbitrary[Rank] = Arbitrary(Gen.oneOf(Rank.All))
  implicit val SuitsArbitrary: Arbitrary[Suit] = Arbitrary(Gen.oneOf(Suit.All))

  implicit val PlayerStateArbitrary: Arbitrary[PlayerState] = Arbitrary(Gen.oneOf(PlayerState.PlayerStates.toSeq))

  implicit val PlayerArbitrary: Arbitrary[Player] = Arbitrary {
    for {
      firstName <- Gen.alphaUpperStr
      lastName <- Gen.alphaUpperStr
      playerId <- arbitrary[Long]
      state <- PlayerStateArbitrary.arbitrary
    } yield Player(firstName = firstName, lastName = lastName, playerId = playerId, state = state)
  }
}
