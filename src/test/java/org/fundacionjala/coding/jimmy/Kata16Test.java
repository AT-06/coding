package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class created to test the check method.
 */
public class Kata16Test {
    private Kata16 pangramChecker;

    /**
     * Initializes the Kata16.
     */
    @Before
    public void initialize() {
        pangramChecker = new Kata16();
    }

    /**
     * To test whether the check method return true.
     */
    @Test
    public void testCheckMethodPass() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertEquals(true, pangramChecker.check(pangram1));
    }

    /**
     * To test whether the check method return false.
     */
    @Test
    public void testCheckMethodNotPass() {
        String pangram2 = "You shall not pass!";
        assertEquals(false, pangramChecker.check(pangram2));
    }
}
