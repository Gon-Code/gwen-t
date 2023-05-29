package cl.uchile.dcc
package gwent.board

import gwent.cards.Card

/** A class that represents the board where the game is played
 *
 * The Board class is where we are going to play the cards of each of the players. Each player has his own zone for Mele, Ranged and Siege cards.
 * On the other hand (we are not referencing the hand parameter of the players) there is only one weather zone which is share by both players.
 * When the game starts we want to create and empty board, but the user can create a board with cards already on it to make the game funnier
 *
 * @param SiegeZone_1 Is the area of the board where the first player puts his Siege Cards
 * @param RangedZone_1 Is the area of the board where the first player puts his Range Cards
 * @param MeleZone_1 Is the area of the board where the first player puts his Mele Cards
 * @param SiegeZone_2 Is the area of the board where the second player puts his Siege Cards
 * @param RangedZone_2 Is the area of the board where the second player puts his Ranged Cards
 * @param MeleZone_2 Is the area of the board where the second player puts his Mele Cards
 *
 *
 * @constructor Creates a new board with the
 */
class Board (var SiegeZone_1 : List[Card] = List(), var RangedZone_1 : List[Card] = List(), var MeleZone_1 : List[Card] = List(),
             var SiegeZone_2 : List[Card] = List(), var RangedZone_2 :List[Card] = List(), var MeleZone_2 : List[Card] = List(),var WeatherZone : List[Card] = List()){
  
}
