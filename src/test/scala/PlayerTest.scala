package cl.uchile.dcc
package gwent

import scala.collection.mutable.ListBuffer

class PlayerTest extends munit.FunSuite {
  test("La clase jugador inicializa correctamente"){
    var jugador = new PlayerClass("Javier","A",3,ListBuffer[AbstractCard](),ListBuffer[AbstractCard]())
    assertEquals("Javier",jugador.name)
  }
}
