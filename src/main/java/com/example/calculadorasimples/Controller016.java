package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class Controller016 {
    @FXML
    private Label myLabel;
    @FXML
    private Button mySum;
    @FXML
    private Button mySubtraction;
    @FXML
    private Button myC;
    int num = 0;

    public void increaseLabel(ActionEvent event) {
        num++;
        myLabel.setText(String.format("%04d", num));


//        if (num < 10) {
//            myLabel.setText("000" + num);
//        } else if (num > 10 && num < 100){
//            myLabel.setText("00" + num);
//        } else if (num > 100 && num < 1000){
//            myLabel.setText("0" + num);
//        }

    }

    public void decreaseLabel(ActionEvent event) {
        num--;
        if (num < 0){
            num = 0;
        }
        myLabel.setText(String.format("%04d", num));

    }

    public void clearNumber(ActionEvent event) {
        num = 0;
        myLabel.setText(String.format("%04d", num));
    }


}
