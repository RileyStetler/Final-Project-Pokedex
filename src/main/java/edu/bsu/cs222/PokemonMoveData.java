package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.util.List;

public class PokemonMoveData {

    public static NamedApiResource NamedApiResources(int id) {
        PokeApi pokeApi = new PokeApiClient();
        String typeName = String.valueOf(pokeApi.getPokemon(id).getTypes());
        NamedApiResource namedApiResource = new NamedApiResource(typeName, pokeApi.getPokemon(id).getName(), pokeApi.getPokemon(id).getId());
        return namedApiResource;
    }
/*
    public static Move NamedApiResources(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List<PokemonMove> typeName = pokeApi.getPokemon(id).getMoves();
        NamedApiResource namedApiResource = new NamedApiResource(typeName, pokeApi.getM);
        return namedApiResource;
    }
*/
    public static String PokemonMove(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokemonMove.getMove().getName()).append("\n");
        }
        return sb.toString();
    }
/* Not in this iteration
    //uses move ID, not Pokemon ID
    public static String PokemonMoveType(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokemonMove.getMove().getName()).append("\n");
            for (PokemonMove pokemonMove1 : pokemonMoves) {
                sb1.append(pokeApi.getMove())
            }
        }
    }

    public static String PokemonMoveAccuracy(int id){
        PokeApi pokeApi = new PokeApiClient();
        Move pokemonMove = pokeApi.getMove(id);
        //Accuracy pokemonAccuracy = pokeApii.getAccuracy(id);
        return pokemonMove.get;
    } */
}
