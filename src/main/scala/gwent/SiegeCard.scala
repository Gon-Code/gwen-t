package cl.uchile.dcc
package gwent

//La clase SiegeCard hereda los parametros de la clase abstracta TroppCard
//Esta carta solo se juega en zonas especificas del tablero, lo implementaremos mas adelante

class SiegeCard (name:String,rank:Int,strength:Int,Type:String)extends TroopCard (name,rank, strength, Type){
    //Debemos chequear que el Type de SiegeCard sea "siege" en los test
}
