package cl.uchile.dcc
package gwent

//La clase rangedCard hereda los parametros de la clase abstracta TroopCard
//Esta carta solo se juega en zonas especificas del tablero, lo implementaremos mas adelante

class RangedCard (name: String,rank:Int,strength:Int,Type:String)extends TroopCard (name,rank,strength,Type){
    //Debemos chequear que el Type de Ranged sea "ranged"
}
