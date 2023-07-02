package cl.uchile.dcc
package gwent

import gwent.cards.{Card, MeleCard, WeatherCard}

import cl.uchile.dcc.gwent.board.Board
import cl.uchile.dcc.gwent.players.{Player_1, Player_2}
import munit.FunSuite

/** A testing class for the Weather Cards 
 * 
 */

class WeatherCardTest extends FunSuite {
  val weather : WeatherCard = new WeatherCard("Storm","Reduce the attack of all the troops by 2")
  val gem_count: Int = 2
  val Satoru_Geto: MeleCard = new MeleCard("Satoru Geto", 10)
  val hand_cards: List[Card] = List(weather, Satoru_Geto)
  val deck_cards: List[Card] = List()
  var board: Board = _
  var Player1: Player_1 = _
  var Player2: Player_2 = _

  override def beforeEach(context: BeforeEach): Unit = {
    Player1 = new Player_1("Gonzalo", gem_count, deck_cards, hand_cards)
    Player2 = new Player_2("Javier", gem_count, deck_cards, hand_cards)
    board = new Board()

  }
  test("We can create Weather Cards"){
    assertEquals(weather.name,"Storm")
    assertEquals(weather.description,"Reduce the attack of all the troops by 2")
  }
  test("Player 1 plays the 'weather' card which is a Weather Card") {
    Player1.play(Player1,weather,board)
    assertEquals(board.WeatherZone.size, 1)
  }

  test("Player 2 plays the 'weather' card which is a Weather Card ") {
    Player2.play(Player2,weather,board)
    assertEquals(board.WeatherZone.size, 1)
  }

}
