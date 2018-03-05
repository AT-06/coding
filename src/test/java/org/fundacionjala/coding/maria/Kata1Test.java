package org.fundacionjala.coding.maria;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Kata1Test.
 * test cases for Kata1
 */
public class Kata1Test {
    /**
     * ReturnStringsWithMoreFiveLettersReverse_long.
     * Test 1
     */
    @Test
    public void returnStringsWithMoreFiveLettersReverseLongSpinWords() {
        Kata1 words = new Kata1();
        assertEquals("Hey wollef sroirraw", words.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", words.spinWords("This is a test"));
        assertEquals("This is another test", words.spinWords("This is rehtona test"));
    }

}
