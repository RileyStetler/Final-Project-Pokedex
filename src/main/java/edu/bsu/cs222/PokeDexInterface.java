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
import me.sargunvohra.lib.pokekotlin.model.Pokemon;

import javax.swing.*;
import javax.swing.plaf.MenuBarUI;
import java.awt.*;



public class PokeDexInterface extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        JTextField heightField = new JTextField(30);
        JLabel bmiLabel = new JLabel("Are you sure?");
        JButton computeButton = new JButton("I Choose You!");

        //layout
        JPanel north = new JPanel(new GridLayout(30,30));
        north.add(new JLabel("Choose Your Pokemon"));
        north.add(heightField);

        // overall frame
        JFrame frame = new JFrame("Pokedex");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(north, BorderLayout.NORTH);
        frame.add(bmiLabel, BorderLayout.CENTER);
        frame.add(computeButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

        JMenuBar menu = new JMenuBar();
        menu.add(new JMenuBar());



    }
}
