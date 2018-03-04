package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata5 class.
 */
public class Kata5Test {
    private Kata5 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void init() {
        kata = new Kata5();
    }

    /**
     * Unit testing of makeComplement method.
     */
    @Test
    public void tests() {
        assertEquals("TTTT", kata.makeComplement("AAAA"));
        assertEquals("TAACG", kata.makeComplement("ATTGC"));
        assertEquals("CATA", kata.makeComplement("GTAT"));
        assertEquals("TTCC", kata.makeComplement("AAGG"));
        assertEquals("GCGC", kata.makeComplement("CGCG"));
        assertEquals("TAACG", kata.makeComplement("ATTGC"));
        assertEquals("CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT",
            kata.makeComplement("GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA"));
    }
}
