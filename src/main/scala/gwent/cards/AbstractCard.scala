package cl.uchile.dcc
package gwent.cards
import gwent.board.Board
import gwent.players.{Player_1, Player_2}

/** An abstract class representing the troop cards.
 *
 * AbstractCard is an abstract class that represents the troop cards with a name, description and power.
 * 
 * @constructor Creates a new Card with the given name, description and power.
 *              
 * @see Card             
 */

abstract class AbstractCard protected(val name: String, val description: String, val power: Int) extends Card {

    /** The current power of the card, which may be affected by various conditions during
     * gameplay.
     * Initially set to the base [[power]] of the card.
     */
    var currentPower: Int = power

    def play_player_1(player:Player_1 , board: Board) : Unit={
        
    }
    def play_player_2(player : Player_2 , board: Board) : Unit={
      
  }
  
}