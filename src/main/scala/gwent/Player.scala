package cl.uchile.dcc
package gwent

import gwent.cards.Card

class Player (val name:String , val gem :Int, private var _deck : List[Card],private var _hand : List[Card]) {

  /** Accessor method for the player's deck */
  def deck: List[Card] = _deck

  /** Accessor method for the player's hand */
  def hand: List[Card] = _hand

  def drawCard(): Card = {
    val card = deck.head
    _deck = deck.tail
    _hand = card :: hand
    card
  }

  def shuffleDeck(): Unit = {
    _deck = scala.util.Random.shuffle(_deck)
  }

}



