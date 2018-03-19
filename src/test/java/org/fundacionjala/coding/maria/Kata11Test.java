package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test for kata 11.
 */
public class Kata11Test {
    private Kata11 kata11;
    /**
     * initialize kata11.
     */
    @Before
    public void initialize() {
        kata11 = new Kata11();
    }

    /**
     * Test testEvaporatorOne.
     */
    @Test
    public void testEvaporatorOne() {
        final int extected = 22;
        final int content = 10;
        assertEquals(extected, kata11.evaporator(content, content, content));
    }
    /**
     * Test testEvaporatorTwo.
     */
    @Test
    public void testEvaporatorTwo() {
        final int extected = 29;
        final int content = 10;
        final int threshold = 5;

        assertEquals(extected, kata11.evaporator(content, content, threshold));
    }

    /**
     * Test testEvaporatorThree.
     */
    @Test
    public void testEvaporatorThree() {
        final int extected = 59;
        final int content = 100;
        final int threshold = 5;
        assertEquals(extected, kata11.evaporator(content, threshold, threshold));
    }
    /**
     * Test testEvaporatorFour.
     */
    @Test
    public void testEvaporatorFour() {
        final int extected = 37;
        final int content = 50;
        final int evar = 12;
        final int threshold = 1;

        assertEquals(extected, kata11.evaporator(content, evar, threshold));
    }
    /**
     * Test testEvaporatorFive.
     */
    @Test
    public void testEvaporatorFive() {
        final int extected = 31;
        final double content = 47.5;
        final int evar = 8;

        assertEquals(extected, kata11.evaporator(content, evar, evar));
    }
    /**
     * Test testEvaporatorSix.
     */
    @Test
    public void testEvaporatorSix() {
        final int extected = 459;
        final double content = 100;
        final int evar = 1;
        assertEquals(extected, kata11.evaporator(content, evar, evar));
    }
    /**
     * Test testEvaporatorSeven.
     */
    @Test
    public void testEvaporatorSeven() {
        final int extected = 459;
        final double content = 10;
        final int evar = 1;
        assertEquals(extected, kata11.evaporator(content, evar, evar));
    }
    /**
     * Test testEvaporatorEight.
     */
    @Test
    public void testEvaporatorEight() {
        final int extected = 299;
        final double content = 100;
        final int evar = 1;
        final int thresh = 5;
        assertEquals(extected, kata11.evaporator(content, evar, thresh));
    }
}
