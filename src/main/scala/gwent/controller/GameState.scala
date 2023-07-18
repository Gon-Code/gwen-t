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

  private def transitionError(targetState:String) : Unit = {
    throw new InvalidTransitionException(
      s"Cannot transition from ${getClass.getSimpleName} to $targetState"
    )
  }

  /** Initially every transition to another state is invalid */
  def toDrawPhase(): Unit = {
    transitionError("Wrong transition")
  }
  /** Initially every transition to another state is invalid */
  def toMainPhase_1(): Unit = {
    transitionError("Wrong transition")
  }
  /** Initially every transition to another state is invalid */
  def toMainPhase_2() : Unit = {
    transitionError("Wrong transition")}

  /** Initially every transition to another state is invalid */
  def toFinalPhase() : Unit = {
    transitionError("Wrong transition")}

  /** Initially every transition to another state is invalid */
  def toBattlePhase(): Unit = {
    transitionError("Wrong transition")
  }
}
