package cl.uchile.dcc
package gwent

import gwent.controller.*
import munit.FunSuite

class GameControllerTest extends FunSuite{
  var controller : GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController()
  }

  test("Creating our first game with the GameController"){
    //In this case we use "Gonzalo" and "Satoru Geto" but it could be any string input from the user
    controller.StartGame("Gonzalo","Satoru Geto")
    assertEquals(controller.players.size, 2)
    assertEquals(controller.turnsQueue.size,2)
  }

  test("Invalid transition to MainPhase_2"){
    intercept[Exception]{
      controller.MainPhase_2()
    }
  }

  test("Invalid transition to FinalPhase"){
    intercept[Exception]{
      controller.FinalPhase()
    }
  }

  test("Invalid transition to DrawPhase"){
    intercept[Exception]{
      controller.DrawPhase()
    }
  }
  test("Invalid transition to BattlePhase"){
    intercept[Exception]{
      controller.BattlePhase()
    }
  }
  test("Transition to MainPhase_1 works properly"){
    controller.MainPhase_1()
  }
}
