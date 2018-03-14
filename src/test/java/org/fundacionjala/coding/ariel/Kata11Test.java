package org.fundacionjala.coding.ariel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unittest to verify the  Deodorant Evaporator.
 */
public class Kata11Test {
    private Kata11 katita;

    /**
     * It init the Kata11.
     */
    @Before
    public void init() {
        katita = new Kata11();
    }

    /**
     * It check the test on Evaporator.
     */
    @Test
    public void testEvaporator() {
        final int expected = 22;
        final int content = 10;
        final int evapPerDay = 10;
        final int threshold = 10;
        assertEquals(expected, katita.evaporator(content, evapPerDay, threshold));
        final int expected1 = 29;
        final int content1 = 10;
        final int evapPerDay1 = 10;
        final int threshold1 = 5;
        assertEquals(expected1, katita.evaporator(content1, evapPerDay1, threshold1));
        final int expected2 = 59;
        final int content2 = 100;
        final int evapPerDay2 = 5;
        final int threshold2 = 5;
        assertEquals(expected2, katita.evaporator(content2, evapPerDay2, threshold2));
        final int expected3 = 37;
        final int content3 = 50;
        final int evapPerDay3 = 12;
        final int threshold3 = 1;
        assertEquals(expected3, katita.evaporator(content3, evapPerDay3, threshold3));
        final int expected4 = 31;
        final double content4 = 47.5;
        final int evapPerDay4 = 8;
        final int threshold4 = 8;
        assertEquals(expected4, katita.evaporator(content4, evapPerDay4, threshold4));
        final int expected5 = 459;
        final int content5 = 100;
        final int evapPerDay5 = 1;
        final int threshold5 = 1;
        assertEquals(expected5, katita.evaporator(content5, evapPerDay5, threshold5));
        final int expected6 = 459;
        final int content6 = 10;
        final int evapPerDay6 = 1;
        final int threshold6 = 1;
        assertEquals(expected6, katita.evaporator(content6, evapPerDay6, threshold6));
        final int expected7 = 299;
        final int content7 = 100;
        final int evapPerDay7 = 1;
        final int threshold7 = 5;
        assertEquals(expected7, katita.evaporator(content7, evapPerDay7, threshold7));


    }

}
