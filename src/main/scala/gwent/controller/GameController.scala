package cl.uchile.dcc
package gwent.controller

class GameController {
  // Estado actual del juego
  var state: GameState = new StartState(this)

  def startGame(): Unit = {
    state.startGame()
    /* ... */
  }

  def playCard(card: Card): Unit = {
    /* ... */
  }

  def endTurn(): Unit = {
    /* ... */
  }
}




