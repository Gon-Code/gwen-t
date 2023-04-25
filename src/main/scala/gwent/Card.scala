package cl.uchile.dcc
package gwent

//Interfaz que representa la clase carta, la cual se juega en el tablero ( El cual no se implementa aun )

trait Card{
  //Cada carta posee un nombre
  val name : String
  //Cada carta posee una clasificacion
  val rank : Int
}


