package cl.uchile.dcc
package gwent.controller


class GameState(private var context : GameController) {
  context.state = this

  /** Accessor method for the context field */
  def getContext : GameController = context

  /** Setter method for the context field */
  def SetContext(new_Context : GameController):Unit={
    context = new_Context
  }

  
}
