package cl.uchile.dcc
package gwent.cards


import gwent.board.Board
import math.max
import gwent.players.{Player_1,Player_2}
import scala.::

/** MeleCard is a type of card that represents the mele troop cards.
 *
 * @param name The name of the Mele Card.
 * @param description The description in english of the Mele Card, It explains its function.
 * @param _power The number that represents the power or attack value of the card.
 * @constructor Creates a new Mele Card with the specified name, description and power.
 * @see Card
 */
class MeleCard(name: String, description: String , _power: Int) extends AbstractCard (name, description, _power){
  
  /**Auxiliary constructor for the class
   * Now the user can create a Mele Card without a name */
  def this(name: String, _power:Int)={
    this(name,"This card has no description",_power)
  }
  override def play_player_1(player:Player_1,board: Board):Unit={
    board.MeleZone_1 = board.MeleZone_1 :+ this
  }
  override def play_player_2(player: Player_2,board:Board):Unit={
    board.MeleZone_2 = board.MeleZone_2 :+ this
  }
}
