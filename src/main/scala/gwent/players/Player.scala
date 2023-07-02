package cl.uchile.dcc
package gwent.players

import gwent.board.Board
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

  /** The play method will allow to double dispatch the cards into
   *  their respective zones */
    def play(player:Player,card:Card,board: Board):Unit
  
}
