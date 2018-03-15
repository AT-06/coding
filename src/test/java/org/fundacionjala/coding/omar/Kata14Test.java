package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata14Test {

    Kata14 average;

    /**
     * Powered by Omar Limbert Huanca Sanchez - AT06.
     */

    @Before
    public void init(){

        average = new Kata14();
    }

    /**
     * Powered by Omar Limbert Huanca Sanchez - AT06.
     */
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[] { 2, 2, 2, 2 }), Arrays.toString(average.averages(new int[] { 2, 2, 2, 2, 2 })));
        assertEquals(Arrays.toString(new double[] { 0, 0, 0, 0 }), Arrays.toString(average.averages(new int[] { 2, -2, 2, -2, 2 })));
        assertEquals(Arrays.toString(new double[] { 2, 4, 3, -4.5 }), Arrays.toString(average.averages(new int[] { 1, 3, 5, 1, -10 })));
    }

    /**
     * Powered by Omar Limbert Huanca Sanchez - AT06.
     */
    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array", 0, average.averages(null).length);
        assertEquals("Empty array as input should return an empty array", 0, average.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array", 0, average.averages(new int[] { 2 }).length);
    }

}
