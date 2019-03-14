package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.util.List;

//This class pulls all of the information that we need from PokeApi.co and separates them into different methods.
//This is so that we can print more specifically what we want.
public class PokemonSelection {

    public static NamedApiResource NamedApiResources(int id) {
        PokeApi pokeApi = new PokeApiClient();
        NamedApiResource namedApiResource = new NamedApiResource(pokeApi.getPokemon(id).getName(), pokeApi.getTypeList(pokeApi.getPokemon(id).getId(), id).getNext(), pokeApi.getPokemon(id).getId());
        return namedApiResource;
    }

    //Methods using the "Pokemon" class
    public static int PokemonId(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return pokemon.getId();
    }

    public static String PokemonName(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return pokemon.getName();
    }

    public static String PokemonHeight(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return (pokemon.getHeight()*0.1 + " m");
    }

    public static String PokemonWeight(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return (pokemon.getWeight()*0.1 + " kg");
    }

    public static String PokemonBaseExperience(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return (pokemon.getBaseExperience() + " XP");
    }

    //Methods using the "PokemonSpecies" class
    public static String PokemonGeneration(int id) {
        PokeApi pokeApi = new PokeApiClient();
        PokemonSpecies pokemonSpecies = pokeApi.getPokemonSpecies(id);
        return pokemonSpecies.getGeneration().getName();
    }

    //Methods using the "Type" class
    public static List<PokemonType> Types(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonType> pokemonType = pokeApi.getPokemon(id).getTypes();
        return pokemonType;
    }
}
