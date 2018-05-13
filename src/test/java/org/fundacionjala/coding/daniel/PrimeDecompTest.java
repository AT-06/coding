package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class for testing PrimeDecomp class.
 */
public class PrimeDecompTest {
    private PrimeDecomp primeDecomp;

    /**
     * Initializes variable primeDecomp.
     */
    @Before
    public void setUp() {
        primeDecomp = new PrimeDecomp();
    }

    /**
     * Method for unit testing of testPrimeDecomp() method.
     */
    @Test
    public void testPrimeDecomp() {
        final int number = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                primeDecomp.factors(number));
    }
}
