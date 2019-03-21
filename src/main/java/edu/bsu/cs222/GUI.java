package edu.bsu.cs222;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox main = new HBox(15);
        main.setAlignment(Pos.CENTER);

        VBox pokeList = new VBox();
        Text title = new Text("Pick a pokemon");
        pokeList.getChildren().add(title);
        pokeList.setMaxWidth(Double.MAX_VALUE);
        pokeList.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");


        for(int i=0; i<10; i++){
            Button pokemonNames = new Button();
            pokemonNames.setText(String.valueOf(i));
            pokemonNames.setMaxWidth(Double.MAX_VALUE);
            pokemonNames.setOnAction((ActionEvent)->{
                System.out.println(pokemonNames.getText());
            });
            pokeList.getChildren().add(pokemonNames);
        }



        VBox pokeCharacteristics = new VBox();
        Text title2 = new Text("Pick a pokemon");
        pokeCharacteristics.getChildren().add(title2);
        pokeCharacteristics.setAlignment(Pos.TOP_CENTER);
        pokeCharacteristics.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");



        main.getChildren().addAll(pokeList, pokeCharacteristics);

        Scene scene = new Scene(main, 500, 500);

        primaryStage.setTitle("PokeDex");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
