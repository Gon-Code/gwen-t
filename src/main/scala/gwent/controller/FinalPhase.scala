package cl.uchile.dcc
package gwent.controller

class FinalPhase(context: GameController) extends GameState (context){

  override def toBattlePhase(): Unit = {
    context.state = new BattlePhase(context)
  }
}
