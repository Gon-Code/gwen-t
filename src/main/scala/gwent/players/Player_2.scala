package cl.uchile.dcc
package gwent.players

import gwent.cards.{Card, MeleCard, RangedCard, SiegeCard, WeatherCard}

import cl.uchile.dcc.gwent.board.Board

/** Player_2 is the class that represents the second player of the game
 *
 * The Player class has the methods play and draw which ensures the game can develop.
 *
 *
 * @param name The name of the player.
 * @param gem The amount of gems the player has . When this parameter is equal to 0, is because this player has lost the game.
 * @param deck Represents the cards that are in the deck.
 * @param hand Represents the cards the player has in hand.
 *
 * @constructor Creates a new player with the specified name,gem,_deck and _hand.
 *
 */
class Player_2 (val name:String , val gem :Int, private var deck : List[Card],private var hand : List[Card]) {
  /** Accessor method for the player's deck */
  def getDeck: List[Card] = deck

  /** Accessor method for the player's hand */
  def getHand: List[Card] = hand

  /** The current gem count of the player, when the var currentGem is equal to zero, the game is over */
  var currentGem : Int = gem

  /** The gem count can't be lower than zero */
  if(currentGem < 0) currentGem = 0

  /** Take the first card in the deck and adds it to the hand. */
  def drawCard(): Card = {
    val card = deck.head
    deck = deck.tail
    hand = card :: hand
    card
  }
  /** Shuffles the deck. */
  def shuffleDeck(): Unit = {
    deck = scala.util.Random.shuffle(deck)
  }
  /** Dispatch the cards to their respective zones
   * There one method play for each type card . The method play also takes out the card played from the hand an puts it on the board.
   * @param x Is the card that will be played on the board
   * @param board Is the board where the card x will be played
   */
  def play(x : MeleCard,board: Board):Unit={
    val newHand: List[Card] = hand.dropWhile(_.name == x.name).headOption.toList ++ hand.dropWhile(_.name == x.name).tail
    hand = newHand
    x.play_player_2(this,board)
  }

  def play(x : RangedCard,board: Board): Unit={
    val newHand: List[Card] = hand.dropWhile(_.name == x.name).headOption.toList ++ hand.dropWhile(_.name == x.name).tail
    hand = newHand
    x.play_player_2(this,board)
  }

  def play(x:SiegeCard,board: Board) : Unit = {
    val newHand: List[Card] = hand.dropWhile(_.name == x.name).headOption.toList ++ hand.dropWhile(_.name == x.name).tail
    hand = newHand
    x.play_player_2(this,board)
  }

  def play(x: WeatherCard , board: Board) : Unit = {
    val newHand: List[Card] = hand.dropWhile(_.name == x.name).headOption.toList ++ hand.dropWhile(_.name == x.name).tail
    hand = newHand
    x.play_player_2(this,board)
  }
}



