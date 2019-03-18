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
        String typeName = String.valueOf(pokeApi.getPokemon(id).getTypes());
        NamedApiResource namedApiResource = new NamedApiResource(typeName, pokeApi.getPokemon(id).getName(), pokeApi.getPokemon(id).getId());
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
    public static String Types(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonType> pokemonTypes = pokeApi.getPokemon(id).getTypes();
        if(pokemonTypes.size() <= 1) {
            for (PokemonType pokemonType : pokemonTypes) {
                return pokemonType.getType().getName();
            }
        } else {
            String pokemonType1 = pokeApi.getPokemon(id).getTypes().get(0).getType().getName();
            String pokemonType2 = pokeApi.getPokemon(id).getTypes().get(1).getType().getName();
            return pokemonType1 + ", " + pokemonType2;
        }
        return null;
    }

    //Currently only prints 2 abilities, plan on splitting up into 2 methods
    public static String Abilities(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonAbility> pokemonAbilities = pokeApi.getPokemon(id).getAbilities();
        if (pokemonAbilities.size() <= 1) {
            for (PokemonAbility pokemonAbility : pokemonAbilities) {
                return pokemonAbility.getAbility().getName();
            }
        } else {
            String pokemonAbility1 = pokeApi.getPokemon(id).getAbilities().get(0).getAbility().getName();
            String pokemonAbility2 = pokeApi.getPokemon(id).getAbilities().get(1).getAbility().getName();
            return pokemonAbility1 + ", " + pokemonAbility2;
        }
        return null;
    }

    public static List<PokemonAbility> Ability(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonAbility> pokemonAbility = pokeApi.getPokemon(id).getAbilities();
        return pokemonAbility;
    }
}
