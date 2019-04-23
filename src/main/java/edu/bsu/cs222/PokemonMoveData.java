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

    // Not sure what to do here
    /*
    public static String PokemonMoveLearnMethod(int id) {
        PokeApi pokeApi = new PokeApiClient();
        StringBuilder sb = new StringBuilder();
        List<PokemonMove> pokemonMoves = pokeApi.getPokemon(id).getMoves();
        List<PokemonMove> moveIds = pokeApi.getPokemon(id).getMoves();
        for (int moveId = 0; moveId < moveIds.size(); moveId++) {
            String generation = pokeApi.getMove(moveId).getGeneration().getName();
            for (PokemonMove pokemonMove : pokemonMoves) {
                List<PokemonMoveVersion> pokemonMoveVersions = pokemonMove.getVersionGroupDetails();
                for (PokemonMoveVersion pokemonMoveVersion : pokemonMoveVersions) {
                    if (generation.equals("generation-i")) {
                        if (pokemonMoveVersion.getVersionGroup().getName().equals("yellow")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("red-blue")) {
                            sb.append(pokemonMoveVersion.getMoveLearnMethod().getName()).append("\n");
                        }
                    } else if (generation.equals("generation-ii")) {
                        if (pokemonMoveVersion.getVersionGroup().getName().equals("crystal")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("gold-silver")) {
                            sb.append(pokemonMoveVersion.getMoveLearnMethod().getName()).append("\n");
                        }
                    } else if (generation.equals("generation-iii")) {
                        if (pokemonMoveVersion.getVersionGroup().getName().equals("emerald")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("firered-leafgreen")) {
                            sb.append(pokemonMoveVersion.getMoveLearnMethod().getName()).append("\n");
                        }
                    } else if (generation.equals("generation-iv")) {
                        if (pokemonMoveVersion.getVersionGroup().getName().equals("diamond-pearl")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("platinum")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("heartgold-soulsilver")) {
                            sb.append(pokemonMoveVersion.getMoveLearnMethod().getName()).append("\n");
                        }
                    } else if (generation.equals("generation-v")) {
                        if (pokemonMoveVersion.getVersionGroup().getName().equals("black-white")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("black-2-white-2")) {
                            sb.append(pokemonMoveVersion.getMoveLearnMethod().getName()).append("\n");
                        }
                    } else if (generation.equals("generation-vi")) {
                        if (pokemonMoveVersion.getVersionGroup().getName().equals("x-y")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("omega-ruby-alpha-sapphire")) {
                            sb.append(pokemonMoveVersion.getMoveLearnMethod().getName()).append("\n");
                        }
                    } else if (generation.equals("generation-vii")) {
                        if (pokemonMoveVersion.getVersionGroup().getName().equals("sun-moon")
                                || pokemonMoveVersion.getVersionGroup().getName().equals("ultra-sun-ultra-moon")) {
                            sb.append(pokemonMoveVersion.getMoveLearnMethod().getName()).append("\n");
                        }
                    }
                }
            }
        }
        return sb.toString();
    } */
}
