package slogo.model.backEndInternal.commands;

import slogo.model.backEndInternal.BackEndTurtle;

import java.util.List;

public class HideTurtle implements Command<Double> {

  BackEndTurtle backEndTurtle;

  public HideTurtle(BackEndTurtle myTurtle) {
    this.backEndTurtle = myTurtle;
  }

  @Override
  public Double execute() {
    backEndTurtle.setVisibility(false);
    return (double) 0;
  }

  @Override
  public List<String> updateRawCommands() {
    return null;
  }

  @Override
  public Integer updateCounter() {
    return null;
  }
}
