package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable
import gwent.cards.*
import gwent.players.*

class GameController {
  // Current state of the game

  //var state: GameState = new StartState(this)

  private var players = List.empty[Player]
  private val turnsQueue = mutable.Queue.empty[Player]

  /** The method addPlayer allows the controller to add and initialize the players of the game
   * the first player added it will be the Player_1 , and the next one the Player_2 */
  private def addPlayer(name:String, deck : List[Card], hand : List[Card]):Unit={
    // Possible bug when trying to add more than 2 players
    if(players.isEmpty){
      players = players :+ new Player_1(name,2,deck,hand)
    }
    else{
      players = players :+ new Player_2(name,2,deck,hand)
    }
  }
  /** The method startGame initialize the game, creating the players */
  def startGame(players : List[Player]): Unit = {

    //state.startGame()
    /* ... */
  }

  def playCard(card: Card): Unit = {
    /* ... */
  }

  def endTurn(): Unit = {
    /* ... */
  }
}




