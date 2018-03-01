package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * It test check five conditions..
 */
public class Kata3Test {

    public static final int R1 = 3;
    public static final int R2 = 0;
    public static final int R3 = 2;
    public static final int R4 = 4;
    public static final int R5 = 3;
    public static final int INPUT1 = 39;
    public static final int INPUT2 = 4;
    public static final int INPUT3 = 25;
    public static final int INPUT4 = 999;
    public static final int INPUT5 = 444;

    /**
     * It test made the five conditions.
     */
    @Test
    public void basicTests() {
        System.out.println("****** Basic Tests ******");
        Kata3 katita = new Kata3();
        assertEquals(R1, katita.persistentBurgger(INPUT1));
        assertEquals(R2, katita.persistentBurgger(INPUT2));
        assertEquals(R3, katita.persistentBurgger(INPUT3));
        assertEquals(R4, katita.persistentBurgger(INPUT4));
        assertEquals(R5, katita.persistentBurgger(INPUT5));
    }

}
