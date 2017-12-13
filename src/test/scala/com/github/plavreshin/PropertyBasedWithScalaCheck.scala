package com.github.plavreshin

import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.Prop.{forAll, _}
import org.scalacheck.{Properties, _}

class PropertyBasedWithScalaCheck extends Properties("PalindromeSpec") with ArbitraryValues {
  lazy val palindromeGen = for {
    s <- arbitrary[String]
    opt <- Gen.option(arbitrary[Char])
  } yield s + opt.getOrElse("") + s.reverse

  def isPalindrome(s: String): Boolean = s == s.reverse

  def isValidRankWhenRead(rank: Int): Boolean = Rank.of(rank.toString.head).isDefined

  def isValidRankWhenConverted(rank: Rank): Boolean = Rank.Map.keySet.contains(rank.code)

  property("checkPalindrome") = {
    forAll(palindromeGen) { x => isPalindrome(x) }
  }

  property("checkPalindromeWithCollect") = {
    forAll(palindromeGen) { x => collect(x)(isPalindrome(x)) }
  }

  property("checkRanksWhenRead") = {
    forAll(Gen.choose(2, 9)) { x => collect(x)(isValidRankWhenRead(x)) }
  }

  property("checkRanksWhenConverted") = {
    forAll(RanksArbitrary.arbitrary) { x => collect(x)(isValidRankWhenConverted(x)) }
  }
}
