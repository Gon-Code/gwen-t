package cl.uchile.dcc
package gwent.cards

import math.max
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

abstract class AbstractCard (val name: String, val description: String, protected var _power: Int) extends Card {
    
    
    /** The current power of the card, which may be affected by various conditions during
     * gameplay.
     * Initially set to the base [[power]] of the card.
     */
    def currentPower: Int = _power

    /** Setter for the power field 
     * If the power of the card is affected by other cards, we ensure that the current power can't be lower than zero 
     */
    def power_(newPower: Int): Unit = {
        _power = math.max(0,newPower)
    }
    
    /** This method allows the double dispatch between players and cards
     * If a class player 1 plays a card we use this method */
    def play_player_1(player:Player_1 , board: Board) : Unit={
        
    }

    /** This method allows the double dispatch between players and cards
     * If a class player 2 plays a card we use this method */
    def play_player_2(player : Player_2 , board: Board) : Unit={
      
  }
    /** This method allows the cards to use their own effects on the field
     * Not all the cards has effect, this has to be implemented */
    def effect():Unit={

    }
  
}