package cl.uchile.dcc
package gwent

import gwent.cards.{Card, MeleCard, SiegeCard}

import cl.uchile.dcc.gwent.board.Board
import cl.uchile.dcc.gwent.players.{Player_1, Player_2}
import munit.FunSuite

class SiegeCardTest extends FunSuite {
  val siege : SiegeCard = new SiegeCard("Catapult","No troop can be safe",-1)
  val gem_count: Int = 2
  val Satoru_Geto: MeleCard = new MeleCard("Satoru Geto", 10)
  val hand_cards: List[Card] = List(siege, Satoru_Geto)
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
  test("A Troop card can't have an attack value less than zero") {
    val actual_power: Int = siege.currentPower
    siege.power_(actual_power)
    assertEquals(siege.currentPower, 0)
  }
  test("Player 1 plays the 'siege' card which is a Siege Card") {
    siege.play_player_1(Player1, board)
    assertEquals(board.SiegeZone_1.size, 1)
  }

  test("Player 2 plays the 'siege' card which is a Siege Card ") {
    siege.play_player_2(Player2, board)
    assertEquals(board.SiegeZone_2.size, 1)
  }
}
