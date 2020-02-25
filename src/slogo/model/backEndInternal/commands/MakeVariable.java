package slogo.model.backEndInternal.commands;

import slogo.model.backEndInternal.UserVariable;
import slogo.model.backEndInternal.UserVariableHandler;

public class MakeVariable<T> implements Command<UserVariable<?>> {

  private UserVariableHandler<T> myHandler;
  private String variableName;

  public MakeVariable(UserVariableHandler<T> handler, String name, T userVal) {
    this.variableName = name;
    this.myHandler = handler;
    handler.makeVariable(name, userVal);
  }

  @Override
  public UserVariable<?> execute() {
    return myHandler.getVariable(variableName);
  }
}