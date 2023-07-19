package cl.uchile.dcc
package gwent.controller

import gwent.players.*

/** A class representing the Battle Phase of the game. In this phase, both players have already
 * play his board in his last main phase, so now is the turn to count the total damage for each 
 * player and determine who is the winner of this round */
class BattlePhase (context : GameController) extends GameState (context){

  override def toMainPhase_1(): Unit = {
    
    context.state = new MainPhase_1(context)
  }

  
}
