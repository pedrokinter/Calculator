package aulas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller006 {
    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void login(ActionEvent e) throws IOException {
        String name = nameTextField.getText();
        // aq é o nome, e eu vou setar ele dando get no textfield (o texto q vai ser escrito no scene builder)
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("interface06pontodois.fxml"));
        root = fxmlLoader.load();
        // crio um root pra dar load na scene, e seto um resource com o .fxml da scene 2
        Controller006pontodois controllerDois = fxmlLoader.getController();
        // crio um objeto do controlador dois
        controllerDois.displayName(name);
        // e como eu tenho esse objeto, eu posso passar o metodo e mostrar o nome com o atributo atual

        //Parent builder = FXMLLoader.load(getClass().getResource("interface06.fxml"));

        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
