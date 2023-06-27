package cl.uchile.dcc
package gwent

import gwent.cards.*
import gwent.board.Board
import gwent.players.{Player_1, Player_2}
import munit.FunSuite

/** A testing class for the Player class
 *
 *
 */
class Player_1Test extends FunSuite {
  val gem_count: Int = -3
  val Archer = new RangedCard("Archer", "A woman with a bow", 4)
  val Destroyer =  new MeleCard("Destroyer","The destroyer of worlds",7)
  val deck_cards: List[Card] = List(Archer,Destroyer)
  val hand_cards: List[Card] = List(Archer)
  var board: Board = _
  var Player: Player_1 = _

  override def beforeEach(context: BeforeEach): Unit = {
    Player = new Player_1("Gonzalo", gem_count, deck_cards, hand_cards)
    board = new Board()
  }

  test("Mi first player one") {
    assertEquals(Player.name, "Gonzalo")
  }
  test("A player gem count can´t take a negative value") {
    val gem: Int = Player.gem
    Player.gem_(gem)
    assertEquals(Player.gem, 0)
  }

  test("After drawing a card, the deck has 1 card less") {
    val deck_count = Player.getDeck.size
    Player.drawCard()
    assertEquals(Player.getDeck.size, deck_count - 1)
  }

  test("After drawing a card, the hand has 1 card more") {
    val hand_count = Player.getHand.size
    Player.drawCard()
    assertEquals(Player.getHand.size, hand_count + 1)
  }
  test("After shuffling, the deck has the same amount of cards") {
    val deck_count = Player.getDeck.size
    Player.shuffleDeck()
    assertEquals(Player.getDeck.size, deck_count)
  }
  test("We can refresh the cards in the hand") {
    val hand_count: Int = Player.getHand.size
    Player.play(Archer, board)
    assertEquals(Player.getHand.size, hand_count - 1)
  }
}



