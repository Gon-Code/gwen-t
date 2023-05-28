package cl.uchile.dcc
package gwent

import gwent.cards.MeleCard
import munit.FunSuite

/** A testing class for the Mele troop Cards
 *
 */

class MeleCardTest extends FunSuite {
  val mele : MeleCard = new MeleCard("Nobunaga","pega no tan fuerte",-2)

  test("A Troop card can't have an attack value less than zero"){
    assertEquals(mele.currentPower,0)
  }


}
