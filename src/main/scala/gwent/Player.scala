package cl.uchile.dcc
package gwent

import gwent.cards.Card

/** Player is the class that represents the players of the game.
 *
 * The Player class has the methods play and draw which ensures the game can develop.
 *
 *
 * @param name The name of the player.
 * @param gem The amount of gems the player has . When this parameter is equal to 0, is because this player has lost the game.
 * @param _deck Represents the cards that are in the deck.
 * @param _hand Represents the cards the player has in hand.
 *
 * @constructor Creates a new player with the specified name,gem,_deck and _hand.
 *
 *
 *
 */
class Player (val name:String , val gem :Int, private var _deck : List[Card],private var _hand : List[Card]) {

  /** Accessor method for the player's deck */
  private def deck: List[Card] = _deck

  /** Accessor method for the player's hand */
  private def hand: List[Card] = _hand

  /** Take the first card in the _deck and adds it to the _hand. */
  def drawCard(): Card = {
    val card = deck.head
    _deck = deck.tail
    _hand = card :: hand
    card
  }
/** Shuffles the deck. */
  def shuffleDeck(): Unit = {
    _deck = scala.util.Random.shuffle(_deck)
  }

}



