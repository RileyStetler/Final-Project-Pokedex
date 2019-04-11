package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.util.List;

public class PokemonMoveData {

    public static String PokemonMove(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokemonMove.getMove().getName()).append("\n");
        }
        return sb.toString();
    }

    //uses move ID, not Pokemon ID
    public static String PokemonMoveType(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokeApi.getMove(pokemonMove.getMove().getId()).getType().getName()).append("\n");
        }
        return sb.toString();
    }

    public static String PokemonMovePP(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokeApi.getMove(pokemonMove.getMove().getId()).getPp()).append("\n");
        }
        return sb.toString();
    }

    public static String PokemonMovePower(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokeApi.getMove(pokemonMove.getMove().getId()).getPower()).append("\n");
        }
        return sb.toString();
    }

    public static String PokemonMoveAccuracy(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokeApi.getMove(pokemonMove.getMove().getId()).getAccuracy()).append("\n");
        }
        return sb.toString();
    }

    public static String PokemonMoveDamageClass(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        for (PokemonMove pokemonMove : pokemonMoves) {
            sb.append(pokeApi.getMove(pokemonMove.getMove().getId()).getDamageClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
