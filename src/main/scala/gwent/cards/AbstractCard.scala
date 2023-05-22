package cl.uchile.dcc
package gwent.cards

/**
 *Documentar el codigo
 */

abstract class AbstractCard protected(val name: String, val description: String, val power: Int) extends Card {

    /** The current power of the card, which may be affected by various conditions during
     * gameplay.
     * Initially set to the base [[power]] of the card.
     */
    var currentPower: Int = power
}