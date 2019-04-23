package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class MoveTests {

    // There is a lot here, so hold tight.
    @Test
    public void testPokemonMove() {
        final String input = PokemonMoveData.PokemonMove(1);
        final String output = ("razor-wind\n" +
                "swords-dance\n" +
                "cut\n" +
                "bind\n" +
                "vine-whip\n" +
                "headbutt\n" +
                "tackle\n" +
                "body-slam\n" +
                "take-down\n" +
                "double-edge\n" +
                "growl\n" +
                "strength\n" +
                "mega-drain\n" +
                "leech-seed\n" +
                "growth\n" +
                "razor-leaf\n" +
                "solar-beam\n" +
                "poison-powder\n" +
                "sleep-powder\n" +
                "petal-dance\n" +
                "string-shot\n" +
                "toxic\n" +
                "rage\n" +
                "mimic\n" +
                "double-team\n" +
                "defense-curl\n" +
                "light-screen\n" +
                "reflect\n" +
                "bide\n" +
                "sludge\n" +
                "skull-bash\n" +
                "amnesia\n" +
                "flash\n" +
                "rest\n" +
                "substitute\n" +
                "snore\n" +
                "curse\n" +
                "protect\n" +
                "sludge-bomb\n" +
                "mud-slap\n" +
                "giga-drain\n" +
                "endure\n" +
                "charm\n" +
                "swagger\n" +
                "fury-cutter\n" +
                "attract\n" +
                "sleep-talk\n" +
                "return\n" +
                "frustration\n" +
                "safeguard\n" +
                "sweet-scent\n" +
                "synthesis\n" +
                "hidden-power\n" +
                "sunny-day\n" +
                "rock-smash\n" +
                "facade\n" +
                "nature-power\n" +
                "ingrain\n" +
                "knock-off\n" +
                "secret-power\n" +
                "grass-whistle\n" +
                "bullet-seed\n" +
                "magical-leaf\n" +
                "natural-gift\n" +
                "worry-seed\n" +
                "seed-bomb\n" +
                "energy-ball\n" +
                "leaf-storm\n" +
                "power-whip\n" +
                "captivate\n" +
                "grass-knot\n" +
                "venoshock\n" +
                "round\n" +
                "echoed-voice\n" +
                "grass-pledge\n" +
                "work-up\n" +
                "grassy-terrain\n" +
                "confide\n" +
                "");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonMoveTypes() {
        final String input = PokemonMoveData.PokemonMoveType(1);
        final String output = ("normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "grass\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "grass\n" +
                "grass\n" +
                "normal\n" +
                "grass\n" +
                "grass\n" +
                "poison\n" +
                "grass\n" +
                "grass\n" +
                "bug\n" +
                "poison\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "psychic\n" +
                "psychic\n" +
                "normal\n" +
                "poison\n" +
                "normal\n" +
                "psychic\n" +
                "normal\n" +
                "psychic\n" +
                "normal\n" +
                "normal\n" +
                "ghost\n" +
                "normal\n" +
                "poison\n" +
                "ground\n" +
                "grass\n" +
                "normal\n" +
                "fairy\n" +
                "normal\n" +
                "bug\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "normal\n" +
                "grass\n" +
                "normal\n" +
                "fire\n" +
                "fighting\n" +
                "normal\n" +
                "normal\n" +
                "grass\n" +
                "dark\n" +
                "normal\n" +
                "grass\n" +
                "grass\n" +
                "grass\n" +
                "normal\n" +
                "grass\n" +
                "grass\n" +
                "grass\n" +
                "grass\n" +
                "grass\n" +
                "normal\n" +
                "grass\n" +
                "poison\n" +
                "normal\n" +
                "normal\n" +
                "grass\n" +
                "normal\n" +
                "grass\n" +
                "normal\n" +
                "");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonMovePP() {
        final String input = PokemonMoveData.PokemonMovePP(1);
        final String output = ("10\n" +
                "20\n" +
                "30\n" +
                "20\n" +
                "25\n" +
                "15\n" +
                "35\n" +
                "15\n" +
                "20\n" +
                "15\n" +
                "40\n" +
                "15\n" +
                "15\n" +
                "10\n" +
                "20\n" +
                "25\n" +
                "10\n" +
                "35\n" +
                "15\n" +
                "10\n" +
                "40\n" +
                "10\n" +
                "20\n" +
                "10\n" +
                "15\n" +
                "40\n" +
                "30\n" +
                "20\n" +
                "10\n" +
                "20\n" +
                "10\n" +
                "20\n" +
                "20\n" +
                "10\n" +
                "10\n" +
                "15\n" +
                "10\n" +
                "10\n" +
                "10\n" +
                "10\n" +
                "10\n" +
                "10\n" +
                "20\n" +
                "15\n" +
                "20\n" +
                "15\n" +
                "10\n" +
                "20\n" +
                "20\n" +
                "25\n" +
                "20\n" +
                "5\n"  +
                "15\n" +
                "5\n"  +
                "15\n" +
                "20\n" +
                "20\n" +
                "20\n" +
                "20\n" +
                "20\n" +
                "15\n" +
                "30\n" +
                "20\n" +
                "15\n" +
                "10\n" +
                "15\n" +
                "10\n" +
                "5\n"  +
                "10\n" +
                "20\n" +
                "20\n" +
                "10\n" +
                "15\n" +
                "15\n" +
                "10\n" +
                "30\n" +
                "10\n" +
                "20\n" +
                "");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonMovePower() {
        final String input = PokemonMoveData.PokemonMovePower(1);
        final String output = ("80\n" +
                "null\n" +
                "50\n" +
                "15\n" +
                "45\n" +
                "70\n" +
                "40\n" +
                "85\n" +
                "90\n" +
                "120\n" +
                "null\n" +
                "80\n" +
                "40\n" +
                "null\n" +
                "null\n" +
                "55\n" +
                "120\n" +
                "null\n" +
                "null\n" +
                "120\n" +
                "null\n" +
                "null\n" +
                "20\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "65\n" +
                "130\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "50\n" +
                "null\n" +
                "null\n" +
                "90\n" +
                "20\n" +
                "75\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "40\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "60\n" +
                "null\n" +
                "40\n" +
                "70\n" +
                "null\n" +
                "null\n" +
                "65\n" +
                "70\n" +
                "null\n" +
                "25\n" +
                "60\n" +
                "null\n" +
                "null\n" +
                "80\n" +
                "90\n" +
                "130\n" +
                "120\n" +
                "null\n" +
                "null\n" +
                "65\n" +
                "60\n" +
                "40\n" +
                "80\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonMoveAccuracy() {
        final String input = PokemonMoveData.PokemonMoveAccuracy(1);
        final String output = ("100\n" +
                "null\n" +
                "95\n" +
                "85\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "85\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "90\n" +
                "null\n" +
                "95\n" +
                "100\n" +
                "75\n" +
                "75\n" +
                "100\n" +
                "95\n" +
                "90\n" +
                "100\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "100\n" +
                "100\n" +
                "null\n" +
                "100\n" +
                "null\n" +
                "null\n" +
                "100\n" +
                "null\n" +
                "null\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "null\n" +
                "100\n" +
                "85\n" +
                "95\n" +
                "100\n" +
                "null\n" +
                "100\n" +
                "100\n" +
                "null\n" +
                "100\n" +
                "null\n" +
                "100\n" +
                "null\n" +
                "100\n" +
                "100\n" +
                "null\n" +
                "null\n" +
                "100\n" +
                "100\n" +
                "55\n" +
                "100\n" +
                "null\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "90\n" +
                "85\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "100\n" +
                "null\n" +
                "null\n" +
                "null\n" +
                "");
        Assert.assertEquals(input, output);
    }

    @Test
    public void testPokemonMoveDamageClass() {
        final String input = PokemonMoveData.PokemonMoveDamageClass(1);
        final String output = ("special\n" +
                "status\n" +
                "physical\n" +
                "physical\n" +
                "physical\n" +
                "physical\n" +
                "physical\n" +
                "physical\n" +
                "physical\n" +
                "physical\n" +
                "status\n" +
                "physical\n" +
                "special\n" +
                "status\n" +
                "status\n" +
                "physical\n" +
                "special\n" +
                "status\n" +
                "status\n" +
                "special\n" +
                "status\n" +
                "status\n" +
                "physical\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "physical\n" +
                "special\n" +
                "physical\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "special\n" +
                "status\n" +
                "status\n" +
                "special\n" +
                "special\n" +
                "special\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "physical\n" +
                "status\n" +
                "status\n" +
                "physical\n" +
                "physical\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "special\n" +
                "status\n" +
                "physical\n" +
                "physical\n" +
                "status\n" +
                "status\n" +
                "physical\n" +
                "physical\n" +
                "status\n" +
                "physical\n" +
                "special\n" +
                "physical\n" +
                "status\n" +
                "physical\n" +
                "special\n" +
                "special\n" +
                "physical\n" +
                "status\n" +
                "special\n" +
                "special\n" +
                "special\n" +
                "special\n" +
                "special\n" +
                "status\n" +
                "status\n" +
                "status\n" +
                "");
        Assert.assertEquals(input, output);
    }

    /*
    @Test
    public void testMoveLearnMethod() {
        final String input = PokemonMoveData.PokemonMoveLearnMethod(1);
        final String output = ("level-up");
        Assert.assertEquals(input, output);
    } */
}
