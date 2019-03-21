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
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(PokemonSelection.PokemonBaseSpeedStat(id));
        System.out.println(PokemonSelection.PokemonBaseSpecialDefenseStat(id));
        System.out.println(PokemonSelection.PokemonBaseSpecialAttackStat(id));
        System.out.println(PokemonSelection.PokemonBaseDefenseStat(id));
        System.out.println(PokemonSelection.PokemonBaseAttackStat(id));
        System.out.println(PokemonSelection.PokemonBaseHealthPointsStat(id));


        console.close();

    }

}
