package cl.uchile.dcc
package gwent

import scala.collection.mutable.ListBuffer

//Interfaz que representa la clase jugador, el cual juega carta en el tablero

trait Player {
  //Nombre del jugador
  val name : String
  //Lado del tablero donde el jugador ubica sus cartas
  val side : String
  //Cantidad de gemas(o maná) que posee el jugador
  val gem : Int
  //El mazo del jugador, el cual contiene cartas
  val deck : ListBuffer[AbstractCard]
  //La mano del jugador la cual contiene cartas
  val hand : ListBuffer[AbstractCard]

  //METODOS

  //draw extrae una carta del mazo y lo agrega en la mano
  def draw():Unit
  //play saca una carta de la mano y la coloca en el tabler
  def play(s : String) : Unit


}
