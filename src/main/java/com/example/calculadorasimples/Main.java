package com.example.calculadorasimples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


// main class is the child class of application
public class Main extends Application {


    public static void main(String[] args) {
            launch(args); // launch metod is a static method belongs to application class

    }

    @Override
    public void start(Stage stage) {

        Group root = new Group(); // crio um root node para orgnaizxar meus componentes, coloco ele na scene e a scene
        // eu coloco no stage;
        // a scene serve para dar resize automaticamente e não bugar a janela do stage
        Scene scene = new Scene(root); // pra ter uma scene eu preciso passar uma rootnode (layout managers)

        stage.setScene(scene);
        stage.show(); // é stage, scene e scene graph a ordem para a customizaçao da gui
    }
}