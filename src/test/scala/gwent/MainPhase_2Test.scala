package cl.uchile.dcc
package gwent

import gwent.controller.*
import munit.FunSuite
class MainPhase_2Test extends FunSuite {
  var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController()
  }

  test("Transition to the Main Phase 1 is valid") {
    controller.StartGame("Gonzalo", "Satoru Geto")
    //DrawPhase
    controller.state.toMainPhase_1()
    //Main Phase 2
    controller.state.toMainPhase_2()
    controller.state.toMainPhase_1()
  }

  test("Transition to the Final Phase is valid") {
    controller.StartGame("Gonzalo", "Satoru Geto")
    controller.state.toMainPhase_1()
    controller.state.toMainPhase_2()
    controller.state.toFinalPhase()
  }
}
