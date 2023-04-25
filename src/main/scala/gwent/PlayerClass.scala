package cl.uchile.dcc
package gwent


import scala.collection.mutable.ListBuffer
import scala.util.Random
import scala.util.control.Breaks.break

//Definimos aquí la clase abstracta del jugador
//Tiene varias variables, nombre, lado , gem, deck y hand
//La mayoria de estas variables se defininen de manera trivial excepto por deck y hand
//deck y hand son el mazo y la mano respectivamente
//Definimos ambos como un ListBuffer[AbstractCard]
//La idea de usar ListBuffer es que al momento de mover cartas del deck o la mano, debemos eliminarlas
//Esto es mucho mas sencillo con ListBuffer que con List.

class PlayerClass(val name:String, val side:String, val gem :Int, val deck : ListBuffer[AbstractCard], val hand : ListBuffer[AbstractCard])
extends Player {
  //El metodo play, saca una carta de la mano y la coloca en el tablero
  def play(s : String) : Unit={
    //String representa el nombre de la carta que debemos sacar, pero primero debemos ubicarla en el mazo para eliminarla
    for(x <- hand.indices){
      if(s.equals(hand(x).name)){
        //Eliminamos la carta de la mano
        hand.remove(x)
        //Cuando esto ocurre detenemos inmediatamente el for, de lo contrario eliminariamos de la mano todas las cartas con el mismo nombre
        break
      }
    }
  }

  //El metodo draw saca una carta del deck y la coloca en la mano
  //Ademas para mejorar la aleatoriedad revolvemos el deck cada vez que sacamos una carta
  def draw(): Unit ={
    //Generamos un numero entre 0 y el de la cantidad de elementos en el deck
    val x = Random.between(0, deck.length + 1)
    //card_played es la carta que se mueve desde el deck hacia la mano
    val card_drew = deck(x)
    //Agregamos la carta robada a la mano
    hand += card_drew
    //Eliminamos la carta robada del deck
    deck.remove(x)
    //Finalmente revolvemos el deck
    Random.shuffle(deck)

  }


}
