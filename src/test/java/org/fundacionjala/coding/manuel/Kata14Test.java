package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/15/2018.
 */
public class Kata14Test {

    private Kata14 kata14;

    /**
     * Method to initialize.
     */
    @Before
    public void intialize() {
        kata14 = new Kata14();
    }

    /**
     * First test for averages.
     */
    @Test
    public void basicTests() {
        final double[] expectedArray1 = new double[]{2, 2, 2, 2};
        final int[] paramArray1 = new int[]{2, 2, 2, 2, 2 };

        final double[] expectedArray2 = new double[]{0, 0, 0, 0};
        final int[] paramArray2 = new int[]{2, -2, 2, -2, 2};

        final double[] expectedArray3 = new double[]{2, 4, 3, -4.5};
        final int[] paramArray3 = new int[]{1, 3, 5, 1, -10};
        assertEquals(Arrays.toString(expectedArray1), Arrays.toString(kata14.averages(paramArray1)));
        assertEquals(Arrays.toString(expectedArray2), Arrays.toString(kata14.averages(paramArray2)));
        assertEquals(Arrays.toString(expectedArray3), Arrays.toString(kata14.averages(paramArray3)));
    }

    /**
     * First test for special cases.
     */
    @Test
    public void nullEmptyTests() {
        final String message = "Array with only one value as input should return an empty array";
        assertEquals("input 'null' should return an empty array", 0, kata14.averages(null).length);
        assertEquals("Empty array as input should return an empty array", 0, kata14.averages(new int[0]).length);
        assertEquals(message, 0, kata14.averages(new int[] {2}).length);
    }
}

