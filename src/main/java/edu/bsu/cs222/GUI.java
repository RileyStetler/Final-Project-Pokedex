package edu.bsu.cs222;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

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


        JPanel pane = new JPanel(new GridBagLayout());
        Font f = new Font("Serif", Font.BOLD, 16);

        for (int i = 1; i < 25; i++) {
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
                System.out.println(PokemonSelection.PokemonId(id));
                System.out.println(PokemonSelection.PokemonName(id));

                JButton button;
                JTextArea info;

                GridBagLayout gridbag = new GridBagLayout();
                GridBagConstraints c = new GridBagConstraints();
                pokemonInformation.setLayout(gridbag);
                c.fill = GridBagConstraints.HORIZONTAL;

                info = new JTextArea(PokemonSelection.PokemonName(id));
                c.weightx = 1.0;
                c.gridwidth = 2;
                c.gridx = 0;
                c.gridy = 0;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("ID: " + PokemonSelection.PokemonId(id));
                c.weightx = 1.0;
                c.gridwidth = 1;
                c.gridx = 2;
                c.gridy = 0;
                info.setEditable(false);
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.Types(id));
                c.gridx = 3;
                c.gridy = 0;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseHealthPointsStat(id));
                //c.ipady = 40;      //make this component tall
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 0;
                c.gridy = 1;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("Height: " + PokemonSelection.PokemonHeight(id));
                //c.ipady = 40;      //make this component tall
                c.weightx = 0.0;
                c.gridwidth = 1;
                c.gridx = 2;
                c.gridy = 1;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("Weight: " + PokemonSelection.PokemonWeight(id));
                //c.ipady = 40;      //make this component tall
                c.weightx = 0.0;
                c.gridwidth = 1;
                c.gridx = 3;
                c.gridy = 1;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea();
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 2;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseAttackStat(id));
                c.weightx = 0.0;
                c.gridwidth = 3;
                c.gridx = 0;
                c.gridy = 3;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseDefenseStat(id));
                c.weightx = 0.0;
                c.gridwidth = 3;
                c.gridx = 0;
                c.gridy = 4;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseSpecialAttackStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 3;
                c.gridy = 3;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseAttackStat(id));
                c.weightx = 0.0;
                c.gridwidth = 2;
                c.gridx = 3;
                c.gridy = 4;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea(PokemonSelection.PokemonBaseSpeedStat(id));
                c.weightx = 0.0;
                c.gridwidth = 5;
                c.gridx = 0;
                c.gridy = 5;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea();
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 6;
                gridbag.setConstraints(info, c);
                pokemonInformation.add(info);

                info = new JTextArea("Evolution Chain: " + PokemonSelection.PokemonEvolutions(id));
                c.weightx = 0.0;
                c.gridwidth = 4;
                c.gridx = 0;
                c.gridy = 7;
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
        System.out.println("DONE");

        /*
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridy = GridBagConstraints.RELATIVE;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 1;
        grid.setConstraints(panel_1, constraints);
        window.add(panel_1);
        */
    }
}
