package slogo.view;

import javafx.beans.binding.Bindings;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import slogo.controller.ParserController;
import slogo.model.backEndInternal.UserVariableHandler;

public class VariableWindow extends Window {

    private static final String VARIABLES = "Variables";
    private TitledPane myView;
    private ListView<String> variables;
    UserVariableHandler handler = new UserVariableHandler();
    private ParserController myController;


    public VariableWindow(ParserController control)
    {
        myController = control;
        myView = new TitledPane();
        myView.setCollapsible(false);
        myView.setText(VARIABLES);
        myView.setPrefHeight(200);
        variables = new ListView<>();
        myView.setContent(variables);

        /*
        variables = new TableView<>(handler.getKeys());
        //variables.getItems().addAll("varXSSSSSSSSSSJFL:DKJF","varY","varY","varY","varY","varY","varY","varY","varY");
        myView.setContent(variables);
        handler.makeVariable("yay",232);
        handler.makeVariable("3123",12321);
        System.out.println(handler.getVariableMap().keySet().size());
        handler.removeVariable("3123");
        System.out.println(handler.getVariableMap().keySet().size());

        TableColumn<String,String> col1 = new TableColumn<>("Key");
        col1.setCellValueFactory(cd-> Bindings.createStringBinding(()-> cd.getValue()));

        TableColumn<String,String> col2 = new TableColumn<>("Value");
        col2.setCellValueFactory(cd -> Bindings.valueAt(handler.getVariableMap(),cd.getValue()));
        variables.getColumns().setAll(col1,col2);
        */



    }

    public Node getView()
    {
        return myView;
    }

    public void update()
    {
        variables.getItems().clear();
        for(String s : myController.getAllVariables())
        {
            variables.getItems().add(s);
        }
    }


}
