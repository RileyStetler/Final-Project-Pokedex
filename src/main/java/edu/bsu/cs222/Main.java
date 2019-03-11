package edu.bsu.cs222;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("main.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button button = new Button("Button");

    private Pane createRoot() {
        VBox root = new VBox();
        root.getChildren().addAll( //
                button); //
        return root;
    }
}
