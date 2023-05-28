package cl.uchile.dcc
package gwent.cards

/** MeleCard is a type of card that represents the mele troop cards.
 *
 * @param name The name of the Mele Card.
 * @param description The description in english of the Mele Card, It explains its function.
 * @param power The number that represents the power or attack value of the card.
 *
 * @constructor Creates a new Mele Card with the specified name, description and power.
 *
 *
 * @see Card
 */
class MeleCard(name: String, description: String, power: Int) extends AbstractCard (name, description, power){

  /** If the power of the card is affected by other cards, we ensure that the current power can't be lower than zero */
  if(currentPower < 0) currentPower = 0

}
