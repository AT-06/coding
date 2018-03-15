package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Powered by Christian.
 */
public class Kata2Test {
    private Kata2 sort;

    /**
     *
     */
    @Before
    public void setup() {
        sort = new Kata2();
    }
    /**
     * test kata2.
     */
    @Test
    public void tests() {

        assertEquals("wiat for me", sort.word("wait for me"));
        assertEquals("tihs ktaa is esay", sort.word("this kata is easy"));
        assertEquals("I am", sort.word("I am"));
        }

}
