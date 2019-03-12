package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

//This class pulls all of the information that we need from PokeApi.co and separates them into different methods.
//This is so that we can print more specifically what we want.
public class PokemonSelection {

    //Methods using the "Pokemon" class
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

    public static String PokemonHeight(String id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(Integer.parseInt(id));
        return (pokemon.getHeight() + " m");
    }

    public static String PokemonWeight(String id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(Integer.parseInt(id));
        return (pokemon.getWeight() + " kg");
    }

    public static String PokemonBaseExperience(String id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(Integer.parseInt(id));
        return (pokemon.getBaseExperience() + " XP");
    }

    //Methods using the "PokemonSpecies" class
    public static String PokemonGeneration(String id) {
        PokeApi pokeApi = new PokeApiClient();
        PokemonSpecies pokemonSpecies = pokeApi.getPokemonSpecies(Integer.parseInt(id));
        return pokemonSpecies.getGeneration().getName();
    }

    //Methods using the "Type" class
    /*   NOT FINISHED
    public static String PokemonType(String id) {
        PokeApi pokeApi = new PokeApiClient();
        Type type = pokeApi.getType(Integer.parseInt(id));
        return type.getName();
    }
    */
}
