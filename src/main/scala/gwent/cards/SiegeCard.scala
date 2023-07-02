package cl.uchile.dcc
package gwent.cards

import gwent.board.Board
import gwent.players.{Player_1, Player_2}

/** SiegeCard is a type of card that represents the siege troop cards.
 *
 * The Siege Card is a type of troop card . Each player can played Siege Cards in their own side of the board, more specifically
 * in the Siege Card Zone.
 *
 * @param name The name of the Siege Card.
 * @param description The description in english of the Siege Card, It explains its function.
 * @param _power The number that represents the power or attack value of the card.
 * @constructor Creates a new Weather Card with the specified name and description.
 * @see Card
 */
class SiegeCard (name : String , description : String ,_power : Int) extends AbstractCard (name, description, _power) {

  /** Auxiliary constructor for the class
   * Now the user can create a Siege Card without a name */
  def this(name: String, _power: Int) = {
    this(name, "This card has no description", _power)
  }

  override def playto(player: Player_1, board: Board): Unit = {
    board.SiegeZone_1 = board.SiegeZone_1 :+ this
  }

  override def playto(player: Player_2, board: Board): Unit = {
    board.SiegeZone_2 = board.SiegeZone_2 :+ this
  }
}
