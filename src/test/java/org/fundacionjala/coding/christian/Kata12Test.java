package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Developer by Christian.
 */
public class Kata12Test {
    private Kata12 katas;

    /**
     *
     */
    @Before
    public void setUp() {
        katas = new Kata12();
    }

    /**
     * test.
     */
    @Test
    public void basicTests() {
        final int expectedValue = 50;
        final int paramValue = 1;
        assertEquals("getScore(1) returns a wrong result", expectedValue, katas.getScore(paramValue));

        final int expectedValue2 = 150;
        final int paramValue2 = 2;
        assertEquals("getScore(2) returns a wrong result", expectedValue2, katas.getScore(paramValue2));

        final int expectedValue3 = 300;
        final int paramValue3 = 3;
        assertEquals("getScore(3) returns a wrong result", expectedValue3, katas.getScore(paramValue3));

        final int expectedValue4 = 500;
        final int paramValue4 = 4;
        assertEquals("getScore(4) returns a wrong result", expectedValue4, katas.getScore(paramValue4));

        final int expectedValue5 = 750;
        final int paramValue5 = 5;
        assertEquals("getScore(5) returns a wrong result", expectedValue5, katas.getScore(paramValue5));

        final int expectedValue6 = 1050;
        final int paramValue6 = 6;
        assertEquals("getScore(6) returns a wrong result", expectedValue6, katas.getScore(paramValue6));

        final int expectedValue7 = 1400;
        final int paramValue7 = 7;
        assertEquals("getScore(7) returns a wrong result", expectedValue7, katas.getScore(paramValue7));

        final int expectedValue8 = 1800;
        final int paramValue8 = 8;
        assertEquals("getScore(8) returns a wrong result", expectedValue8, katas.getScore(paramValue8));

        final int expectedValue9 = 2250;
        final int paramValue9 = 9;
        assertEquals("getScore(9) returns a wrong result", expectedValue9, katas.getScore(paramValue9));

        final int expectedValue10 = 2750;
        final int paramValue10 = 10;
        assertEquals("getScore(10) returns a wrong result", expectedValue10, katas.getScore(paramValue10));

        final int expectedValue11 = 10500;
        final int paramValue11 = 20;
        assertEquals("getScore(20) returns a wrong result", expectedValue11, katas.getScore(paramValue11));

        final int expectedValue12 = 23250;
        final int paramValue12 = 30;
        assertEquals("getScore(30) returns a wrong result", expectedValue12, katas.getScore(paramValue12));

        final int expectedValue13 = 252500;
        final int paramValue13 = 100;
        assertEquals("getScore(100) returns a wrong result", expectedValue13, katas.getScore(paramValue13));

        final int expectedValue14 = 381300;
        final int paramValue14 = 123;
        assertEquals("getScore(123) returns a wrong result", expectedValue14, katas.getScore(paramValue14));

        final int expectedValue15 = 25025000;
        final int paramValue15 = 1000;
        assertEquals("getScore(1000) returns a wrong result", expectedValue15, katas.getScore(paramValue15));

        final int expectedValue16 = 38099750;
        final int paramValue16 = 1234;
        assertEquals("getScore(1234) returns a wrong result", expectedValue16, katas.getScore(paramValue16));

        final long expectedValue17 = 2500250000L;
        final int paramValue17 = 10000;
        assertEquals("getScore(10000) returns a wrong result", expectedValue17, katas.getScore(paramValue17));

        final long expectedValue18 = 3810284250L;
        final int paramValue18 = 12345;
        assertEquals("getScore(12345) returns a wrong result", expectedValue18, katas.getScore(paramValue18));
    }
}
