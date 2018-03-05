package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kata1 Tests.
 */
public class Kata1Test {
    /**
     * It checks all the conditions.
     */
    @Test
    public void testSpinWordsIfMoreThatOneWordIsPresent() {
        Kata1 words = new Kata1();
        assertEquals("Hey wollef sroirraw", words.rotReverseWord("Hey fellow warriors"));
        assertEquals("This is a test", words.rotReverseWord("This is a test"));
        assertEquals("This is rehtona test", words.rotReverseWord("This is another test"));
    }

}
