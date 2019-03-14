package edu.bsu.cs222;

import edu.bsu.cs222.PokemonData;
import me.sargunvohra.lib.pokekotlin.model.NamedApiResource;
import me.sargunvohra.lib.pokekotlin.model.PokemonType;
import me.sargunvohra.lib.pokekotlin.model.TypePokemon;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Tests {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    //Tests that use the "Pokemon" class
    @Test
    public void testPokemonId() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final int input = pokemonSelection.PokemonId(004);
        final int output = 004;
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonName() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final String input = pokemonSelection.PokemonName(004);
        final String output = "charmander";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonHeight() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final String input = pokemonSelection.PokemonHeight(004);
        final String output = "6 m";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonWeight() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final String input = pokemonSelection.PokemonWeight(004);
        final String output = "85 kg";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonBaseExperience() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final String input = pokemonSelection.PokemonBaseExperience(004);
        final String output = "62 XP";
        Assert.assertEquals(input, output);
    }

    //Tests that use the "PokemonSpecies" class
    @Test
    public void testReturnPokemonGeneration() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final String input = pokemonSelection.PokemonGeneration(004);
        final String output = "generation-i";
        Assert.assertEquals(input, output);
    }

    //Tests that use the "Type" class
    @Test
    public void testReturnPokemonType() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final List<PokemonType> input = pokemonSelection.Types(004);
        final String output = "water";
        Assert.assertEquals(input, output);
    }
}
