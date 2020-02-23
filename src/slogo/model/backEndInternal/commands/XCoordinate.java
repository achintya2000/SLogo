package slogo.model.backEndInternal.commands;

import slogo.model.backEndInternal.BackEndTurtle;

public class XCoordinate implements Command<Double> {

  BackEndTurtle backEndTurtle;

  public XCoordinate(BackEndTurtle myTurtle) {
    this.backEndTurtle = myTurtle;
  }

  @Override
  public Double execute() {
    return backEndTurtle.getPosition().getXVal();
  }
}