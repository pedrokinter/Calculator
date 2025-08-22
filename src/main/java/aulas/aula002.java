package aulas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

import java.util.Objects;

public class aula002  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.GREENYELLOW);

        Text text = new Text();
        text.setText("PEDROOOOOOOOOOOOOOOOOOOO");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        text.setFill(Color.BLACK);

        Line line = new Line();
        line.setStartX(200); // começo das coordenadas
        line.setStartY(200);
        line.setEndX(200);
        line.setEndY(300);
        line.setStrokeWidth(5); // muda o tamanho da linha
        line.setStroke(Color.BLACK); // muda a cor da linha
        line.setOpacity(0.75); // muda a opacidade da linha
        line.setRotate(45); // muda a rotaçao da linha para 45 graus

        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(150); // largura
        rectangle.setHeight(200); // altura
        rectangle.setFill(Color.BLACK); // enche o retangulo de preto
        rectangle.setStrokeWidth(5); // cria uma bora
        rectangle.setStroke(Color.BLUE); // muda a cor da borda

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.00, 200.00,
                300.0, 300.0,
                400.0, 300.0
        ); // aq eu preciso passar 2 valores em cada linha para formar o triangulo

        triangle.setFill(Color.YELLOWGREEN); // aq eu seto a cor dele q eu quiser

        Circle circle = new Circle();
        circle.setRadius(50); // seta o radius dele
        circle.setFill(Color.BLACK);
        circle.setCenterX(150); // seta onde elçe evai começar
        circle.setCenterY(500);

        Image image = new Image("caa.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(300);
        imageView.setY(300);
        imageView.setFitWidth(400); // mudo a largura da imagem
        imageView.setFitHeight(400); // mudo a altura da imagem

        root.getChildren().add(text); // adiciono os nodes ao group (root) e dou get.
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);



        stage.setScene(scene);
        stage.show();
    }
}
