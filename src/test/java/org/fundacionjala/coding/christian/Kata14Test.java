package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/**
 * Performed by Christian.
 */
public class Kata14Test {

    private Kata14 katita;
    /**
     *
     */
    @Before
    public void setup() {
        katita = new Kata14();
    }

    /**
     *
     */
    @Test
    public void basicTests() {
        final double[] expected1 = new double[]{2, 2, 2, 2};
        final double[] expected2 = new double[] {0, 0, 0, 0};
        final double[] expected3 = new double[] {2, 4, 3, -4.5};

        final int[] case1 = new int[] {2, 2, 2, 2, 2};
        final int[] case2 = new int[] {2, -2, 2, -2, 2};
        final int[] case3 = new int[] {1, 3, 5, 1, -10};

        assertEquals(Arrays.toString(expected1), Arrays.toString(katita.averages(case1)));
        assertEquals(Arrays.toString(expected2), Arrays.toString(katita.averages(case2)));
        assertEquals(Arrays.toString(expected3), Arrays.toString(katita.averages(case3)));
    }

    /**
     *
     */
    @Test
    public void nullEmptyTests() {
        assertEquals("input 'null' should return an empty array",
                0, katita.averages(null).length);
        assertEquals("Empty array as input should return an empty array",
                0, katita.averages(new int[0]).length);
        assertEquals("Array with only one value as input should return an empty array",
                0, katita.averages(new int[]{2 }).length);
    }
}
