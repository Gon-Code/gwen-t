package cl.uchile.dcc
package gwent.controller

class MainPhase_2 (context: GameController) extends GameState (context){
  
  override def toMainPhase_1():Unit={
    context.state = new MainPhase_1(context)
  }
  override def toFinalPhase(): Unit = {
    context.state = new FinalPhase(context)
  }
}
