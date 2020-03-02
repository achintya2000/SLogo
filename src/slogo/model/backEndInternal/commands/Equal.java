package slogo.model.backEndInternal.commands;

import java.util.List;

public class Equal<T extends Comparable<T>> implements Command<Double> {

  private Command<T> cmd2;
  private Command<T> cmd1;
  T value1;
  T value2;

  public Equal(Command<T> cmd1, Command<T> cmd2) {
    this.cmd1=cmd1;
    this.cmd2=cmd2;
  }

  @Override
  public Double execute() {
    value1= cmd1.execute();
    value2= cmd2.execute();

    return (double) (value1.compareTo(value2) == 0 ? 1 : 0);
  }

}
