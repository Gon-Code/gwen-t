package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable
import gwent.players.*


class DrawPhase (context : GameController) extends GameState(context) {
  override def toMainPhase_1(): Unit = {
    //Cards are drawn from to deck to the hands of the players
    //NEITHER PLAYER PLAYS A CARD, THIS IS JUST THE DRAW PHASE :D
    var player_1 : Player = context.turnsQueue.dequeue()
    var player_2 : Player = context.turnsQueue.dequeue()
    player_1.shuffleDeck()
    player_2.shuffleDeck()
    player_1.drawCard()
    player_2.drawCard()
    player_1.drawCard()
    player_2.drawCard()
    context.turnsQueue.enqueue(player_1)
    context.turnsQueue.enqueue(player_2)
    context.state = new MainPhase_1(context)
  }
}