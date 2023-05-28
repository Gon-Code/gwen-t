package cl.uchile.dcc
package gwent.cards

/** An abstract class representing the troop cards.
 *
 * AbstractCard is an abstract class that represents the troop cards with a name, description and power.
 * 
 * @constructor Creates a new Card with the given name, description and power.
 *              
 * @see Card             
 */

abstract class AbstractCard protected(val name: String, val description: String, val power: Int) extends Card {

    /** The current power of the card, which may be affected by various conditions during
     * gameplay.
     * Initially set to the base [[power]] of the card.
     */
    var currentPower: Int = power
}