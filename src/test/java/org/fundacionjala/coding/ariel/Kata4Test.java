package org.fundacionjala.coding.ariel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unittest for check the conditions.
 */
public class Kata4Test {
    /**
     * Conditions that review the digital root function.
     */
    @Test
    public void testDigitalRoot() {
        Kata4 katita = new Kata4();

        final int resp1 = 7;
        final int input1 = 16;
        assertEquals(resp1, katita.digitalRoot(input1));
        final int resp2 = 6;
        final int input2 = 942;
        assertEquals(resp2, katita.digitalRoot(input2));
        final int resp3 = 6;
        final int input3 = 132189;
        assertEquals(resp3, katita.digitalRoot(input3));
        final int rep4 = 2;
        final int input4 = 493193;
        assertEquals(rep4, katita.digitalRoot(input4));
        final int resp5 = 1;
        final int input5 = 10;
        assertEquals(resp5, katita.digitalRoot(input5));

    }

}
