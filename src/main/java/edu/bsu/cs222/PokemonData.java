package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.util.Arrays;
import java.util.Scanner;

public class PokemonData {
    public static void Pokemon(int id) {
        //Scanner console = new Scanner(System.in);

        //System.out.println("Enter a Pokemon ID: ");
        //int id = console.nextInt();

        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        PokemonSpecies IDnumber = pokeApi.getPokemonSpecies(id);
        //Generation type = pokeApi.getGeneration(id);
        Type pokemonType = pokeApi.getType(id);
        Ability Abilities = pokeApi.getAbility(id);

        //System.out.println(pokemon);
        System.out.println();
        System.out.println("Pokemon ID: " + pokemon.getId()); //
        System.out.println("Pokemon Name: " + pokemon.getName()); //
        System.out.println("Height: " + (pokemon.getHeight()) * 0.1 + " m"); //
        System.out.println("Weight: " + (pokemon.getWeight()) * 0.1 + " kg"); //
        System.out.println("Base Experience: " + pokemon.getBaseExperience() + " XP"); //
        System.out.println("Type: " + pokemonType.getName());
        System.out.println("Generation: " + IDnumber.getGeneration().getName()); //
        System.out.println("Ability: " + Abilities.getName());

        System.out.println("Base States: " + pokemon.getStats().get(1));

        System.out.println("Evolves from: " + IDnumber.getEvolvesFromSpecies().getName());



//yes
        //ID
        //Name
        //Base stats
        //Type
        //Evolutions
        //Generation
        //Description
        //Nickname
        //abilities --> description of abilities
        //gender
        //HP, defense, attack, special attack, special defense, speed, total of all stats
        //moves a pokemon can learn




    }

    public static void main(String[] args) {
        PokemonData.Pokemon(Integer.parseInt(Arrays.toString(args)));
    }
}
