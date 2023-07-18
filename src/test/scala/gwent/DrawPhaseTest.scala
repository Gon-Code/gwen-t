package cl.uchile.dcc
package gwent

import gwent.controller.*
import munit.FunSuite

class DrawPhaseTest extends FunSuite{
  var controller : GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController()
  }

  test("Drawing cards for both players"){
    controller.StartGame("Gonzalo","Satoru Geto")
    // Both players start with the same deck hence both have the same length
    val deck_size : Int = controller.turnsQueue.front.getDeck.size
    controller.state.toMainPhase_1()
    assertEquals(controller.turnsQueue.front.getDeck.size,deck_size-2)

  }
}
