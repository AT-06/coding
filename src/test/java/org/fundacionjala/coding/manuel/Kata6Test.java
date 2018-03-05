package org.fundacionjala.coding.manuel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

/**
 * Created by Administrator on 3/5/2018.
 */
public class Kata6Test {
    /**
     * First test method sortTwisted37.
     */
    @Test
    public void basicTests() {
        Kata6 kata6 = new Kata6();
        final Integer[] expected1 = new Integer[] {1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] param1 = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        final Integer[] expected2 = new Integer[] {2, 7, 4, 3, 9};
        final Integer[] param2 = new Integer[] {9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(expected1), Arrays.toString(kata6.sortTwisted37(param1)));

        assertEquals(Arrays.toString(expected2), Arrays.toString(kata6.sortTwisted37(param2)));
    }

    /**
     * Second test method sortTwisted37.
     */
    @Test
    public void unChangedArrayTest() {
        final Integer[] array = new Integer[] {9, 2, 4, 7, 3};
        final Integer[] arrayCpy = new Integer[] {9, 2, 4, 7, 3};
        final Integer[] expected = new Integer[] {2, 7, 4, 3, 9};
        Kata6 kata6 = new Kata6();

        assertEquals(Arrays.toString(expected), Arrays.toString(kata6.sortTwisted37(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}
