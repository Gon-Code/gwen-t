package cl.uchile.dcc
package gwent

import gwent.cards.MeleCard
import gwent.board.Board
import gwent.cards.Card
import gwent.players.{Player_2,Player_1}
import munit.FunSuite

/** A testing class for the Mele troop Cards
 *
 */

class MeleCardTest extends FunSuite {
  val gem_count : Int = 2
  val mele : MeleCard = new MeleCard("Nobunaga","pega no tan fuerte",-2)
  val Satoru_Geto : MeleCard = new MeleCard("Satoru Geto",10)
  val hand_cards: List[Card] = List(mele, Satoru_Geto)
  val deck_cards: List[Card] = List()
  val board : Board = new Board()
  var Player1 : Player_1 =_
  var Player2 : Player_2 = _
  override def beforeEach(context: BeforeEach): Unit = {
    Player1 = new Player_1("Gonzalo", gem_count, deck_cards, hand_cards)
    Player2 = new Player_2("Javier",gem_count,deck_cards,hand_cards)
  }

  test("A card can have no description"){
    assertEquals(Satoru_Geto.description,"This card has no description")
  }
  test("A Troop card can't have an attack value less than zero"){
    val actual_power : Int = mele.currentPower
    mele.power_(actual_power)
    assertEquals(mele.currentPower,0)
  }

  test("Player 1 plays the 'mele' card which is a Mele Card"){
    mele.play_player_1(Player1,board)
    assertEquals(board.MeleZone_1.size,1)
  }

  test("Player 2 plays the 'mele' card which is a Mele Card "){
    mele.play_player_2(Player2,board)
    assertEquals(board.MeleZone_2.size,1)
  }
}
