package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unittests.
 */
public class Kata5Test {
    /**
     * Conditions_Make Complemet.
     */
    @Test
    public void testMakeComplement() {
        Kata5 dnaStrand = new Kata5();
        assertEquals("TTTT", dnaStrand.makeComplement("AAAA"));
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
        assertEquals("CATA", dnaStrand.makeComplement("GTAT"));
        assertEquals("TTCC", dnaStrand.makeComplement("AAGG"));
        assertEquals("GCGC", dnaStrand.makeComplement("CGCG"));
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
        String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String input = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        assertEquals(expected, dnaStrand.makeComplement(input));
    }

}
