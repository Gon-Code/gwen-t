package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable
import gwent.players.*
import gwent.cards.*
class GameController {

  /**
   * Values for the GameController
   */
  val players: List[Player] = List.empty
  val turnsQueue: mutable.Queue[Player] = mutable.Queue.empty
  val state: GameState = new GameState()

  /** Method to add players to the players list */
  def addPlayer(name : String , deck : List[Card]) : Unit = {
    // add players
  }
  /** Method to Initialize the game, It adds players to the list and starts the first
   * phase of the game, the Draw Phase , more detail in the readme.md */
  def StartGame(player : List[Player]) :  Unit = {
    //Añade una lista de jugadores al mazo , solo deben ser 2 !
  }

}
