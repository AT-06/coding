package org.fundacionjala.coding.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test kata4.
 */
public class Kata4Test {
    /**
     * Test sum digits.
     */
    @Test
    public void testSumDigits() {

        final int case1 = 942;
        final int case2 = 132189;
        final int case3 = 493193;

        final int exp1 = 6;
        final int exp2 = 6;
        final int exp3 = 2;


        Kata4 num = new Kata4();
        assertEquals(exp1, num.sumDigits(case1));
        assertEquals(exp2, num.sumDigits(case2));
        assertEquals(exp3, num.sumDigits(case3));

    }

}
