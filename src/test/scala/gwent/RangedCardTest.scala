package cl.uchile.dcc
package gwent

import gwent.cards.{Card, MeleCard, RangedCard}
import cl.uchile.dcc.gwent.board.Board
import cl.uchile.dcc.gwent.players.{Player_1, Player_2}
import munit.FunSuite

/** A testing class for the Ranged troop Cards
 *
 */

class RangedCardTest extends FunSuite {
  val ranged : RangedCard = new RangedCard("Sorceress","Im dying",-5)
  val Satoru_Geto: RangedCard = new RangedCard("Satoru Geto", 10)
  val gem_count: Int = 2
  val hand_cards: List[Card] = List(ranged, Satoru_Geto)
  val deck_cards: List[Card] = List()
  val board: Board = new Board()
  var Player1: Player_1 = _
  var Player2: Player_2 = _

  override def beforeEach(context: BeforeEach): Unit = {
    Player1 = new Player_1("Gonzalo", gem_count, deck_cards, hand_cards)
    Player2 = new Player_2("Javier", gem_count, deck_cards, hand_cards)
  }
  test("A card can have no description") {
    assertEquals(Satoru_Geto.description, "This card has no description")
  }
  test("A ranged card can't have an attack value less than zero"){
    val actual_power: Int = ranged.currentPower
    ranged.power_(actual_power)
    assertEquals(ranged.currentPower,0)
  }
  test("Player 1 plays the 'ranged' card which is a Ranged Card") {
    Player1.play(Player1,Satoru_Geto,board)
    assertEquals(board.RangedZone_1.size, 1)
  }

  test("Player 2 plays the 'ranged' card which is a Ranged Card ") {
    Player2.play(Player2,ranged,board)
    assertEquals(board.RangedZone_2.size, 1)
  }
}
