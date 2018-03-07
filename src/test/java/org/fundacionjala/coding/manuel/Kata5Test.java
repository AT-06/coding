package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/5/2018.
 */
public class Kata5Test {

    private Kata5 dnaStrand;

    /**
     * Method to run before tests.
     */
    @Before public void inicialize() {
        dnaStrand = new Kata5();
    }
    /**
     * First test method makeComplement.
     */
    @Test
    public void test1MakeComplementKata5() {
        assertEquals("TTTT", dnaStrand.makeComplement("AAAA"));
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
        assertEquals("CATA", dnaStrand.makeComplement("GTAT"));
        assertEquals("TTCC", dnaStrand.makeComplement("AAGG"));
        assertEquals("GCGC", dnaStrand.makeComplement("CGCG"));
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Second test method makeComplement.
     */
    @Test
    public void test2MakeComplementKata5() {
        String expected = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String param = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        assertEquals(expected, dnaStrand.makeComplement(param));
    }

    /**
     * Third test method makeComplement.
     */
    @Test
    public void test3MakeComplementKata5() {
        assertEquals("TAACGX", dnaStrand.makeComplement("ATTGCX"));
    }
}
