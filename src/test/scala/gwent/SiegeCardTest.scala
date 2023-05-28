package cl.uchile.dcc
package gwent

import gwent.cards.SiegeCard
import munit.FunSuite

class SiegeCardTest extends FunSuite {
  val siege : SiegeCard = new SiegeCard("Catapult","No troop can be safe",-1)

  test("A siege card can't have an attack value less than zero"){
    assertEquals(siege.currentPower,0)
  }

}
