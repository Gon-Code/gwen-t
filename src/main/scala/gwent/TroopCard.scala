package cl.uchile.dcc
package gwent

//La clase abstracta tropa , hereda el nombre y la clasificacion de la clase abstracta Card
//Esta carta solo se juega en zonas especificas del tablero, lo implementaremos mas adelante

 abstract class TroopCard(name:String , rank:Int , val strength:Int , val Type : String) extends AbstractCard (name,rank){

}
