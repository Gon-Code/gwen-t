package cl.uchile.dcc
package gwent.players

import gwent.cards.{Card, MeleCard, RangedCard, SiegeCard, WeatherCard}
import gwent.board.Board


abstract class AbstractPlayer (val name: String,protected var _gem : Int , protected var _deck : List[Card],
                               protected var _hand : List[Card]) extends Player{

  /** Accessor method for the player's deck */
  def getDeck: List[Card] = _deck

  /** Accessor method for the player's hand */
  def getHand: List[Card] = _hand

  /** Accessor method fot he player's gem count */
  def gem: Int = _gem
  /** Setter for the _gem field
   * The gem count can't be lower than zero */
  def gem_(newGem: Int): Unit = {
    _gem = math.max(0, newGem)
  }

  /** Setter for the _deck field */
  def deck_(new_deck: List[Card]): Unit = {
    _deck = new_deck
  }

  /** Setter for the _hand field */
  def hand_(new_hand: List[Card]): Unit = {
    _hand = new_hand
  }

  /** Take the first card in the deck and adds it to the hand. */
  def drawCard(): Card = {
    val card = _deck.head
    _deck = _deck.tail
    _hand = card :: _hand
    card
  }

  /** Shuffles the deck. */
  def shuffleDeck(): Unit = {
    _deck = scala.util.Random.shuffle(_deck)
  }
}
