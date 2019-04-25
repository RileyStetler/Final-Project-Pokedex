package edu.bsu.cs222;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Vincent
 */
public class GUI extends PokemonSelection {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame window = new JFrame("PokeDex");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pokemonList = new JPanel();
        JPanel pokemonInformation = new JPanel();
        pokemonList.setBackground(Color.gray);
        window.add(BorderLayout.NORTH, pokemonList);
        final JScrollPane scroll_1 = new JScrollPane(pokemonList, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //Implement this code if we want the scroll bar on the left side
        //scroll_1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //Allows for faster/slower scrolling
        scroll_1.getVerticalScrollBar().setUnitIncrement(15);
        final JScrollPane scroll_2 = new JScrollPane(pokemonInformation, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll_2.getVerticalScrollBar().setUnitIncrement(15);

        JPanel pane = new JPanel(new GridBagLayout());
        Font f = new Font("Serif", Font.BOLD, 16);

        for (int i = 1; i < 152; i++) {
            int id = i;
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridy = GridBagConstraints.RELATIVE;
            constraints.gridx = 0;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.weightx = 1.0;
            constraints.weighty = 0;
            constraints.anchor = GridBagConstraints.NORTH;

            JButton pokemonNames = new JButton();
            pokemonNames.setText(PokemonSelection.PokemonId(id) + "  " + PokemonSelection.PokemonName(id).toUpperCase());
            pokemonNames.setFont(f);
            pokemonNames.setHorizontalAlignment(SwingConstants.LEFT);
            pokemonNames.setPreferredSize(new Dimension(200, 30));


            pane.add(pokemonNames);
            pokemonNames.addActionListener(e -> {
                pokemonInformation.removeAll();

                JButton button;
                JTextArea info;

                GridBagLayout gridbag = new GridBagLayout();
                GridBagConstraints c = new GridBagConstraints();
                pokemonInformation.setLayout(gridbag);
                c.fill = GridBagConstraints.HORIZONTAL;

                info = new JTextArea(PokemonSelection.PokemonSprite(id));
                c.weightx = 1.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 0;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonName(id));
                c.weightx = 1.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 1;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.Types(id));
                c.weightx = 1.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 2;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("ID: " + PokemonSelection.PokemonId(id));
                c.weightx = 1.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 3;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonGeneration(id));
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 4;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea();
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 5;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonDescription(id));
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 6;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea();
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 7;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("Height: " + PokemonSelection.PokemonHeight(id));
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 8;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("Weight: " + PokemonSelection.PokemonWeight(id));
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 9;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea();
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 10;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseHealthPointsStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 0;
                c.gridy = 11;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseSpeedStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 2;
                c.gridy = 11;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseAttackStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 0;
                c.gridy = 12;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseSpecialAttackStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 2;
                c.gridy = 12;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseDefenseStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 0;
                c.gridy = 13;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseSpecialDefenseStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 2;
                c.gridy = 13;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea();
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 14;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("Evolution Trigger: " + PokemonSelection.PokemonEvolutionTrigger(id));
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 15;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("Evolution Chain: " + PokemonSelection.PokemonEvolutions(id));
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 16;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea();
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 17;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);
/*
                // Couldn't get this button to work
                button = new JButton("Click for move INFO");
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 18;
                info.setEditable(false);
                gridbag.setConstraints(button, c);
                pokemonInformation.add(button);
                button.addActionListener(e1 -> {
                    JFrame Moves = new JFrame("Move List");
                    Moves.setVisible(true);
                    Moves.setLocationRelativeTo(null);

                });
*/
                // Doesn't fit to UI properly
                info = new JTextArea(PokemonSelection.PokemonMove(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 0;
                c.gridy = 18;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonMoveType(id));
                c.weightx = 0.0;
                c.gridwidth = 1;
                c.gridx = 2;
                c.gridy = 18;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonMovePP(id));
                c.weightx = 0.0;
                c.gridwidth = 1;
                c.gridx = 3;
                c.gridy = 18;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonMovePower(id));
                c.weightx = 0.0;
                c.gridwidth = 1;
                c.gridx = 4;
                c.gridy = 18;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonMoveAccuracy(id));
                c.weightx = 0.0;
                c.gridwidth = 3/4;
                c.gridx = 4;
                c.gridy = 18;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonMoveDamageClass(id));
                c.weightx = 0.0;
                c.gridwidth = 1;
                c.gridx = 4;
                c.gridy = 18;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                pokemonInformation.updateUI();
            });

            pane.add(pokemonNames, constraints);
            pokemonList.add(pane);
        }

        GridLayout griddy = new GridLayout(0, 2);
        window.setLayout(griddy);
        window.add(BorderLayout.WEST, scroll_1);
        window.add(BorderLayout.EAST, scroll_2);
        window.setSize(800, 600);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}
