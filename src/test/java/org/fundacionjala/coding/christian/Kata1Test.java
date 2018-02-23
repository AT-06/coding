package org.fundacionjala.coding.christian;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Powered by Christian.
 */
public class Kata1Test {
    /**
     *
     */
    @Test
    public void allWordsCantBeReversed() {
        Kata1 words = new Kata1();
        assertEquals("This is a test", words.spinWords("This is a test"));

    }
}
