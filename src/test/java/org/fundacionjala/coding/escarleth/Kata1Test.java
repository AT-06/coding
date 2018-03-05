package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @param
 * @return kata1test
 */

public class Kata1Test {
    /**
     * @param
     * @return
     */
    @Test

    public void spinWords() {
        Kata1 kata1 = new Kata1();
        String result = kata1.spinWords("Hey fellow warriors");
        assertEquals("Hey wollef sroirraw", result);
    }

    /**
     * @param
     * @return
     */
    @Test

    public void spinWords2() {
        Kata1 kata1 = new Kata1();
        String result = kata1.spinWords("This is another test");
        assertEquals("This is rehtona test", result);
    }

    /**
     * @param
     * @return
     */
    @Test

    public void spinWords3() {
        Kata1 kata1 = new Kata1();
        String result = kata1.spinWords("This is a test");
        assertEquals("This is a test", result);
    }
}


