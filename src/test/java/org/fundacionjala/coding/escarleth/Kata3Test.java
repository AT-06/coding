package org.fundacionjala.coding.escarleth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for Kata3.
 */
public class Kata3Test {
    /**
     * This method is for testing a persistentBugger number.
     */
    @Test
    public void testPersistentBuggerNumber() {
        final int number1 = 4;
        final int number2 = 25;
        final int number3 = 999;
        final int expected1 = 0;
        final int expected2 = 2;
        final int expected3 = 4;

        Kata3 kata3 = new Kata3();
        assertEquals(expected1, kata3.persistentBugger(number1));
        assertEquals(expected2, kata3.persistentBugger(number2));
        assertEquals(expected3, kata3.persistentBugger(number3));
    }
}
