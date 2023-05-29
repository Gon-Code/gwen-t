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
 * @param power The number that represents the power or attack value of the card.
 * @constructor Creates a new Ranged Card with the specified name, description and power.
 * @see Card
 */
class RangedCard(name:String , description : String , power : Int) extends AbstractCard (name, description, power) {

  /** If the power of the card is affected by other cards, we ensure that the current power can't be lower than zero */
  if (currentPower < 0) currentPower = 0

  override def play_player_1(player: Player_1, board: Board): Unit = {
    board.RangedZone_1 = board.RangedZone_1 :+ this
  }

  override def play_player_2(player: Player_2, board: Board): Unit = {
    board.RangedZone_2 = board.RangedZone_2 :+ this
  }
}


