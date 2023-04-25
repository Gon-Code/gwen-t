package cl.uchile.dcc
package gwent

//La clase MeleCard hereda todos sus parametros de la clase abstracta TroopCard
class MeleCard (name:String,rank:Int,strength:Int,Type:String) extends TroopCard(name, rank, strength, Type) {
  //Tenemos que chekear que el tipo de mele card sea "mele" en los test
}