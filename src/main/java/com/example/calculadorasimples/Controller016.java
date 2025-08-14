package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller016  {
    @FXML
    private Label myLabel;
    @FXML
    private Button mySum;
    @FXML
    private Button mySubtraction;
    @FXML
    private Button myC;
    int num = 0;

    @FXML
    private ListView<String> myListView;

    private String[] list;


    public void increaseLabel(ActionEvent event) {

        num++;
        String increment = "incrementou para " + num;
        myLabel.setText(String.format("%04d", num));
        myListView.getItems().add(increment);
    }

    public void decreaseLabel(ActionEvent event) {
        num--;

        if (num <= 0){
            num = 0;
        }
        String decrement = "decrementou para " + num;
        myLabel.setText(String.format("%04d", num));
        myListView.getItems().add(decrement);

    }

    public void clearNumber(ActionEvent event) {
        num = 0;
        String reset = "resetou para " + num;
        myLabel.setText(String.format("%04d", num));
        myListView.getItems().add(reset);
    }

    public void showList(ActionEvent event) {

    }
}
