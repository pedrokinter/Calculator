package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class aula020 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("interface020.fxml"));
        Controller020 controller = new Controller020();
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(event -> {
                switch(event.getCode()) {
                    case UP:
                        controller.up();
                        break;
                    case DOWN:
                        controller.down();
                        break;
                    case LEFT:
                        controller.left();
                        break;
                    case RIGHT:
                        controller.right();
                        break;
                }
        });

        stage.setScene(scene);
        stage.show();

    }
}
