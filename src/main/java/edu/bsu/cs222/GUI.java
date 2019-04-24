package edu.bsu.cs222;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Vincent
 */
public class GUI extends PokemonSelection{

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame window = new JFrame("Button Scroll Bar");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        panel_1.setBackground(Color.gray);
        window.add(BorderLayout.NORTH, panel_1);
        final JScrollPane scroll_1 = new JScrollPane(panel_1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        final JScrollPane scroll_2 = new JScrollPane(panel_2, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel_1.add(new JButton("Button 1"));
        panel_1.add(new JButton("Button 2"));
        panel_1.add(new JButton("Button 3"));
        panel_1.add(new JButton("Button 4"));
        panel_1.add(new JButton("Button 5"));
        panel_1.add(new JButton("Button 6"));

        panel_2.add(new JButton("Button 1"));
        panel_2.add(new JButton("Button 2"));
        panel_2.add(new JButton("Button 3"));
        panel_2.add(new JButton("Button 4"));
        panel_2.add(new JButton("Button 5"));
        panel_2.add(new JButton("Button 6"));

        JPanel pane = new JPanel(new GridBagLayout());



        JButton b1 = new JButton();
        JButton b2 = new JButton();
        for (int i = 0; i < 130; i++) {
            JButton pokemonNames = new JButton();
            pokemonNames.setText(String.valueOf(i));
            pane.add(pokemonNames);
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridy = GridBagConstraints.RELATIVE;
            constraints.gridx = 0;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.weightx = 1.0;
            constraints.anchor = GridBagConstraints.NORTH;
            pane.add(pokemonNames, constraints);
            constraints.weighty = 0;
            pane.add(pokemonNames, constraints);
        }

        panel_1.add(pane);


        GridLayout griddy = new GridLayout(0, 2);
        window.setLayout(griddy);
        window.add(BorderLayout.WEST, pane);
        window.add(BorderLayout.EAST, scroll_2);
        window.setSize(600, 600);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

    }
}