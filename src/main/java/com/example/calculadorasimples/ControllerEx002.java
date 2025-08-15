package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ControllerEx002  {
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

    int cont = 1;
    public void showList(ActionEvent event) {
        cont ++;
        if (cont % 2 == 0){
            myListView.setLayoutX(210);
            myListView.setLayoutY(236);
        } else {
            myListView.setLayoutX(-200);
            myListView.setLayoutY(100);
        }

    }
}
