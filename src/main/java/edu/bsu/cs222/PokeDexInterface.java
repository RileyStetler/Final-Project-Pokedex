package edu.bsu.cs222;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class PokeDexInterface extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        BorderPane pane = new BorderPane();
        Text title = new Text("Pokedex");
        title.setFont(Font.font("Times New Roman"));
        title.setFill(Color.CRIMSON);

        Image pokeballImage = new Image("addimage/Pokeball.png");
        ImageView addPokeballImage = new ImageView(pokeballImage);

        pane.setTop(title);
        pane.setTop(addPokeballImage);

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Pokedex");
        stage.setScene(scene);
        stage.show();


    }
}
