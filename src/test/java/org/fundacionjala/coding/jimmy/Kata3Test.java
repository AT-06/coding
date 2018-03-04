package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class developed for testing persistence debugger method.
 */
public class Kata3Test {

    private Kata3 kata3;

    /**
     * It initializes kata3 variable.
     */
    @Before
    public void initialize() {
        kata3 = new Kata3();
    }

    /**
     * Unit tests created in order to test persistence bugger method.
     */
    @Test
    public void testPersistentBuggerMethod() {
        final int firstExpected = 3;
        final int secondExpected = 0;
        final int thirdExpected = 2;
        final int fourthExpected = 4;
        final int firstNumber = 39;
        final int secondNumber = 4;
        final int thirdNumber = 25;
        final int fourthNumber = 999;
        final int fifthNumber = 444;

        assertEquals(firstExpected, kata3.persistence(firstNumber));
        assertEquals(secondExpected, kata3.persistence(secondNumber));
        assertEquals(thirdExpected, kata3.persistence(thirdNumber));
        assertEquals(fourthExpected, kata3.persistence(fourthNumber));
        assertEquals(firstExpected, kata3.persistence(fifthNumber));
    }
}
