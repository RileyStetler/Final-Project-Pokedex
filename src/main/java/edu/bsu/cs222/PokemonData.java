package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.util.Arrays;
import java.util.Scanner;

public class PokemonData {
    public static void Pokemon(int id) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a Pokemon ID: ");
        id = console.nextInt();

        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        PokemonSpecies IDnumber = pokeApi.getPokemonSpecies(id);
        //Generation type = pokeApi.getGeneration(id);
        //Type pokemonType = pokeApi.getType(id);
        String pokemonType = pokeApi.getPokemon(id).getTypes().get(0).getType().getName();
        Ability Abilities = pokeApi.getAbility(id);

        //System.out.println(pokemon);
        System.out.println();
        System.out.println("Pokemon ID: " + pokemon.getId()); //
        System.out.println("Pokemon Name: " + pokemon.getName()); //
        System.out.println("Height: " + (pokemon.getHeight()) * 0.1 + " m"); //
        System.out.println("Weight: " + (pokemon.getWeight()) * 0.1 + " kg"); //
        System.out.println("Base Experience: " + pokemon.getBaseExperience() + " XP"); //
        System.out.println("Type: " + pokemonType);
        System.out.println("Generation: " + IDnumber.getGeneration().getName()); //
        System.out.println("Ability: " + Abilities.getName());

        System.out.println("Base States: " + pokemon.getStats().get(1));

        System.out.println("Evolves from: " + IDnumber.getEvolvesFromSpecies().getName());

        System.out.println(pokemon.getStats().parallelStream());
    }

    public static void main(String[] args) {
        PokemonData.Pokemon(Integer.parseInt(Arrays.toString(args)));
    }
}
