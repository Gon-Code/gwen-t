package cl.uchile.dcc
package gwent.players

import gwent.board.Board
import gwent.cards.{Card, MeleCard, RangedCard, SiegeCard, WeatherCard}

/** An interface that will define the different players that can play the game
 *
 *
 *
 *
 *
 *
 */

trait Player {

  val name : String
  val gem : Int
  protected var deck : List[Card]
  protected var hand : List[Card]

  /** Accessor method for the player's deck */
  def getDeck: List[Card] = deck

  /** Accessor method for the player's hand */
  def getHand: List[Card] = hand

  /** The current gem count of the player, when the var currentGem is equal to zero, the game is over */
  var currentGem: Int = gem

  /** The gem count can't be lower than zero */
  if (currentGem < 0) currentGem = 0

  /** Take the first card in the deck and adds it to the hand. */
  def drawCard(): Card

  /** Shuffles the deck. */
  def shuffleDeck(): Unit

  /** The followed method will play each card in their respective zone of the board
   * We have to add that the methods will be override for each subclass of the Trait Player
   */
  def play(player: Player,board: Board) : Unit = ???

}
