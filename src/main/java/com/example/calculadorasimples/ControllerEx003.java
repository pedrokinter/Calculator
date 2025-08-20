package com.example.calculadorasimples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class ControllerEx003 implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent builder;
    private Parent root;
    @FXML
    private TextField nomeField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField idadeField;

    @FXML
    private Button salvarButton;

    @FXML
    private TreeView<String> treeView = new TreeView<>();

    TextFormatter<String> formatterIdade = new TextFormatter<>(change -> {
        String text = change.getControlNewText();

        if (text.length() > 3){
            return null;
        }



        for(char c : text.toCharArray()){
            if (!Character.isDigit(c)){
                return null;
            }
        }

        return change;
    });


    TextFormatter<String> formatterNome = new TextFormatter<>(change -> {
        String text = change.getControlNewText();

        if (text.isEmpty()) {
            return null;
        }

        if (!text.contains("@")){
            return null;
        }

       return change;
    });


    @FXML
    public void checkEmail(ActionEvent event) {
            emailField.setPromptText("Digite um email");
            emailField.getPromptText();
            emailField.setTextFormatter(formatterNome);
    }

    @FXML
    public void checkIdade(ActionEvent event) {
        idadeField.setPromptText("Digite um idade");
        idadeField.getPromptText();
        idadeField.setTextFormatter(formatterIdade);
    }

    @FXML
    public void checkNome(ActionEvent event) {
        if (nomeField.getText().isEmpty()){
            nomeField.setPromptText("Digite um nome");
            nomeField.getPromptText();
        }
    }

    @FXML
    public void salvarCheck(ActionEvent event) {
        if (nomeField.getText().isEmpty() || emailField.getText().isEmpty() || idadeField.getText().isEmpty()) {
            salvarButton.setDisable(true);
        } else {
            salvarButton.setDisable(false);
        }
    }

    CheckBoxTreeItem<String> Hobbies = new CheckBoxTreeItem<>("Hobbies");
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        CheckBoxTreeItem<String> desenhar = new CheckBoxTreeItem<>("Desenhar");
        CheckBoxTreeItem<String> treinar = new CheckBoxTreeItem<>("Treinar");
        CheckBoxTreeItem<String> cheirar = new CheckBoxTreeItem<>("Cheirar");
        CheckBoxTreeItem<String> ler = new CheckBoxTreeItem<>("Ler");
        CheckBoxTreeItem<String> jogar = new CheckBoxTreeItem<>("Jogar");

        Hobbies.setExpanded(true);

        Hobbies.getChildren().add(desenhar);
        Hobbies.getChildren().add(treinar);
        Hobbies.getChildren().add(cheirar);
        Hobbies.getChildren().add(ler);
        Hobbies.getChildren().add(jogar);

        treeView.setRoot(Hobbies);
        treeView.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
        }

        @FXML
        public void salvarDados(ActionEvent event) throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("interfaceEx003pontodois"));
            root = fxmlLoader.load();

            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();


        }

    }



