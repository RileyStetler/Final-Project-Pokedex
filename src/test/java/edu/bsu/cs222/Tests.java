package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    //Tests that use the "Pokemon" class
    @Test
    public void testPokemonIdLessThan10() {
        final String input = PokemonSelection.PokemonId(4);
        final String output = "#004";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonIdLessThan100() {
        final String input = PokemonSelection.PokemonId(16);
        final String output = "#016";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonIdGreaterThan99() {
        final String input = PokemonSelection.PokemonId(103);
        final String output = "#103";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonName() {
        final String input = PokemonSelection.PokemonName(4);
        final String output = "charmander";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonHeight() {
        final String input = PokemonSelection.PokemonHeight(4);
        final String output = "0.6 m";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonWeight() {
        final String input = PokemonSelection.PokemonWeight(4);
        final String output = "8.5 kg";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonBaseExperience() {
        final String input = PokemonSelection.PokemonBaseExperience(4);
        final String output = "62 XP";
        Assert.assertEquals(input, output);
    }

    //Tests that use the "PokemonSpecies" class
    @Test
    public void testReturnPokemonGeneration() {
        final String input = PokemonSelection.PokemonGeneration(4);
        final String output = "generation-i";
        Assert.assertEquals(input, output);
    }

    //Tests that use the "Type" class
    @Test
    public void testReturnPokemonOneType() {
        final String input = PokemonSelection.Types(4);
        final String output = "fire";
        Assert.assertEquals(input, output);
    }

    @Test
    public void testReturnPokemonTwoTypes() {
        final String input = PokemonSelection.Types(1);
        final String output = ("poison, grass");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonAbilitiesOne() {
        final String input = PokemonSelection.Abilities(4);
        final String output = ("blaze");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonAbilitiesTwo() {
        final String input = PokemonSelection.Abilities(16);
        final String output = ("tangled-feet, keen-eye");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonHiddenAbility() {
        final String input = PokemonSelection.HiddenAbility(4);
        final String output = ("solar-power (Hidden)");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonLocation() {
        final String input = PokemonSelection.PokemonLocation(4);
        final String output = ("Forest");
        Assert.assertEquals(input, output);
    }

    //Test Failing
    /*
    @Test
    public void testPokemonAbility(){
        final PokemonSelection pokemonSelection = new PokemonSelection();
        final List<PokemonAbility> input = pokemonSelection.Ability(001);
        final boolean output = (true);
        Assert.assertEquals(input, output);
    }
    */
}
