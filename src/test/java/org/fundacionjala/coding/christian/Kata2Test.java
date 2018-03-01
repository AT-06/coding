package org.fundacionjala.coding.christian;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Powered by Christian.
 */
public class Kata2Test {
    /**
     * test kata2.
     */
    @Test
    public void tests() {
        Kata2 sort = new Kata2();
        assertEquals("wiat for me", sort.word("wait for me"));
        assertEquals("tihs ktaa is esay", sort.word("this kata is easy"));
        assertEquals("I am", sort.word("I am"));
        }

}
