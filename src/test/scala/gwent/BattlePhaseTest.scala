package cl.uchile.dcc
package gwent

import munit.FunSuite
import gwent.controller.*
class BattlePhaseTest extends FunSuite {
  var controller : GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController()
  }

  test("Valid transition to Main Phase 1"){
    controller.StartGame("Gonzalo","Satoru Geto")
    controller.state.toMainPhase_1()
    controller.state.toMainPhase_2()
    controller.state.toFinalPhase()
    controller.state.toBattlePhase()
    controller.state.toMainPhase_1()
  }

}
