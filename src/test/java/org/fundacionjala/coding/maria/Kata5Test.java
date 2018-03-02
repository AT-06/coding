package org.fundacionjala.coding.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test to kata5.
 */
public class Kata5Test {
    /**
     * Test testComplementaryDNA.
     */
    @Test
    public void testComplementaryDNA() {
        Kata5 dna = new Kata5();
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }
    /**
     * Test test01.
     */
    @Test
    public void test01() {
        Kata5 dna = new Kata5();
        assertEquals("TTTT", dna.makeComplement("AAAA"));
    }
    /**
     * Test test02.
     */
    @Test
    public void test02() {
        Kata5 dna = new Kata5();
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }
    /**
     * Test test03.
     */
    @Test
    public void test03() {
        Kata5 dna = new Kata5();
        assertEquals("CATA", dna.makeComplement("GTAT"));
    }
    /**
     * Test test04.
     */
    @Test
    public void test04() {
        Kata5 dna = new Kata5();
        assertEquals("TTCC", dna.makeComplement("AAGG"));
    }
    /**
     * Test test05.
     */
    @Test
    public void test05() {
        Kata5 dna = new Kata5();
        assertEquals("GCGC", dna.makeComplement("CGCG"));
    }
    /**
     * Test test06.
     */
    @Test
    public void test06() {
        Kata5 dna = new Kata5();
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }
    /**
     * Test test07.
     */
    @Test
    public void test07() {
        String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String dnaCase = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";

        Kata5 dna = new Kata5();
        assertEquals(expected, dna.makeComplement(dnaCase));
    }
}
