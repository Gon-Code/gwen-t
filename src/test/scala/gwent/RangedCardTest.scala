package cl.uchile.dcc
package gwent

import gwent.cards.RangedCard
import munit.FunSuite

/** A testing class for the Ranged troop Cards
 *
 */

class RangedCardTest extends FunSuite {
  val ranged : RangedCard = new RangedCard("Sorceress","Im dying",-5)

  test("A ranged card can't have an attack value less than zero"){
    assertEquals(ranged.currentPower,0)
  }

}
