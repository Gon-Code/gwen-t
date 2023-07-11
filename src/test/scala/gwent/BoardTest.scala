package cl.uchile.dcc
package gwent

import gwent.cards.{Card, MeleCard, RangedCard, SiegeCard,WeatherCard}
import gwent.board.Board
import gwent.players.{Player_2,Player_1}
import munit.FunSuite

/** A testing class for the Board Class
 *
 */

class BoardTest extends FunSuite {

  val gem_count: Int = -3
  val Gon = new MeleCard("Gon","A professional hunter, but he is still a kid",7)
  val Archer = new RangedCard("Archer", "A woman with a bow", 2)
  val Catapult = new SiegeCard("Catapult","No one is safe",4)
  val Storm = new WeatherCard("Storm","Is raining")
  val deck_cards: List[Card] = List(Archer,Archer,Gon,Catapult)
  val hand_cards: List[Card] = List(Archer,Gon,Catapult)
  var player_1: Player_1 = _
  var player_2 : Player_2 = _
  var board : Board = _

  override def beforeEach(context: BeforeEach): Unit = {
    player_1 = new Player_1("Gonzalo", gem_count, deck_cards, hand_cards)
    player_2 = new Player_2("Javier", gem_count, deck_cards, hand_cards)
    board = new Board()
  }
  test("A class is created with 5 optional parameters"){
    assertEquals(board.MeleZone_1.size,0)
    assertEquals(board.RangedZone_1.size,0)
    assertEquals(board.SiegeZone_1.size,0)
    assertEquals(board.MeleZone_2.size,0)
    assertEquals(board.RangedZone_2.size,0)
    assertEquals(board.SiegeZone_2.size,0)
    assertEquals(board.WeatherZone.size,0)
  }

  test("If player_1 plays a Mele Card, the Mele Card is going to the mele zone 1"){
    player_1.play(player_1,Gon,board)
    assertEquals(board.MeleZone_1.size, 1)
    assertEquals(board.MeleZone_1.head,Gon)
  }
  test("If player_1 plays a Ranged Card, the Ranged Card is going to the ranged zone 1") {
    player_1.play(player_1,Archer,board)
    assertEquals(board.RangedZone_1.size, 1)
    assertEquals(board.RangedZone_1.head, Archer)
  }
  test("If player_1 plays a Siege Card, the Siege Card is going to the siege zone 1") {
    player_1.play(player_1,Catapult,board)
    assertEquals(board.SiegeZone_1.size, 1)
    assertEquals(board.SiegeZone_1.head, Catapult)
  }
  test("If player_1 plays a Weather Card, the Weather Card is going to the weather zone") {
    player_1.play(player_1,Storm, board)
    assertEquals(board.WeatherZone.size, 1)
    assertEquals(board.WeatherZone.head, Storm)
  }
  test("If player_2 plays a Mele Card, the Mele Card is going to the mele zone 2") {
    player_2.play(player_2,Gon,board)
    assertEquals(board.MeleZone_2.size, 1)
    assertEquals(board.MeleZone_2.head, Gon)
  }
  test("If player_2 plays a Ranged Card, the Ranged Card is going to the ranged zone 2") {
    player_2.play(player_2,Archer,board)
    assertEquals(board.RangedZone_2.size, 1)
    assertEquals(board.RangedZone_2.head, Archer)
  }
  test("If player_2 plays a Siege Card, the Siege Card is going to the siege zone 2") {
    player_2.play(player_2,Catapult,board)
    assertEquals(board.SiegeZone_2.size, 1)
    assertEquals(board.SiegeZone_2.head, Catapult)
  }
  test("If player_2 plays a Weather Card, the Weather Card is going to the weather zone") {
    player_2.play(player_2,Storm, board)
    assertEquals(board.WeatherZone.size, 1)
    assertEquals(board.WeatherZone.head, Storm)
  }
}
