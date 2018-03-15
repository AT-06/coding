package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Christian Galarza.
 */
public class Kata6Test {
    private Kata6 sort;

    /**
     *
     */
    @Before
    public void setup() {
        sort = new Kata6();
    }

    private final Integer[] kepler1 = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
    private final Integer[] earth1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final Integer[] kepler2 = new Integer[]{12, 14, 13};
    private final Integer[] earth2 = new Integer[]{12, 13, 14};
    private final Integer[] kepler3 = new Integer[]{2, 7, 4, 3, 9};
    private final Integer[] earth3 = new Integer[]{9, 2, 4, 7, 3};
    private final Integer[] earth4 = new Integer[]{9, 2, 4, 7, 3};
    private final Integer[] earth5 = new Integer[]{9, 2, 4, 7, 3};
    private final Integer[] kepler4 = new Integer[]{2, 7, 4, 3, 9};
    /**
     *
     */
    @Test
    public void testSortTwisted37BasicTests() {

         sort = new Kata6();

        assertEquals(Arrays.toString(kepler1),
                Arrays.toString(sort.sortTwisted37(earth1)));

        assertEquals(Arrays.toString(kepler2),
                Arrays.toString(sort.sortTwisted37(earth2)));

        assertEquals(Arrays.toString(kepler3),
                Arrays.toString(sort.sortTwisted37(earth3)));
    }

    /**
     *
     */
    @Test
    public void testSortTwisted37UnChangedArrayTest() {


        assertEquals(Arrays.toString(kepler4),
                Arrays.toString(sort.sortTwisted37(earth4)));

        assertEquals("You should not modify the input array!", Arrays.toString(earth5), Arrays.toString(earth4));
    }
}
