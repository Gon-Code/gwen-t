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
 * @param deck Represents the cards that are in the deck.
 * @param hand Represents the cards the player has in hand.
 *
 * @constructor Creates a new player with the specified name,gem,_deck and _hand.
 *
 */
class Player (val name:String , var gem :Int, private var deck : List[Card],private var hand : List[Card]) {
  /** Accessor method for the player's deck */
  def getDeck: List[Card] = deck

  /** Accessor method for the player's hand */
  def getHand: List[Card] = hand
  
  /** The gem count can't be lower than zero */
  if(gem < 0){
    gem = 0
  }

  /** Take the first card in the _deck and adds it to the _hand. */
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

}



