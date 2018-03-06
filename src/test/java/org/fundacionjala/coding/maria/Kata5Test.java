package org.fundacionjala.coding.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test to kata5.
 */
public class Kata5Test {
    /**
     * Test test01.
     */
    @Test
    public void testOne() {
        Kata5 dnaOne = new Kata5();
        assertEquals("TTTT", dnaOne.makeComplement("AAAA"));
    }
    /**
     * Test test03.
     */
    @Test
    public void testThree() {
        Kata5 dnaThree = new Kata5();
        assertEquals("CATA", dnaThree.makeComplement("GTAT"));
    }
    /**
     * Test test04.
     */
    @Test
    public void testFour() {
        Kata5 dnaFour = new Kata5();
        assertEquals("TTCC", dnaFour.makeComplement("AAGG"));
    }
    /**
     * Test test05.
     */
    @Test
    public void testFive() {
        Kata5 dnaFive = new Kata5();
        assertEquals("GCGC", dnaFive.makeComplement("CGCG"));
    }
    /**
     * Test test06.
     */
    @Test
    public void testSix() {
        Kata5 dnaSix = new Kata5();
        assertEquals("TAACG", dnaSix.makeComplement("ATTGC"));
        String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String dnaCase = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        assertEquals(expected, dnaSix.makeComplement(dnaCase));
    }
}
