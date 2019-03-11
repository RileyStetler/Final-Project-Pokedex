package edu.bsu.cs222;

import edu.bsu.cs222.PokemonSelection;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    @Test
    public void testReturnPokemon() {
        final PokemonSelection pokemon = new PokemonSelection();
        final int input = 004;
        final int output = pokemon.main(input);
        Assert.assertEquals(input, output);
    }
}
