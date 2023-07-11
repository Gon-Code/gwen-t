package cl.uchile.dcc
package gwent.players


import gwent.board.Board
import gwent.cards.*
import math.max

/** Player_1 is the class that represents the first player of the game.
 *
 * The Player class has the methods play and draw which ensures the game can develop.
 *
 *
 * @param name The name of the player.
 * @param _gem The amount of gems the player has . When this parameter is equal to 0, is because this player has lost the game.
 * @param _deck Represents the cards that are in the deck.
 * @param _hand Represents the cards the player has in hand.
 *
 * @constructor Creates a new player with the specified name,gem,_deck and _hand.
 *
 */
class Player_1 ( name: String , _gem :Int, _deck : List[Card], _hand : List[Card]) extends AbstractPlayer(name, _gem, _deck, _hand){

  /** The play method will play a card to their respective zone, the result will be determined
   * by the player and the card */
  override def play(player:Player,card:Card,board: Board):Unit={
    val newHand: List[Card] = getHand.filterNot(_ eq card)
    hand_(newHand)
    card.playto(this,board)
  }
}



