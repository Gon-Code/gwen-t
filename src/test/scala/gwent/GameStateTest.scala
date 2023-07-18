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
}
