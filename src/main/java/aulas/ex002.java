package aulas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ex002 extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("interfaceEx002.fxml"));
        ControllerEx002 controller = new ControllerEx002();
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("ex002.css").toExternalForm();
        scene.getStylesheets().add(css);




        stage.setScene(scene);
        stage.setTitle("Contador Basico");
        stage.show();


    }
}
