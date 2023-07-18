package cl.uchile.dcc
package gwent.players

import gwent.board.{Board}
import gwent.cards.{Card, MeleCard, RangedCard, SiegeCard, WeatherCard}

/** An interface that will define the different players that can play the game
 * 
 */

trait Player {

  /** The fields of the Player interface */
  val name: String
  protected var _gem: Int
  protected var _deck: List[Card]
  protected var _hand: List[Card]

  /** Accessor method for the player's deck */
  def getDeck: List[Card] 

  /** Accessor method for the player's hand */
  def getHand: List[Card] 

  /** Accessor method fot he player's gem count */
  def gem: Int 
  /** The play method will allow to double dispatch the cards into
   *  their respective zones */
  def play(player:Player,card:Card,board: Board):Unit

  /** Setter for the _gem field
   * The gem count can't be lower than zero */
  def gem_(newGem: Int):Unit

  /** Setter for the _deck field */
  def deck_(new_deck: List[Card]):Unit

  /** Setter for the _hand field */
  def hand_(new_hand: List[Card]):Unit

  /** Take the first card in the deck and adds it to the hand. */
  def drawCard():Card

  /** Shuffles the deck. */
  def shuffleDeck():Unit
}
