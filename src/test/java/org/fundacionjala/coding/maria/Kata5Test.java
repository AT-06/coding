package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test to kata5.
 */
public class Kata5Test {
    private Kata5 kata5;
    /**
     * initialize kata5.
     */
    @Before
    public void initialize() {
        kata5 = new Kata5();
    }
    /**
     * Test test01.
     */
    @Test
    public void testOne() {
        assertEquals("TTTT", kata5.makeComplement("AAAA"));
    }
    /**
     * Test test03.
     */
    @Test
    public void testThree() {
        assertEquals("CATA", kata5.makeComplement("GTAT"));
    }
    /**
     * Test test04.
     */
    @Test
    public void testFour() {

        assertEquals("TTCC", kata5.makeComplement("AAGG"));
    }
    /**
     * Test test05.
     */
    @Test
    public void testFive() {
        assertEquals("GCGC", kata5.makeComplement("CGCG"));
    }
    /**
     * Test test06.
     */
    @Test
    public void testSix() {
        assertEquals("TAACG", kata5.makeComplement("ATTGC"));
        String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String dnaCase = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        assertEquals(expected, kata5.makeComplement(dnaCase));
    }
}
