package slogo.model.backEndInternal.commands;

import slogo.model.backEndInternal.BackEndTurtle;

import java.util.List;

public class SetPenColor implements Command<Double> {

    BackEndTurtle myTurtle;
    Command index;

    public SetPenColor(BackEndTurtle t, Command i) {
        this.myTurtle = t;
        this.index = i;
    }

    @Override
    public Double execute() {
        myTurtle.setPenColor((Double) index.execute());
        return (Double) index.execute();
    }

    @Override
    public boolean isItExecutable() {
        return true;
    }

}
