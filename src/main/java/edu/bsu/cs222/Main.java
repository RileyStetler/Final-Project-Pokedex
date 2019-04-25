package edu.bsu.cs222;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        System.out.println("Enter a pokemon id to search: ");
        int id = console.nextInt();

        System.out.println("Sprite: " + PokemonSelection.PokemonSprite(id));
        System.out.println("ID: " + PokemonSelection.PokemonId(id));
        System.out.println("Name: " + PokemonSelection.PokemonName(id));
        System.out.println("Types: " + PokemonSelection.Types(id));
        System.out.println("Generation: " + PokemonSelection.PokemonGeneration(id));
        System.out.println("Description: " + PokemonSelection.PokemonDescription(id));
        System.out.println();
        System.out.println("Height: " + PokemonSelection.PokemonHeight(id));
        System.out.println("Weight: " + PokemonSelection.PokemonWeight(id));
        System.out.println();
        System.out.println("Base XP: " + PokemonSelection.PokemonBaseExperience(id));
        System.out.println();
        System.out.println("Abilities: ");
        System.out.println(PokemonSelection.Abilities(id));
        System.out.println(PokemonSelection.HiddenAbility(id));
        System.out.println();
        System.out.println("Evolution Trigger: " + PokemonSelection.PokemonEvolutionTrigger(id));
        System.out.println("Evolutions: " + PokemonSelection.PokemonEvolutions(id));
        System.out.println();
        System.out.println("Location Found: " + PokemonSelection.PokemonLocation(id));
        System.out.println();
        System.out.println("Base Stats: ");
        System.out.println(PokemonSelection.PokemonBaseSpeedStat(id));
        System.out.println(PokemonSelection.PokemonBaseHealthPointsStat(id));
        System.out.println(PokemonSelection.PokemonBaseAttackStat(id));
        System.out.println(PokemonSelection.PokemonBaseDefenseStat(id));
        System.out.println(PokemonSelection.PokemonBaseSpecialAttackStat(id));
        System.out.println(PokemonSelection.PokemonBaseSpecialDefenseStat(id));
        System.out.println();
        System.out.println("Moves: ");
        System.out.println(PokemonSelection.PokemonMove(id));
        System.out.println();
        System.out.println("Move Types: ");
        System.out.println(PokemonSelection.PokemonMoveType(id));
        System.out.println();
        System.out.println("Move PP: ");
        System.out.println(PokemonSelection.PokemonMovePP(id));
        System.out.println();
        System.out.println("Move Power: ");
        System.out.println(PokemonSelection.PokemonMovePower(id));
        System.out.println();
        System.out.println("Move Accuracy: ");
        System.out.println(PokemonSelection.PokemonMoveAccuracy(id));
        System.out.println();
        System.out.println("Move Damage Class: ");
        System.out.println(PokemonSelection.PokemonMoveDamageClass(id));

        console.close();

    }

}
