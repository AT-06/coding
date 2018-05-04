package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Kata16Test.java class for unit tests.
 */
public class Kata16Test {
    private Kata16 kata16;

    /**
     * Method to initialize object.
     */
    @Before
    public void init() {
        kata16 = new Kata16();
    }

    /**
     * Test method expanded Form.
     */
    @Test
    public void testExpandedForm() {
        final int firstExpected = 12;
        final int secondExpected = 42;
        final int thirdExpected = 70304;
        final int fourthExpected = 1234;
        final int fifthExpected = 10;
        assertEquals("10 + 2", kata16.expandedForm(firstExpected));
        assertEquals("40 + 2", kata16.expandedForm(secondExpected));
        assertEquals("70000 + 300 + 4", kata16.expandedForm(thirdExpected));
        assertEquals("1000 + 200 + 30 + 4", kata16.expandedForm(fourthExpected));
        assertEquals("10", kata16.expandedForm(fifthExpected));
    }
}
