package edu.bsu.cs222;

import edu.bsu.cs222.PokemonData;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

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
        final String input = pokemonSelection.PokemonName("004");
        final String output = "charmander";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonGeneration() {
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final String input = pokemonSelection.PokemonGeneration("004");
        final String output = "generation-i";
        Assert.assertEquals(input, output);
    }
/*
    @Test
    public void testReturnPokemonWeight(){
        final PokemonSelection pokemonWeight = new PokemonSelection();
        final String output= pokemonWeight.main(input);
    }
    */
}
