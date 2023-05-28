package cl.uchile.dcc
package gwent.cards

/** WeatherCard is a type of card that represents the weather cards.
 *
 * The Weather Cards are a special type of cards, they are not troop cards and both players can play them in one shared place in the board.
 * Weather Cards can affect both players with advantages and disadvantages, depending on the effect chosen.
 * 
 * @param name The name of the weather card
 * @param description Is the description in english of the weather card, It explains its function.
 *
 * @constructor Creates a new Weather Card with the specified name and description.
 *              
 *
 * @see Card
 */

class WeatherCard(val name : String, val description : String) extends Card {


}
