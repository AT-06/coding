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
        Kata5 dna = new Kata5();
        assertEquals("TTTT", dna.makeComplement("AAAA"));
    }
    /**
     * Test test02.
     */
    @Test
    public void testTwo() {
        Kata5 dna = new Kata5();
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }
    /**
     * Test test03.
     */
    @Test
    public void testThree() {
        Kata5 dna = new Kata5();
        assertEquals("CATA", dna.makeComplement("GTAT"));
    }
    /**
     * Test test04.
     */
    @Test
    public void testFour() {
        Kata5 dna = new Kata5();
        assertEquals("TTCC", dna.makeComplement("AAGG"));
    }
    /**
     * Test test05.
     */
    @Test
    public void testFive() {
        Kata5 dna = new Kata5();
        assertEquals("GCGC", dna.makeComplement("CGCG"));
    }
    /**
     * Test test06.
     */
    @Test
    public void testSix() {
        Kata5 dna = new Kata5();
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }
    /**
     * Test test07.
     */
    @Test
    public void testSeven() {
        String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String dnaCase = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";

        Kata5 dna = new Kata5();
        assertEquals(expected, dna.makeComplement(dnaCase));
    }
}
