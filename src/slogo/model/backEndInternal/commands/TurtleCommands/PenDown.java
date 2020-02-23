package slogo.model.backEndInternal.commands.TurtleCommands;

import slogo.model.backEndInternal.BackEndTurtle;
import slogo.model.backEndInternal.commands.Command;

public class PenDown implements Command<Integer> {

  BackEndTurtle backEndTurtle;

  PenDown(BackEndTurtle myTurtle) {
    this.backEndTurtle = myTurtle;
  }

  @Override
  public Integer execute() {
    backEndTurtle.flipPen();
    return 1;
  }
}
