package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for performing unit tests for makeComplement method.
 */
public class Kata5Test {

    private Kata5 kata5;

    /**
     * Initializes kata5.
     */
    @Before
    public void initialize() {
        kata5 = new Kata5();
    }

    /**
     * Unit test for testing makeComplement method.
     */
    @Test
    public void test01() {
        final String dnaString = "AAAA";
        final String expected = "TTTT";
        assertEquals(expected, kata5.makeComplement(dnaString));
    }

    /**
     * Unit test for testing makeComplement method.
     */
    @Test
    public void test02() {
        final String dnaString = "ATTGC";
        final String expected = "TAACG";
        assertEquals(expected, kata5.makeComplement(dnaString));
    }

    /**
     * Unit test for testing makeComplement method.
     */
    @Test
    public void test03() {
        final String dnaString = "GTAT";
        final String expected = "CATA";
        assertEquals(expected, kata5.makeComplement(dnaString));
    }

    /**
     * Unit test for testing makeComplement method.
     */
    @Test
    public void test04() {
        final String dnaString = "AAGG";
        final String expected = "TTCC";
        assertEquals(expected, kata5.makeComplement(dnaString));
    }

    /**
     * Unit test for testing makeComplement method.
     */
    @Test
    public void test05() {
        final String dnaString = "CGCG";
        final String expected = "GCGC";
        assertEquals(expected, kata5.makeComplement(dnaString));
    }

    /**
     * Unit test for testing makeComplement method.
     */
    @Test
    public void test06() {
        final String dnaString = "ATTGC";
        final String expected = "TAACG";
        assertEquals(expected, kata5.makeComplement(dnaString));
    }

    /**
     * Unit test for testing makeComplement method.
     */
    @Test
    public void test07() {
        final String dnaString = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        final String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        assertEquals(expected, kata5.makeComplement(dnaString));
    }
}
