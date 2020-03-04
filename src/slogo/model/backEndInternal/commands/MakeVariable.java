package slogo.model.backEndInternal.commands;

import slogo.model.exceptions.ExceptionFactory;
import slogo.model.exceptions.InvalidCommandException;
import slogo.model.backEndInternal.UserVariableHandler;

public class MakeVariable<T> implements Command<Double> {

  private UserVariableHandler<T> myHandler;
  private Command nameCmd;
  private Command valueCmd;

  public MakeVariable(UserVariableHandler handler, Command nameCmd, Command valueCmd) {
    this.nameCmd=nameCmd;
    this.valueCmd=valueCmd;
    this.myHandler = handler;
  }

  @Override
  public Double execute() throws Exception {

    Class<?> result=nameCmd.execute().getClass();
    String className = (((Class) result).getName().split("[.]"))[result.getName().split("[.]").length - 1];

    if(className.equals("Double")){
     System.out.println("Answer should stop here");
        try{
          throw ExceptionFactory.makeException("InvalidCommand", "Default"); // cannot create two variables with the same name
        }
        catch(Exception ex){
          throw ex;
        }
   } else{
     System.out.println("Type is "+className);
     String variableName = (String) nameCmd.execute();
     Double value = (Double) valueCmd.execute();

     myHandler.makeVariable(variableName, value);

     return myHandler.getVariable(variableName).getValue();
   }

  }

  @Override
  public boolean isItExecutable() {
    return true;
  }
}
