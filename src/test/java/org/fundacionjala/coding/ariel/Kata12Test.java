package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unitest to Sequence.
 */
public class Kata12Test {
    private Kata12 katita;

    /**
     * It init the object Kata12.
     */
    @Before
    public void init() {
        katita = new Kata12();
    }


    /**
     * Verify all the position and tell us the score.
     * getScore(1); // == 50.
     * getScore(2); // == 150.
     * getScore(3); // == 300.
     */
    @Test

    public void basicTests() {

        final int expected = 50;
        final int position = 1;
        assertEquals("getScore(1) returns a wrong result", expected, katita.getScore(position));

        final int expected1 = 150;
        final int position1 = 2;
        assertEquals("getScore(2) returns a wrong result", expected1, katita.getScore(position1));

        final int expected2 = 300;
        final int position2 = 3;
        assertEquals("getScore(3) returns a wrong result", expected2, katita.getScore(position2));

        final int expected3 = 500;
        final int position3 = 4;
        assertEquals("getScore(4) returns a wrong result", expected3, katita.getScore(position3));

        final int expected4 = 750;
        final int position4 = 5;
        assertEquals("getScore(5) returns a wrong result", expected4, katita.getScore(position4));

        final int expected5 = 1050;
        final int position5 = 6;
        assertEquals("getScore(6) returns a wrong result", expected5, katita.getScore(position5));

        final int expected6 = 1400;
        final int position6 = 7;
        assertEquals("getScore(7) returns a wrong result", expected6, katita.getScore(position6));

        final int expected7 = 1800;
        final int position7 = 8;
        assertEquals("getScore(8) returns a wrong result", expected7, katita.getScore(position7));

        final int expected8 = 2250;
        final int position8 = 9;
        assertEquals("getScore(9) returns a wrong result", expected8, katita.getScore(position8));

        final int expected9 = 2750;
        final int position9 = 10;
        assertEquals("getScore(10) returns a wrong result", expected9, katita.getScore(position9));

        final int expected10 = 10500;
        final int position10 = 20;
        assertEquals("getScore(20) returns a wrong result", expected10, katita.getScore(position10));

        final int expected11 = 23250;
        final int position11 = 30;
        assertEquals("getScore(30) returns a wrong result", expected11, katita.getScore(position11));

        final int expected12 = 252500;
        final int position12 = 100;
        assertEquals("getScore(100) returns a wrong result", expected12, katita.getScore(position12));

        final int expected13 = 381300;
        final int position13 = 123;
        assertEquals("getScore(123) returns a wrong result", expected13, katita.getScore(position13));

        final int expected14 = 25025000;
        final int position14 = 1000;
        assertEquals("getScore(1000) returns a wrong result", expected14, katita.getScore(position14));

        final int expected15 = 38099750;
        final int position15 = 1234;
        assertEquals("getScore(1234) returns a wrong result", expected15, katita.getScore(position15));


    }

}
