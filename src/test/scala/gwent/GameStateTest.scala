package cl.uchile.dcc
package gwent

import gwent.controller.*
import munit.FunSuite

class GameStateTest extends FunSuite{
  var GameState : GameState = _

  override def beforeEach(context: BeforeEach): Unit = {
    GameState = new GameState(new GameController())
  }

  test("Changing the context of the Game State"){
    val context : GameController = GameState.getContext
    val new_context : GameController = new GameController()
    GameState.SetContext(new_context)
    assertNotEquals(context,new_context)
  }

  test("Invalid transition to MainPhase_1"){
    intercept[Exception]{
      GameState.toMainPhase_1()
    }
  }
  test("Invalid transition to MainPhase_2") {
    intercept[Exception] {
      GameState.toMainPhase_2()
    }
  }
  test("Invalid transition to Final Phase") {
    intercept[Exception] {
      GameState.toFinalPhase()
    }
  }
  test("Invalid transition to Battle Phase") {
    intercept[Exception] {
      GameState.toBattlePhase()
    }
  }
  test("Invalid transition to Draw Phase") {
    intercept[Exception] {
      GameState.toDrawPhase()
    }
  }
}
