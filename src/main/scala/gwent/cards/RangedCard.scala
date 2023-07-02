package cl.uchile.dcc
package gwent.cards

import gwent.board.Board
import gwent.players.{Player_1, Player_2}
import scala.::

/** RangeCard is a type of card that represents the ranged troop cards.
 *
 * The Range Card is a type of troop card. Each player can played Range Cards in their own side of the board, more specifically
 * in the Range Card Zone.
 *
 * @param name The name of the Range Card.
 * @param description The description in english of the Ranged Card, It explains its function.
 * @param _power The number that represents the power or attack value of the card.
 * @constructor Creates a new Ranged Card with the specified name, description and power.
 * @see Card
 */
class RangedCard(name:String , description : String , _power : Int) extends AbstractCard (name, description, _power) {

  /** Auxiliary constructor for the class
   * Now the user can create a Ranged Card without a name */
  def this(name: String, _power: Int) = {
    this(name, "This card has no description", _power)
  }

  override def playto(player: Player_1, board: Board): Unit = {
    board.RangedZone_1 = board.RangedZone_1 :+ this
  }

  override def playto(player: Player_2, board: Board): Unit = {
    board.RangedZone_2 = board.RangedZone_2 :+ this
  }
}


