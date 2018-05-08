package org.fundacionjala.coding.daniel;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing Fibonacci, Tribonacci and friends kata.
 */
public class XbonacciTest {
    private Xbonacci variabonacci;

    /**
     * Initializes variable variabonacci.
     */
    @Before
    public void setUp() {
        variabonacci = new Xbonacci();
    }

    /**
     * This  method is executed after tests.
     */
    @After
    public void tearDown() {
        variabonacci = null;
    }

    /**
     * Testing xbonacci method.
     */
    @Test
    public void basicTests() {
        final double[] expecteds = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        final double[] signature = {0, 1};
        final int n = 10;
        assertArrayEquals(expecteds, variabonacci.xbonacci(signature, n));
        final double[] expecteds1 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        final double[] signature1 = {1, 1};
        assertArrayEquals(expecteds1, variabonacci.xbonacci(signature1, n));
        final double[] expecteds2 = {0, 0, 0, 0, 1, 1, 2, 4, 8, 16};
        final double[] signature2 = {0, 0, 0, 0, 1};
        assertArrayEquals(expecteds2, variabonacci.xbonacci(signature2, n));
        final double[] expecteds3 = {1, 0, 0, 0, 0, 0, 1, 2, 3, 6};
        final double[] signature3 = {1, 0, 0, 0, 0, 0, 1};
        assertArrayEquals(expecteds3, variabonacci.xbonacci(signature3, n));
    }

    /**
     * Method for running basic tests.
     *
     * @param expecteds expected results.
     * @param actuals   actual results.
     */
    private void assertArrayEquals(double[] expecteds, double[] actuals) {
        for (int i = 0; i < actuals.length; i++) {
            final double delta = 1e-10;
            assertEquals(expecteds[i], actuals[i], delta);
        }
    }
}
