package cl.uchile.dcc
package gwent

//Clase abstracta que representa una carta, con su nombre y clasificacion

abstract class AbstractCard (override val name : String , override val rank : Int) extends Card{

}
