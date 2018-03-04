package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata5.java.
 */
public class Kata5Test {


    /**
     * This method is for testing makeComplement(word).
     * DnaStrand.makeComplement("ATTGC") // return "TAACG"
     * DnaStrand.makeComplement("GTAT") // return "CATA"
     */
    @Test
    public void testMakeComplement() {

        String longcharacter1 = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String longcharacter2 = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";

        Kata5 dnaComplement = new Kata5();
        assertEquals("TTTT", dnaComplement.makeComplement("AAAA"));
        assertEquals("TAACG", dnaComplement.makeComplement("ATTGC"));
        assertEquals("CATA", dnaComplement.makeComplement("GTAT"));
        assertEquals("TTCC", dnaComplement.makeComplement("AAGG"));
        assertEquals("GCGC", dnaComplement.makeComplement("CGCG"));
        assertEquals("TAACG", dnaComplement.makeComplement("ATTGC"));
        assertEquals(longcharacter1, dnaComplement.makeComplement(longcharacter2));
    }

}
