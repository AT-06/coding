package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for Sum.
 */
public class SumTest {
    private Sum sum;

    /**
     * Init unit test.
     */
    @Before
    public void init() {
        sum = new Sum();
    }

    /**
     * test Positive.
     */
    @Test
    public void testPositive() {
        final  int five = 5;
        final int negativeOne = -1;
        final int fourthteen = 14;
        assertEquals(fourthteen, sum.getSum(five, negativeOne));
    }

    /**
     * test Negative.
     */
    @Test
    public void testNegative() {
        final int negativeOne = -1;
        final  int negativeFive = -5;
        final int negativeFithteen = -15;
        assertEquals(negativeFithteen, sum.getSum(negativeOne, negativeFive));
        assertEquals(negativeFive, sum.getSum(negativeFive, negativeFive));
    }

    /**
     * test Zero.
     */
    @Test
    public void testZero() {
        final int zero = 0;
        assertEquals(zero, sum.getSum(zero, zero));
    }

    /**
     * test Switch Min to Max.
     */
    @Test
    public void testSwitchMinMax() {
        final int one = 1;
        final int negativeOne = -1;
        final  int five = 5;
        final  int negativeFive = -5;
        final int fithteen = 15;
        final int negativeFithteen = -15;
        assertEquals(negativeFithteen, sum.getSum(negativeFive, negativeOne));
        assertEquals(fithteen, sum.getSum(five, one));
    }

    /**
     * test Equal.
     */
    @Test
    public void testEqual() {
        final int seventeen = 17;
        final int negativeSeventeen = -17;
        assertEquals(negativeSeventeen, sum.getSum(negativeSeventeen, negativeSeventeen));
        assertEquals(seventeen, sum.getSum(seventeen, seventeen));
    }

}
