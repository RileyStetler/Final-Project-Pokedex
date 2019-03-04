package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;
import java.util.Scanner;

public class PokemonSelection {

    private static void Pokemon() {
        System.out.println("Enter a Pokemon ID to search");
        Scanner console = new Scanner(System.in);
        int pokeSelection = console.nextInt();
        System.out.println(pokeSelection);
        PokeApi pokeApi = new PokeApiClient();
        PokemonSpecies IDNumber = pokeApi.getPokemonSpecies(pokeSelection);
        System.out.println(IDNumber.getName());
        System.out.println(IDNumber.getGeneration().getName());
        System.out.println(IDNumber.getEvolvesFromSpecies());
        System.out.println();
        System.out.println("Catch Rate: " + IDNumber.getCaptureRate());
        System.out.println(IDNumber.getHabitat().getName());

        if (pokeSelection == 1) {
            System.out.println("This is a starter pokemon and didn't evolve from another Pokemon.");
        } else {
            System.out.println(IDNumber.getEvolvesFromSpecies().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a Pokemon ID to search");
        PokeApi pokeApi = new PokeApiClient();
        Scanner console = new Scanner(System.in);
        int pokeSelection = console.nextInt();
        PokemonSpecies bulbasaur = pokeApi.getPokemonSpecies(pokeSelection);
        System.out.println(bulbasaur.getId());
        System.out.println(bulbasaur.getName());
        System.out.println(bulbasaur.getGeneration());
        //PokemonSelection.Pokemon();
    }
}
