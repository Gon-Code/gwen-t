package cl.uchile.dcc
package gwent

import gwent.controller.*
import munit.FunSuite
class FinalPhaseTest extends FunSuite{
  var controller : GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
  }

  test("Valid transition to Battle Phase"){
    controller.StartGame("Gonzalo","Satoru Geto")
    controller.state.toMainPhase_1()
    controller.state.toMainPhase_2()
    controller.state.toFinalPhase()
    controller.state.toBattlePhase()
  }
}
