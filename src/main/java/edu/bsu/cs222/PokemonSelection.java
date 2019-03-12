package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.net.URL;
import java.util.Scanner;

public class PokemonSelection {

    /*
    private static void Pokemon() {

        System.out.println("Enter a Pokemon ID to search");
        Scanner console = new Scanner(System.in);
        int pokeSelection = console.nextInt();
        System.out.println(pokeSelection);

        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(1);
        System.out.println(pokemon);

        PokemonSpecies IDNumber = pokeApi.getPokemonSpecies(pokeSelection);
        System.out.println(IDNumber.getName());
        System.out.println(IDNumber.getGeneration().getName());
        System.out.println(IDNumber.getEvolvesFromSpecies());
        System.out.println();
        System.out.println("Catch Rate: " + IDNumber.getCaptureRate());
        System.out.println(IDNumber.getHabitat().getName());
        System.out.println();
        System.out.println();



    }


    public static void main(String[] args) {
      PokemonSelection.Pokemon();
    }
    */

    public static int PokemonId(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return pokemon.getId();
    }

    public static String PokemonName(String id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(Integer.parseInt(id));
        return pokemon.getName();
    }

    public static String PokemonGeneration(String id) {
        PokeApi pokeApi = new PokeApiClient();
        PokemonSpecies pokemonSpecies = pokeApi.getPokemonSpecies(Integer.parseInt(id));
        return pokemonSpecies.getGeneration().getName();
    }
}
