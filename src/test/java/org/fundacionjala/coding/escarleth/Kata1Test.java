package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata1.
 */
public class Kata1Test {
    /**
     * This method is for testing a SpinWord.
     */
    @Test
    public void testSpinWords() {
        Kata1 word = new Kata1();
        assertEquals("Hey wollef sroirraw", word.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", word.spinWords("This is a test"));
        assertEquals("This is rehtona test", word.spinWords("This is another test"));
    }
}
