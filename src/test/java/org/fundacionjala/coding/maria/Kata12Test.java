package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * kata 12 test.
 */
public class Kata12Test {
    private Kata12 sequence;
    /**
     * initialize kata7.
     */
    @Before
    public void initialize() {
        sequence = new Kata12();
    }

    /**
     * Tests basicTests.
     */
    @Test
    public void basicTests() {
        final int case1 = 1;
        final int case2 = 2;
        final int case3 = 3;
        final int case4 = 4;
        final int case5 = 5;
        final int case6 = 6;
        final int case7 = 7;
        final int case8 = 8;
        final int case9 = 9;
        final int case10 = 10;
        final int case20 = 20;
        final int case30 = 30;
        final int case100 = 100;
        final int case123 = 123;
        final int case1000 = 1000;
        final int case1234 = 1234;
        final int case10000 = 10000;
        final int case12345 = 12345;

        final int exp50 = 50;
        final int exp150 = 150;
        final int exp300 = 300;
        final int exp500 = 500;
        final int exp750 = 750;
        final int exp1050 = 1050;
        final int exp1400 = 1400;
        final int exp1800 = 1800;
        final int exp2250 = 2250;
        final int exp2750 = 2750;
        final int exp10500 = 10500;
        final int exp23250 = 23250;
        final int exp252500 = 252500;
        final int exp381300 = 381300;
        final int exp25025000 = 25025000;
        final int exp38099750 = 38099750;
        final long exp2500250000L = 2500250000L;
        final long exp3810284250L = 3810284250L;


        assertEquals("getScore(1) returns a wrong result", exp50, sequence.getScore(case1));

        assertEquals("getScore(2) returns a wrong result", exp150, sequence.getScore(case2));

        assertEquals("getScore(3) returns a wrong result", exp300, sequence.getScore(case3));

        assertEquals("getScore(4) returns a wrong result", exp500, sequence.getScore(case4));

        assertEquals("getScore(5) returns a wrong result", exp750, sequence.getScore(case5));

        assertEquals("getScore(6) returns a wrong result", exp1050, sequence.getScore(case6));

        assertEquals("getScore(7) returns a wrong result", exp1400, sequence.getScore(case7));

        assertEquals("getScore(8) returns a wrong result", exp1800, sequence.getScore(case8));

        assertEquals("getScore(9) returns a wrong result", exp2250, sequence.getScore(case9));

        assertEquals("getScore(10) returns a wrong result", exp2750, sequence.getScore(case10));

        assertEquals("getScore(20) returns a wrong result", exp10500, sequence.getScore(case20));

        assertEquals("getScore(30) returns a wrong result", exp23250, sequence.getScore(case30));

        assertEquals("getScore(100) returns a wrong result", exp252500, sequence.getScore(case100));

        assertEquals("getScore(123) returns a wrong result", exp381300, sequence.getScore(case123));

        assertEquals("getScore(1000) returns a wrong result", exp25025000, sequence.getScore(case1000));

        assertEquals("getScore(1234) returns a wrong result", exp38099750, sequence.getScore(case1234));

        assertEquals("getScore(10000) returns a wrong result", exp2500250000L, sequence.getScore(case10000));

        assertEquals("getScore(12345) returns a wrong result", exp3810284250L, sequence.getScore(case12345));

    }
}
