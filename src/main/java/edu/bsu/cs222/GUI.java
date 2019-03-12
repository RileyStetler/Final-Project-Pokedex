package edu.bsu.cs222;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        Button button = new Button("Hello");
        root.getChildren().add(button);

        Scene scene = new Scene(root, 550, 250);

        primaryStage.setTitle("PokeDex");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
