package cl.uchile.dcc
package gwent.controller

class MainPhase_1 (context : GameController) extends GameState (context){

  override def toMainPhase_2():Unit={
    //Player can play 1 card or pass
    context.state = new MainPhase_2(context)
  }
  override def toFinalPhase() : Unit = {
      context.state = new FinalPhase(context)
  }

}
