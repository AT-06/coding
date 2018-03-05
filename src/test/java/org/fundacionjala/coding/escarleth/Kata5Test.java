package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata5.
 */
public class Kata5Test {
    /**
     * This method is for testing a complementaryDNA.
     */
    @Test
    public void testComplementaryDNA() {
        String longWordExpected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String longWord = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        Kata5 kata5 = new Kata5();
        assertEquals("TAACG", kata5.complementaryDNA("ATTGC"));
        assertEquals("TTTT", kata5.complementaryDNA("AAAA"));
        assertEquals("TTCC", kata5.complementaryDNA("AAGG"));
        assertEquals(longWordExpected, kata5.complementaryDNA(longWord));
    }
}
