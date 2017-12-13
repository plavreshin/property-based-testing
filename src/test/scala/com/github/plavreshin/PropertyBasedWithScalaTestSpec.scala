package com.github.plavreshin

import org.scalacheck.Gen
import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, OptionValues, WordSpec}

class PropertyBasedWithScalaTestSpec
  extends WordSpec
    with Matchers
    with OptionValues
    with PropertyChecks {
  "Rank" should {
    "be converted from char to Rank" in new {
      forAll(Gen.choose(2, 9)) { (rank: Int) =>
        Rank.of(rank.toString.head).isDefined shouldBe true
      }
    }

    "be converted from Rank to char" ignore new Scope {
      forAll(RankGen) { (rank: Rank) =>
        Rank.All should contain(Rank.of(rank.toString.head).value)
      }
    }
  }

  private trait Scope {
    val RankGen: Gen[Rank] = Gen.oneOf(Rank.All)
  }
}
