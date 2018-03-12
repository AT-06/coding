package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * test Kata5.
 */
public class Kata5Test {
    private Kata5 dnaStrand;

    /**
     *
     */
    @Before
    public  void setup() {
        dnaStrand = new Kata5();
    }

    /**
     *
     */
    @Test
    public void test01() {
        assertEquals("TTTT", dnaStrand.makeComplement("AAAA"));
    }

    /**
     *
     */
    @Test
    public void test02() {
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
    }

    /**
     *
     */
    @Test
    public void test03() {
        assertEquals("CATA", dnaStrand.makeComplement("GTAT"));
    }

    /**
     *
     */
    @Test
    public void test04() {
        assertEquals("TTCC", dnaStrand.makeComplement("AAGG"));
    }

    /**
     *
     */
    @Test
    public void test05() {
        assertEquals("GCGC", dnaStrand.makeComplement("CGCG"));
    }

    /**
     *
     */
    @Test
    public void test06() {
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
    }

    /**
     *
     */
    @Test
    public void test07() {
        assertEquals("CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT",
                dnaStrand.makeComplement(
                        "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA"));
    }

}
