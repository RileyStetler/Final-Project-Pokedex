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
        JFrame window = new JFrame("PokeDex");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        panel_1.setBackground(Color.gray);
        window.add(BorderLayout.NORTH, panel_1);
        final JScrollPane scroll_1 = new JScrollPane(panel_1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //Implement this code if we want the scroll bar on the left side
        //scroll_1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //Allows for faster/slower scrolling
        scroll_1.getVerticalScrollBar().setUnitIncrement(15);
        final JScrollPane scroll_2 = new JScrollPane(panel_2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        panel_2.add(new JButton("Button 1"));
        panel_2.add(new JButton("Button 2"));
        panel_2.add(new JButton("Button 3"));
        panel_2.add(new JButton("Button 4"));
        panel_2.add(new JButton("Button 5"));
        panel_2.add(new JButton("Button 6"));

        JPanel pane = new JPanel(new GridBagLayout());

        for (int i = 1; i < 152; i++) {
            int id = i;
            JButton pokemonNames = new JButton();
            pokemonNames.setText(PokemonSelection.PokemonName(id));
            pokemonNames.setPreferredSize(new Dimension(170,30));
            pane.add(pokemonNames);
            pokemonNames.addActionListener(e -> {
                System.out.println(PokemonSelection.PokemonId(id));
                System.out.println(PokemonSelection.PokemonName(id));
            });
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridy = GridBagConstraints.RELATIVE;
            constraints.gridx = 0;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.weightx = 1.0;
            constraints.anchor = GridBagConstraints.NORTH;
            pane.add(pokemonNames, constraints);
            constraints.weighty = 0;
            pane.add(pokemonNames, constraints);
            panel_1.add(pane);


        }

        GridLayout griddy = new GridLayout(0, 2);
        window.setLayout(griddy);
        window.add(BorderLayout.WEST, scroll_1);
        window.add(BorderLayout.EAST, scroll_2);
        window.setSize(800, 600);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        System.out.println("DONE");
    }
}