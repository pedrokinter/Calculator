package com.example.calculadorasimples;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.ContextMenuEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller018 implements Initializable {
    @FXML
    private TreeView treeView;

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> root = new TreeItem<>("Files");
        // e isso aqui é o principal, eu abro ele pra abrir o item1, 2 e 3 e assim por diante

        TreeItem<String> itemPrincipal = new TreeItem<>("fotos");
        TreeItem<String> itemPrincipal2 = new TreeItem<>("musicas");
        TreeItem<String> itemPrincipal3 = new TreeItem<>("videos");
        // aq é o item principal (pasta) q vai ficar guardado as fotos, musicas e videos abaixo
        // eu crio esse treeItem para ser o principal
        // e abaixo vou passar ele dando add nos root de fotos1, musicas1 etc
        TreeItem<String> fotos1 = new TreeItem<>("fotos1");
        TreeItem<String> fotos2 = new TreeItem<>("fotos2");
        TreeItem<String> musicas1 = new TreeItem<>("musicas1");
        TreeItem<String> musicas2 = new TreeItem<>("musicas2");
        TreeItem<String> videos1 = new TreeItem<>("videos1");
        TreeItem<String> videos2 = new TreeItem<>("videos2");

//        itemPrincipal.getChildren().addAll(fotos1, fotos2);
//        itemPrincipal2.getChildren().addAll(musicas1, musicas2);
//        itemPrincipal3.getChildren().addAll(videos1, videos2);
//
//        root.getChildren().addAll(itemPrincipal, itemPrincipal2, itemPrincipal3);
//
//        treeView.setRoot(root);
    }

    public void selectItem() {
//        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();

//        if (item != null) {
//            // isso aq é pra nao dar null pointer exception qnd eu clicar nos items para abrir e chegar nos videos etc
//            System.out.println(item.getValue());
//        }
    }


}
