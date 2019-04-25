package edu.bsu.cs222;

import me.sargunvohra.lib.pokekotlin.model.Pokemon;
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
    public void testPokemonBaseSpeedStat(){
        final String input = PokemonSelection.PokemonBaseSpeedStat(1);
        final String output = ("speed: " + 45);
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonBaseAttackStat(){
        final String input =PokemonSelection.PokemonBaseAttackStat(1);
        final String output = ("attack: " + 49);
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonBaseDefenseStat(){
        final String input =PokemonSelection.PokemonBaseDefenseStat(1);
        final String output = ("defense: " + 49);
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonBaseSpecialAttackStat(){
        final String input =PokemonSelection.PokemonBaseSpecialAttackStat(1);
        final String output = ("special-attack: " + 65);
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonBaseSpecialDefenseStat(){
        final String input =PokemonSelection.PokemonBaseSpecialDefenseStat(1);
        final String output = ("special-defense: " + 65);
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonBaseHealthPointsStat(){
        final String input =PokemonSelection.PokemonBaseHealthPointsStat(1);
        final String output = ("hp: " + 45);
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonLocation() {
        final String input = PokemonSelection.PokemonLocation(4);
        final String output = ("mountain");
        Assert.assertEquals(input, output);
    }


    @Test
    public void testPokemonNoEvolutions() {
        final String input = PokemonSelection.PokemonEvolutions(83);
        final String output = ("There are no other evolutions.");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonTwoEvolutions1() {
        final String input = PokemonSelection.PokemonEvolutions(19);
        final String output = ("raticate");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonTwoEvolutions2() {
        final String input = PokemonSelection.PokemonEvolutions(20);
        final String output = ("rattata");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonThreeEvolutions1() {
        final String input = PokemonSelection.PokemonEvolutions(4);
        final String output = ("charmeleon, charizard");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonThreeEvolutions2() {
        final String input = PokemonSelection.PokemonEvolutions(5);
        final String output = ("charmander, charizard");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonThreeEvolutions3() {
        final String input = PokemonSelection.PokemonEvolutions(6);
        final String output = ("charmander, charmeleon");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonAlternateEvolution1(){
        final String input = PokemonSelection.PokemonEvolutions(43);
        final String output = ("gloom,(vileplume, bellossom)");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonAlternateEvolution2() {
        final String input = PokemonSelection.PokemonEvolutions(44);
        final String output = ("oddish,(vileplume, bellossom)");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonIfAlternateEvolution() {
        final String input = PokemonSelection.PokemonEvolutions(45);
        final String output = ("oddish, gloom");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testEevee() {
        final String input = PokemonSelection.PokemonEvolutions(133);
        final String output = ("vaporeon, jolteon, flareon, espeon, umbreon, leafeon, glaceon, sylveon");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testNotEevee() {
        final String input = PokemonSelection.PokemonEvolutions(134);
        final String output = ("eevee");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonEvolutionTrigger1() {
        final String input = PokemonSelection.PokemonEvolutionTrigger(4);
        final String output = ("There is no evolution trigger.");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonEvolutionTrigger2() {
        final String input = PokemonSelection.PokemonEvolutionTrigger(5);
        final String output = ("level-up");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonEvolutionTrigger3() {
        final String input = PokemonSelection.PokemonEvolutionTrigger(6);
        final String output = ("level-up");
        Assert.assertEquals(input, output);
    }
}
