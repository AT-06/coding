package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * These test are designed to control if a word is greater than five in length.
 */
public class Kata1Test {

    private Kata1 kata1;

    /**
     * This method initializes the kata1 variable.
     */
    @Before
    public void initialize() {
        kata1 = new Kata1();
    }

    /**
     * This test verifies the spinWords method.
     */
    @Test
    public void test1() {
        String word = "Hey fellow warriors";
        assertEquals("Hey wollef sroirraw", kata1.spinWords(word));
    }

    /**
     * This test verifies the spinWords method.
     */
    @Test
    public void test2() {
        String word = "This is a test";
        assertEquals("This is a test", kata1.spinWords(word));
    }

    /**
     * This test verifies the spinWords method.
     */
    @Test
    public void test3() {
        String word = "This is another test";
        assertEquals("This is rehtona test", kata1.spinWords(word));
    }
}
