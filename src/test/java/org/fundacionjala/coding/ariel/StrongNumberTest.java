package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests n order to check the class StrongNumber.
 */
public class StrongNumberTest {
    private static String strong = "STRONG!!!!";
    private static String notStrong = "Not Strong !!";
    private StrongNumber strongNumber = new StrongNumber();

    /**
     * This tests check if it is a Strong or not Strong number.
     */
    @Test
    public void testSomething() {
        final int n1 = 145;
        final int n2 = 7;
        final int n3 = 93;
        final int n4 = 185;
        assertEquals(strong, strongNumber.isStrongNumber(1));
        assertEquals(strong, strongNumber.isStrongNumber(2));
        assertEquals(strong, strongNumber.isStrongNumber(n1));
        assertEquals(notStrong, strongNumber.isStrongNumber(n2));
        assertEquals(notStrong, strongNumber.isStrongNumber(n3));
        assertEquals(notStrong, strongNumber.isStrongNumber(n4));
    }
}
