package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata12.java.
 */
public class Kata12Test {


    /**
     * This Unit Test it is for test .getScore() method.
     * getScore(1); // == 50
     * getScore(2); // == 150
     * getScore(3); // == 300
     * // ...
     */
    @Test
    public void testGetScoreBasicTests() {

        final long number50 = 50;
        final long number150 = 150;
        final long number300 = 300;
        final long number500 = 500;
        final long number750 = 750;
        final long number1050 = 1050;
        final long number1400 = 1400;
        final long number1800 = 1800;
        final long number2250 = 2250;
        final long number2750 = 2750;
        final long number10500 = 10500;
        final long number23250 = 23250;
        final long number25250 = 252500;
        final long number381300 = 381300;
        final long number25025000 = 25025000;
        final long number38099750 = 38099750;
        final long number2500250000L = 2500250000L;
        final long number3810284250L = 3810284250L;

        final int number1 = 1;
        final int number2 = 2;
        final int number3 = 3;
        final int number4 = 4;
        final int number5 = 5;
        final int number6 = 6;
        final int number7 = 7;
        final int number8 = 8;
        final int number9 = 9;
        final int number10 = 10;
        final int number20 = 20;
        final int number30 = 30;
        final int number100 = 100;
        final int number123 = 123;
        final int number1000 = 1000;
        final int number1234 = 1234;
        final int number10000 = 10000;
        final int number12345 = 12345;

        Kata12 sequence = new Kata12();
        assertEquals("getScore(1) returns a wrong result", number50, sequence.getScore(number1));
        assertEquals("getScore(2) returns a wrong result", number150, sequence.getScore(number2));
        assertEquals("getScore(3) returns a wrong result", number300, sequence.getScore(number3));
        assertEquals("getScore(4) returns a wrong result", number500, sequence.getScore(number4));
        assertEquals("getScore(5) returns a wrong result", number750, sequence.getScore(number5));
        assertEquals("getScore(6) returns a wrong result", number1050, sequence.getScore(number6));
        assertEquals("getScore(7) returns a wrong result", number1400, sequence.getScore(number7));
        assertEquals("getScore(8) returns a wrong result", number1800, sequence.getScore(number8));
        assertEquals("getScore(9) returns a wrong result", number2250, sequence.getScore(number9));
        assertEquals("getScore(10) returns a wrong result", number2750, sequence.getScore(number10));
        assertEquals("getScore(20) returns a wrong result", number10500, sequence.getScore(number20));
        assertEquals("getScore(30) returns a wrong result", number23250, sequence.getScore(number30));
        assertEquals("getScore(100) returns a wrong result", number25250, sequence.getScore(number100));
        assertEquals("getScore(123) returns a wrong result", number381300, sequence.getScore(number123));
        assertEquals("getScore(1000) returns a wrong result", number25025000, sequence.getScore(number1000));
        assertEquals("getScore(1234) returns a wrong result", number38099750, sequence.getScore(number1234));
        assertEquals("getScore(10000) returns a wrong result", number2500250000L, sequence.getScore(number10000));
        assertEquals("getScore(12345) returns a wrong result", number3810284250L, sequence.getScore(number12345));
    }

}
