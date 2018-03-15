package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Kata14Test {

    private Kata14 kata;

    @Before
    public void setUp(){
        kata = new Kata14();
    }


    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[] { 2, 2, 2, 2 }), Arrays.toString(kata.averages(new int[] { 2, 2, 2, 2, 2 })));
        assertEquals(Arrays.toString(new double[] { 0, 0, 0, 0 }), Arrays.toString(kata.averages(new int[] { 2, -2, 2, -2, 2 })));
        assertEquals(Arrays.toString(new double[] { 2, 4, 3, -4.5 }), Arrays.toString(kata.averages(new int[] { 1, 3, 5, 1, -10 })));
    }

    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array", 0, kata.averages(null).length);
        assertEquals("Empty array as input should return an empty array", 0, kata.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array", 0, kata.averages(new int[] { 2 }).length);
    }

}