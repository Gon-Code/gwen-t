package cl.uchile.dcc
package gwent.controller

import scala.collection.mutable
import gwent.players.*
import gwent.cards.*
import gwent.board.*

/** The GameController class will help us to initialize and control the flow of the game
 * It has 2 methods, both were made to start the game */
class GameController {

  /** Represents the players in the current game*/
  var players: List[Player] = List()
  /** Represents the board of the game */
  var board : Board = new Board()
  /** Represents the turns,i.e, which player turn is it */
  var turnsQueue: mutable.Queue[Player] = mutable.Queue()
  /** Represents the actual state of the game */
  var state: GameState = new DrawPhase(this)
      
  /** addPlayer creates 2 players with given decks */
  private def addPlayer(deck_1 : List[Card], deck_2 : List[Card], name_1 : String, name_2 : String) : Unit = {

                                    
    val player_1 : Player_1 = new Player_1(name_1,2,deck_1,List.empty)
    val player_2 : Player_2 = new Player_2(name_2,2,deck_2,List.empty)
    players = players :+ player_1
    players = players :+ player_2
    turnsQueue = mutable.Queue(player_1,player_2)
  }
  /** Method to Initialize the game, It adds players to the list and starts the first
   * phase of the game, the Draw Phase , more detail in the readme.md */
  def StartGame(name_1 : String , name_2 : String) :  Unit = {
    // We create 2 decks , one for each player
    val mele: MeleCard = new MeleCard("Geto", 4)
    val range: RangedCard = new RangedCard("Archer", 2)
    val siege: SiegeCard = new SiegeCard("Catapult", 3)
    val mele_2: MeleCard = new MeleCard("Geto", 3)
    val range_2: RangedCard = new RangedCard("Archer", 5)
    val siege_2: SiegeCard = new SiegeCard("Catapult", 3)
    val weather: WeatherCard = new WeatherCard("Storm", "No Damage")
    val deck_1: List[Card] = List(mele,mele_2, range,range_2, siege,siege_2, weather)
    val deck_2: List[Card] = List(mele,mele_2,range, range_2,siege, siege_2, weather)
    addPlayer(deck_1,deck_2,name_1,name_2)
  }
  def DrawPhase() : Unit = {
    state.toDrawPhase()}
  def MainPhase_1(): Unit = {
    state.toMainPhase_1()}
  def MainPhase_2(): Unit = {
    state.toMainPhase_2()}
  def FinalPhase() : Unit = {
    state.toFinalPhase()}
  def BattlePhase(): Unit = {
    state.toBattlePhase()}}
