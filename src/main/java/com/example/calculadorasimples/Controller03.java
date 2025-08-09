package com.example.calculadorasimples;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

// aq vai controlar todos os eventos
public class Controller03 {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;


    public void up(ActionEvent e) {
//        System.out.println("up!");
        myCircle.setCenterX(x);
        myCircle.setCenterY(y-=3);
    }
    @FXML
    public void down(ActionEvent e) {
//        System.out.println("down!");
        myCircle.setCenterY(y+=3);
    }
    @FXML
    public void right(ActionEvent e) {
//        System.out.println("right!");
        myCircle.setCenterX(x+=3);
    }
    @FXML
    public void left(ActionEvent e) {
//        System.out.println("left!");
        myCircle.setCenterX(x-=3);
    }
}
