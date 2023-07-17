package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable
import gwent.players.*
import gwent.cards.*

/** The GameController class will help us to initialize and control the flow of the game
 * It has 2 methods, both were made to start the game */
class GameController {

  /** Represents the players in the current game*/
  var players: List[Player] = List.empty
  /** Represents the turns,i.e, which player turn is it */
  var turnsQueue: mutable.Queue[Player] = mutable.Queue.empty
  /** Represents the actual state of the game */
  var state: GameState = new MainPhase_1(this)

  /** addPlayer creates 2 players with given decks */
  def addPlayer(deck_1 : List[Card],deck_2 : List[Card]) : Unit = {
    println("Enter the name of the player 1")
    val name_1 : String = scala.io.StdIn.readLine()
    println("Enter the name of the player 2")
    val name_2 : String = scala.io.StdIn.readLine()
    val player_1 : Player_1 = new Player_1(name_1,2,deck_1,List.empty)
    val player_2 : Player_2 = new Player_2(name_2,2,deck_2,List.empty)
    players :+ player_1
    players :+ player_2
    turnsQueue = mutable.Queue(player_1,player_2)
  }
  /** Method to Initialize the game, It adds players to the list and starts the first
   * phase of the game, the Draw Phase , more detail in the readme.md */
  def StartGame() :  Unit = {
    // We create 2 decks , one for each player
    val mele : MeleCard = new MeleCard("Geto",4)
    val range : RangedCard = new RangedCard("Archer",3)
    val siege : SiegeCard = new SiegeCard("Catapult",3)
    val mele_2: MeleCard = new MeleCard("Geto", 3)
    val range_2: RangedCard = new RangedCard("Archer", 3)
    val siege_2: SiegeCard = new SiegeCard("Catapult", 3)
    val weather : WeatherCard = new WeatherCard("Storm","Niun daño")
    val deck_1 : List[Card] = List(mele,range,siege,weather)
    val deck_2 : List[Card] = List(mele_2,range_2,siege_2,weather)
    addPlayer(deck_1, deck_2)
  }
  def MainPhase_1(): Unit = {
    state.toMainPhase_1()
  }
  def MainPhase_2(): Unit = {
    state.toMainPhase_2()
  }
  def FinalPhase() : Unit = {
    state.toFinalPhase()
  }
  def BattlePhase(): Unit = {
    state.toBattlePhase()
  }
}
