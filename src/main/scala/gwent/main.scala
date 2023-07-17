package cl.uchile.dcc
package gwent

import gwent.controller.GameController

@main
def main(): Unit = {
  val controlador : GameController = new GameController()
  controlador.StartGame()
  println("Hello world!")
}