package org.fundacionjala.coding.christian;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class Kata3Test {

    /**
     * Test testsBasic.
     */
    @Test
    public void testsBasic() {
        final int number1 = 39;
        final int number2 = 4;
        final int number3 = 25;
        final int number4 = 999;
        final int number5 = 444;
        final int expected1 = 3;
        final int expected2 = 0;
        final int expected3 = 2;
        final int expected4 = 4;
        final int expected5 = 3;
        Kata3 persist = new Kata3();
        assertEquals(expected1, persist.persistence(number1));
        assertEquals(expected2, persist.persistence(number2));
        assertEquals(expected3, persist.persistence(number3));
        assertEquals(expected4, persist.persistence(number4));
        assertEquals(expected5, persist.persistence(number5));
    }

}
