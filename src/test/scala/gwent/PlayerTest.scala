package cl.uchile.dcc
package gwent

import gwent.Player
import gwent.cards.RangedCard
import munit.FunSuite

/** A testing class for the Player class
 *
 *
 */
class PlayerTest extends FunSuite {
  val gem_count: Int = -3
  val Archer = new RangedCard("Archer","A woman with a bow",4)
  val deck_cards : List[RangedCard] = List.fill(25)(Archer)
  val hand_cards : List[RangedCard] = List.fill(5)(Archer)
  var Player : Player = _
  override def beforeEach(context:BeforeEach): Unit = {
    Player = new Player("Gonzalo", gem_count, deck_cards,hand_cards)
  }
  test("A player gem count can´t take a negative value"){
    assertEquals(Player.gem, 0)
  }
  test("The players always start with 25 cards in their decks"){
    assertEquals(Player.getDeck.size, 25 )
  }
  test("After drawing a card, the deck has 1 card less"){
    val deck_count = Player.getDeck.size
    Player.drawCard()
    assertEquals(Player.getDeck.size,deck_count-1)
  }
  test("After drawing a card, the hand has 1 card more"){
    val hand_count = Player.getHand.size
    Player.drawCard()
    assertEquals(Player.getHand.size,hand_count+1)
  }
  test("After shuffling, the deck has the same amount of cards"){
    val deck_count = Player.getDeck.size
    Player.shuffleDeck()
    assertEquals(Player.getDeck.size,deck_count)
  }
}


