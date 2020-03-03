package slogo.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CommandFileIO {

    private List<String> myCommandHistory;

    public CommandFileIO(){
        myCommandHistory = new ArrayList<>();
    }

    public void updateCommandHistory(List<String> currentCommandHistory){
        myCommandHistory = Collections.unmodifiableList(currentCommandHistory);
    }

    public void saveCommandHistory() throws IOException {
        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        String filename = "command_history" + df.format(new Date()) + ".txt";
        try {
            BufferedWriter commandWriter = new BufferedWriter(new FileWriter(filename));
            for (String command : myCommandHistory) {
                commandWriter.write(command);
                commandWriter.newLine();
            }
            commandWriter.close();
        }
        catch(IOException ex){
            throw ex;
        }
    }
}
