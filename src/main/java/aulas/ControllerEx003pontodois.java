package aulas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerEx003pontodois {
    @FXML
    private Label nomeId;

    @FXML
    private Label emailId;

    @FXML
    private Label idadeId;

    @FXML
    private Label generoId;

    private Stage stage;
    private Scene scene;
    private Parent builder;
    private Parent root;

    public void displayNome(String nome){
        nomeId.setText(nome);
    }

    public void displayEmail(String email){
        emailId.setText(email);
    }

    public void displayIdade(String idade){
        idadeId.setText(idade);
    }

    public void displayGenero(String genero){
        generoId.setText(genero);
    }
    @FXML
    public void voltar(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("interfaceEx003.fxml"));
        root = fxmlLoader.load();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
