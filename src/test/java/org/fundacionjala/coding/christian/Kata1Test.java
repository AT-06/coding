package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Powered by Christian.
 */
public class Kata1Test {
    /**
     *
     */
    @Before
    public void testCantBeReversedAllWords() {
        Kata1 words = new Kata1();
        assertEquals("This is a test", words.spinWords("This is a test"));

    }

    /**
     *
     */
    @Test
    public void testCanBeReversedSomeWords() {
        Kata1 words = new Kata1();
        assertEquals("Hey fellow warriors", words.spinWords("Hey wollef sroirraw"));

    }

    /**
     *
     */
    @Test
    public  void testMiddleChangeWords() {
        Kata1 words = new Kata1();
        assertEquals("This is another test", words.spinWords("This is rehtona test"));
    }
}
