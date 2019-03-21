package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;
import me.sargunvohra.lib.pokekotlin.model.PokemonStat;

import java.text.DecimalFormat;
import java.util.List;

import static java.lang.Math.round;

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
    public static String PokemonId(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        String one = "#00";
        String two = "#0";
        if (id < 10) {
            return one + pokemon.getId();
        } else if (id >= 10 && id < 100) {
            return two + pokemon.getId();
        } else if (id >= 100) {
            return "#" + pokemon.getId();
        }
        return null;
    }

    public static String PokemonName(int id) {
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return pokemon.getName();
    }

    public static String PokemonHeight(int id) {
        DecimalFormat df = new DecimalFormat("#.##");
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return (df.format(pokemon.getHeight()*0.1) + " m");
    }

    public static String PokemonWeight(int id) {
        DecimalFormat df = new DecimalFormat("#.##");
        PokeApi pokeApi = new PokeApiClient();
        Pokemon pokemon = pokeApi.getPokemon(id);
        return (df.format(pokemon.getWeight()*0.1) + " kg");
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

    // Prints up to two of the normal abilities
    public static String Abilities(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonAbility> pokemonAbilities = pokeApi.getPokemon(id).getAbilities();
        for (PokemonAbility pokemonAbility : pokemonAbilities) {
            if (pokemonAbilities.size() <= 2 && !pokemonAbility.isHidden()) {
                return pokemonAbility.getAbility().getName();
            } else if (pokemonAbilities.size() > 2 && !pokemonAbility.isHidden()){
                String pokemonAbility1 = pokeApi.getPokemon(id).getAbilities().get(1).getAbility().getName();
                String pokemonAbility2 = pokeApi.getPokemon(id).getAbilities().get(2).getAbility().getName();
                return pokemonAbility1 + ", " + pokemonAbility2;
            }
        }
        return null;
    }

    // Prints the hidden ability
    public static String HiddenAbility(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonAbility> pokemonAbilities = pokeApi.getPokemon(id).getAbilities();
        for (PokemonAbility pokemonAbility : pokemonAbilities) {
            if (pokemonAbility.isHidden()) {
                return pokemonAbility.getAbility().getName() + " (Hidden)";
            }
        }
        return null;
    }

/*
    // I'm still unsure what this class is for, and why the test is checking to see if it is true
    public static List<PokemonAbility> Ability(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonAbility> pokemonAbility = pokeApi.getPokemon(id).getAbilities();
        return pokemonAbility;
    }
    */

    public static String PokemonBaseSpeedStat(int id) {
        PokeApi pokeApi = new PokeApiClient();
        String pokemon = pokeApi.getPokemon(id).getStats().get(0).getStat().getName();
        String statValue = String.valueOf(pokeApi.getPokemon(id).getStats().get(0).getBaseStat());
        return pokemon + ": " + statValue;
    }

//A for-loop that will print the base stats automatically
//CURRENTLY BROKEN
/*
    public static String PokemonBaseStat(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonStat> pokemon = pokeApi.getPokemon(id).getStats();
        for(int i = 0; i < pokemon.size(); i++){
            String pokemonName = pokeApi.getPokemon(id).getStats().get(i).getStat().getName();
            String statValue = String.valueOf(pokeApi.getPokemon(id).getStats().get(i).getBaseStat());
            return pokemonName + ": " + statValue;
        }
        return null;
    }
*/
    public static String PokemonBaseSpecialDefenseStat(int id) {
        PokeApi pokeApi = new PokeApiClient();
        String pokemon = pokeApi.getPokemon(id).getStats().get(1).getStat().getName();
        String statValue = String.valueOf(pokeApi.getPokemon(id).getStats().get(1).getBaseStat());
        return pokemon + ": " + statValue;
    }

    public static String PokemonBaseSpecialAttackStat(int id) {
        PokeApi pokeApi = new PokeApiClient();
        String pokemon = pokeApi.getPokemon(id).getStats().get(2).getStat().getName();
        String statValue = String.valueOf(pokeApi.getPokemon(id).getStats().get(2).getBaseStat());
        return pokemon + ": " + statValue;
    }

    public static String PokemonBaseDefenseStat(int id) {
        PokeApi pokeApi = new PokeApiClient();
        String pokemon = pokeApi.getPokemon(id).getStats().get(3).getStat().getName();
        String statValue = String.valueOf(pokeApi.getPokemon(id).getStats().get(3).getBaseStat());
        return pokemon + ": " + statValue;
    }

    public static String PokemonBaseAttackStat(int id) {
        PokeApi pokeApi = new PokeApiClient();
        String pokemon = pokeApi.getPokemon(id).getStats().get(4).getStat().getName();
        String statValue = String.valueOf(pokeApi.getPokemon(id).getStats().get(4).getBaseStat());
        return pokemon + ": " + statValue;
    }

    public static String PokemonBaseHealthPointsStat(int id) {
        PokeApi pokeApi = new PokeApiClient();
        String pokemon = pokeApi.getPokemon(id).getStats().get(5).getStat().getName();
        String statValue = String.valueOf(pokeApi.getPokemon(id).getStats().get(5).getBaseStat());
        return pokemon + ": " + statValue;
    }

}


