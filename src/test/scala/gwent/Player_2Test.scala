package cl.uchile.dcc
package gwent

import gwent.cards.RangedCard
import gwent.players.{Player_1, Player_2}
import munit.FunSuite

/** A testing class for the Player_2 class
 *
 *
 */
class Player_2Test extends FunSuite {
  val gem_count: Int = -3
  val Archer = new RangedCard("Archer","A woman with a bow",4)
  val deck_cards : List[RangedCard] = List.fill(24)(Archer)
  val hand_cards : List[RangedCard] = List.fill(5)(Archer)
  var Player : Player_2 = _
  override def beforeEach(context:BeforeEach): Unit = {
    Player = new Player_2("Gonzalo", gem_count, deck_cards,hand_cards)
  }

  test("Mi first player two") {
    assertEquals(Player.name, "Gonzalo")
  }
  test("A player gem count can´t take a negative value") {
    val gem: Int = Player.gem
    Player.gem_(gem)
    assertEquals(Player.gem, 0)
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

  test("We can add cards manually to the hand") {
    val hand_count: Int = Player.getHand.size
    Player.hand_(Archer)
    assertEquals(Player.getHand.size, hand_count + 1)
  }
  test("We can add cards manually to the deck") {
    val deck_count: Int = Player.getDeck.size
    Player.deck_(Archer)
    assertEquals(Player.getDeck.size, deck_count + 1)
  }
}


