package edu.bsu.cs222;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        System.out.println("Enter a pokemon id to search: ");
        int id = console.nextInt();

        System.out.println(PokemonSelection.PokemonId(id));
        System.out.println(PokemonSelection.PokemonName(id));
        System.out.println(PokemonSelection.PokemonGeneration(id));
        System.out.println(PokemonSelection.PokemonHeight(id));
        System.out.println(PokemonSelection.PokemonWeight(id));
        System.out.println(PokemonSelection.PokemonBaseExperience(id));
        System.out.println(PokemonSelection.Types(id));
        System.out.println(PokemonSelection.Abilities(id));
        System.out.println(PokemonSelection.HiddenAbility(id));
        //System.out.println(PokemonSelection.PokemonBaseStat(id));


        console.close();

    }

}
