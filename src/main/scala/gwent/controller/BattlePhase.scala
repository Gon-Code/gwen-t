package cl.uchile.dcc
package gwent.controller

import gwent.players.*

class BattlePhase (context : GameController) extends GameState (context){

  override def toMainPhase_1(): Unit = {
    context.state = new MainPhase_1(context)
  }

  
}
