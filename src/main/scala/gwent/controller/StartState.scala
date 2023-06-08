package cl.uchile.dcc
package gwent.controller

class StartState(controller: GameController) extends GameState {
  override def startGame(): Unit = {
    /* ... */
    controller.state = new /* ... */
  }

  override def playCard(card: Card): Unit = {
    /* ... */
    controller.state = new /* ... */
  }

  override def endTurn(): Unit = {
    /* ... */
    controller.state = new /* ... */
  }
}
