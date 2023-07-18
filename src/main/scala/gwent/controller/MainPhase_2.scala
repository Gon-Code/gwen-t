package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable

/** In the main phase 1 the player_1 plays his cards */
class MainPhase_2 (context: GameController) extends GameState (context){

  /** When player 2 or no cards , the game moves to the Main Phase 1, where the player 1
   * chooses to play 1 or no cards . */
  override def toMainPhase_1():Unit={
    //Player can play 1 card or pass
    //For simplicity player 1 will just play 1 card
    var player_1 = context.turnsQueue.dequeue()
    var player_2 = context.turnsQueue.dequeue()
    //Here the player 1 chooses a card a play it on the board
    //player_2.play(this,card,context.board)
    context.turnsQueue = mutable.Queue(player_1, player_2)
    context.state = new MainPhase_1(context)
  }
  /** It changes the state of the game to the Final Phase */
  override def toFinalPhase(): Unit = {
    context.state = new FinalPhase(context)
  }
}
