package org.fundacionjala.coding.jimmy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * These test are designed to control if a word is greater than five in length.
 */
public class Kata1Test {

    /**
     * This test verifies the spinWords method.
     */
    @Test
    public void test1() {
        Kata1 kata1 = new Kata1();

        String word = "Hey fellow warriors";
        assertEquals("Hey wollef sroirraw", kata1.spinWords(word));
    }

    /**
     * This test verifies the spinWords method.
     */
    @Test
    public void test2() {
        Kata1 kata1 = new Kata1();

        String word = "This is a test";
        assertEquals("This is a test", kata1.spinWords(word));
    }

    /**
     * This test verifies the spinWords method.
     */
    @Test
    public void test3() {
        Kata1 kata1 = new Kata1();

        String word = "This is another test";
        assertEquals("This is rehtona test", kata1.spinWords(word));
    }
}
