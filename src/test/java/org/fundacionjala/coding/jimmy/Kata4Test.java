package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for performing unit tests.
 */
public class Kata4Test {

    private Kata4 kata4;

    /**
     * It initializes kata3 variable.
     */
    @Before
    public void initialize() {
        kata4 = new Kata4();
    }

    /**
     * Unit test for testing digitalRoot method.
     */
    @Test
    public void test1DigitalRootMethod() {
        final int expected = 7;
        final int number = 16;
        assertEquals(expected, kata4.digitalRoot(number));
    }

    /**
     * Unit test for testing digitalRoot method.
     */
    @Test
    public void test2DigitalRootMethod() {
        final int expected = 6;
        final int number = 942;
        assertEquals(expected, kata4.digitalRoot(number));
    }

    /**
     * Unit test for testing digitalRoot method.
     */
    @Test
    public void test3DigitalRootMethod() {
        final int expected = 6;
        final int number = 132189;
        assertEquals(expected, kata4.digitalRoot(number));
    }

    /**
     * Unit test for testing digitalRoot method.
     */
    @Test
    public void test4DigitalRootMethod() {
        final int expected = 2;
        final int number = 493193;
        assertEquals(expected, kata4.digitalRoot(number));
    }
}
