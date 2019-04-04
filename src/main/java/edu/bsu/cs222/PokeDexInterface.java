package edu.bsu.cs222;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;


public class PokeDexInterface extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        JTextField IDInput = new JTextField();
        JLabel bmiLabel = new JLabel("Are you sure?");
        JButton computeButton = new JButton("I Choose You!");


        computeButton.addActionListener(e -> {
            System.out.println(PokemonSelection.PokemonId(Integer.parseInt(IDInput.getText())));
        });

        //layout
        JPanel north = new JPanel(new GridLayout(30,30));
        north.add(new JLabel("Choose Your Pokemon"));
        north.add(IDInput);

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
