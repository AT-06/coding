package org.fundacionjala.coding.manuel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/5/2018.
 */
public class Kata5Test {

    /**
     * First test method makeComplement.
     */
    @Test
    public void test1MakeComplementKata5() {
        Kata5 dnaStrand = new Kata5();
        assertEquals("TTTT", dnaStrand.makeComplement("AAAA"));
    }

    /**
     * Second test method makeComplement.
     */
    @Test
    public void test2MakeComplementKata5() {
        Kata5 dnaStrand = new Kata5();
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Third test method makeComplement.
     */
    @Test
    public void test3MakeComplementKata5() {
        Kata5 dnaStrand = new Kata5();
        assertEquals("CATA", dnaStrand.makeComplement("GTAT"));
    }

    /**
     * Fourth test method makeComplement.
     */
    @Test
    public void test4MakeComplementKata5() {
        Kata5 dnaStrand = new Kata5();
        assertEquals("TTCC", dnaStrand.makeComplement("AAGG"));
    }

    /**
     * Fifth test method makeComplement.
     */
    @Test
    public void test5MakeComplementKata5() {
        Kata5 dnaStrand = new Kata5();
        assertEquals("GCGC", dnaStrand.makeComplement("CGCG"));
    }

    /**
     * Sixth test method makeComplement.
     */
    @Test
    public void test6MakeComplementKata5() {
        Kata5 dnaStrand = new Kata5();
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Seventh test method makeComplement.
     */
    @Test
    public void test7MakeComplementKata5() {
        Kata5 dnaStrand = new Kata5();
        String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String param = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        assertEquals(expected, dnaStrand.makeComplement(param));
    }
}
