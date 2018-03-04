package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * It test check five conditions..
 */
public class Kata3Test {
    /**
     * It test made the five conditions.
     */
    @Test
    public void basicTests() {
        Kata3 katita = new Kata3();

        final int r1 = 3;
        final int input1 = 39;
        assertEquals(r1, katita.persistentBurgger(input1));
        final int r2 = 0;
        final int input2 = 4;
        assertEquals(r2, katita.persistentBurgger(input2));
        final int r3 = 2;
        final int input3 = 25;
        assertEquals(r3, katita.persistentBurgger(input3));
        final int r4 = 4;
        final int input4 = 999;
        assertEquals(r4, katita.persistentBurgger(input4));
        final int r5 = 3;
        final int input5 = 444;
        assertEquals(r5, katita.persistentBurgger(input5));
    }

}
