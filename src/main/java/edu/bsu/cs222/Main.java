package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        System.out.println("Enter a pokemon id to search: ");
        int id = console.nextInt();

        System.out.println(PokemonSelection.PokemonId(id)); //1
        System.out.println(PokemonSelection.PokemonName(id)); //1
        System.out.println(PokemonSelection.PokemonGeneration(id)); //1
        System.out.println();
        System.out.println(PokemonSelection.PokemonHeight(id)); //1
        System.out.println(PokemonSelection.PokemonWeight(id)); //1
        System.out.println();
        System.out.println(PokemonSelection.PokemonBaseExperience(id)); //1
        System.out.println();
        System.out.println(PokemonSelection.Types(id)); //1,2
        System.out.println();
        System.out.println(PokemonSelection.Abilities(id)); //2
        System.out.println(PokemonSelection.HiddenAbility(id)); //2
        System.out.println();
        //System.out.println(PokemonSelection.PokemonBaseStat(id));
        System.out.println(PokemonSelection.PokemonEvolutions(id)); //2
        System.out.println(PokemonSelection.PokemonEvolutionTrigger(id)); //2
        System.out.println();
        System.out.println(PokemonSelection.PokemonLocation(id)); //2
        System.out.println();
        System.out.println(PokemonSelection.PokemonBaseAttackStat(id)); //2
        System.out.println(PokemonSelection.PokemonBaseDefenseStat(id)); //2
        System.out.println(PokemonSelection.PokemonBaseHealthPointsStat(id)); //2
        System.out.println(PokemonSelection.PokemonBaseSpecialAttackStat(id)); //2
        System.out.println(PokemonSelection.PokemonBaseSpecialDefenseStat(id)); //2
        System.out.println(PokemonSelection.PokemonBaseSpeedStat(id)); //2
        System.out.println();
        System.out.println(PokemonMoveData.PokemonMove(id)); //2

        console.close();

    }

}
