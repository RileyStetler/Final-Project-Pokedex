package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.net.URL;
import java.util.Scanner;

public class PokemonSelection {


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
/*
    public static int main(int pokemon) {
        PokeApi pokeApi = new PokeApiClient();
        Scanner console = new Scanner(System.in);
        int pokemonSelection = console.nextInt();
        PokemonSpecies bulbasaur = pokeApi.getPokemonSpecies(pokemonSelection);

        TypeRelations typeRelations = new TypeRelations();
        Type type = new Type();
        NamedApiResource namedApi = new NamedApiResource();
        PokemonStat stat = new PokemonStat(namedApi,1,1);
        PokemonStat ivysaur = stat.getBaseStat(pokemonSelection);
        System.out.println(bulbasaur.getId());
        System.out.println(bulbasaur.getName());
        System.out.println(bulbasaur.getFormDescriptions());
        System.out.println(bulbasaur.get);

        return pokemonSelection;
    }
*/
}
