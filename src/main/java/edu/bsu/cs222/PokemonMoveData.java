package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.*;

import java.util.List;

public class PokemonMoveData {

    public static NamedApiResourceList NamedApiResourcesList(int id) {
        PokeApi pokeApi = new PokeApiClient();
        List <PokemonMove> pokemonMove = pokeApi.getPokemon(id).getMoves();
        NamedApiResourceList namedApiResourceList = new NamedApiResourceList(pokemonMove, pokeApi.getPokemon(id).getName(), pokeApi.getPokemon(id).getId());
        return namedApiResourceList;
    }

    public static String PokemonMove(int id){
        PokeApi pokeApi = new PokeApiClient();
        PokemonMove pokemonMove = pokeApi.getMoveList(id, 742);
        return pokemonMove;
    }
}
