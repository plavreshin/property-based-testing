package com.github.plavreshin

sealed trait Card {
  def suit: Suit
  def rank: Rank
  def score: Int
}

object Card {
//  case object TwoOfSpades extends Card {
//    def suit: Suit = Suit.Spades
//    def rank: Rank = Rank.Two
//    def score: Int = 2
//  }
  case object ThreeOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Three
    def score: Int = 3
  }
  case object FourOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Four
    def score: Int = 4
  }
  case object FiveOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Five
    def score: Int = 5
  }
  case object SixOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Six
    def score: Int = 6
  }
  case object SevenOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Seven
    def score: Int = 7
  }
  case object EightOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Eight
    def score: Int = 8
  }
  case object NineOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Nine
    def score: Int = 9
  }
  case object TenOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Ten
    def score: Int = 10
  }
  case object JackOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Jack
    def score: Int = 10
  }
  case object QueenOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Queen
    def score: Int = 10
  }
  case object KingOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.King
    def score: Int = 10
  }
  case object AceOfSpades extends Card {
    def suit: Suit = Suit.Spades
    def rank: Rank = Rank.Ace
    def score: Int = 11
  }

//  case object TwoOfDiamonds extends Card {
//    def suit: Suit = Suit.Diamonds
//    def rank: Rank = Rank.Two
//    def score: Int = 2
//  }
  case object ThreeOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Three
    def score: Int = 3
  }
  case object FourOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Four
    def score: Int = 4
  }
  case object FiveOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Five
    def score: Int = 5
  }
  case object SixOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Six
    def score: Int = 6
  }
  case object SevenOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Seven
    def score: Int = 7
  }
  case object EightOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Eight
    def score: Int = 8
  }
  case object NineOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Nine
    def score: Int = 9
  }
  case object TenOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Ten
    def score: Int = 10
  }
  case object JackOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Jack
    def score: Int = 10
  }
  case object QueenOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Queen
    def score: Int = 10
  }
  case object KingOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.King
    def score: Int = 10
  }
  case object AceOfDiamonds extends Card {
    def suit: Suit = Suit.Diamonds
    def rank: Rank = Rank.Ace
    def score: Int = 11
  }
//
//  case object TwoOfClubs extends Card {
//    def suit: Suit = Suit.Clubs
//    def rank: Rank = Rank.Two
//    def score: Int = 2
//  }
  case object ThreeOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Three
    def score: Int = 3
  }
  case object FourOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Four
    def score: Int = 4
  }
  case object FiveOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Five
    def score: Int = 5
  }
  case object SixOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Six
    def score: Int = 6
  }
  case object SevenOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Seven
    def score: Int = 7
  }
  case object EightOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Eight
    def score: Int = 8
  }
  case object NineOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Nine
    def score: Int = 9
  }
  case object TenOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Ten
    def score: Int = 10
  }
  case object JackOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Jack
    def score: Int = 10
  }
  case object QueenOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Queen
    def score: Int = 10
  }
  case object KingOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.King
    def score: Int = 10
  }
  case object AceOfClubs extends Card {
    def suit: Suit = Suit.Clubs
    def rank: Rank = Rank.Ace
    def score: Int = 11
  }

//  case object TwoOfHearts extends Card {
//    def suit: Suit = Suit.Hearts
//    def rank: Rank = Rank.Two
//    def score: Int = 2
//  }
  case object ThreeOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Three
    def score: Int = 3
  }
  case object FourOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Four
    def score: Int = 4
  }
  case object FiveOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Five
    def score: Int = 5
  }
  case object SixOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Six
    def score: Int = 6
  }
  case object SevenOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Seven
    def score: Int = 7
  }
  case object EightOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Eight
    def score: Int = 8
  }
  case object NineOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Nine
    def score: Int = 9
  }
  case object TenOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Ten
    def score: Int = 10
  }
  case object JackOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Jack
    def score: Int = 10
  }
  case object QueenOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Queen
    def score: Int = 10
  }
  case object KingOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.King
    def score: Int = 10
  }
  case object AceOfHearts extends Card {
    def suit: Suit = Suit.Hearts
    def rank: Rank = Rank.Ace
    def score: Int = 11
  }
}
