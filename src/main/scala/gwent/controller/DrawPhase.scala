package cl.uchile.dcc
package gwent.controller

class DrawPhase(context : GameController) extends GameState(context) {
  override def toMainPhase_1(): Unit = {
      context.state = new MainPhase_1(context)
  }
}