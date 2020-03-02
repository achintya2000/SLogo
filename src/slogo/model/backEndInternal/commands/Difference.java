package slogo.model.backEndInternal.commands;

import java.util.List;

public class Difference implements Command<Double> {

    private Command cmd1;
    private Command cmd2;

    public Difference(Command v1, Command v2) {
        this.cmd1 = v1;
        this.cmd2 = v2;

    }

    @Override
    public Double execute() {

        return (double) (cmd1).execute() - (double) (cmd2).execute();
    }

}
