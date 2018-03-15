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


    private final Integer[] KEEPER_1 = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
    private final Integer[] EARTH_1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    private final Integer[] KEEPER_2 = new Integer[]{12, 14, 13};
    private final Integer[] EARTH_2 = new Integer[]{12, 13, 14};
    private final Integer[] KEEPER_3 = new Integer[]{2, 7, 4, 3, 9};
    private final Integer[] EARTH_3 = new Integer[]{9, 2, 4, 7, 3};
    private final Integer[] EARTH_4 = new Integer[]{9, 2, 4, 7, 3};
    private final Integer[] EARTH_5 = new Integer[]{9, 2, 4, 7, 3};
    private final Integer[] KEEPER_4 = new Integer[]{2, 7, 4, 3, 9};

    /**
     *
     */
    @Test
    public void testSortTwisted37BasicTests() {

         sort = new Kata6();

        assertEquals(Arrays.toString(KEEPER_1),
                Arrays.toString(sort.sortTwisted37(EARTH_1)));

        assertEquals(Arrays.toString(KEEPER_2),
                Arrays.toString(sort.sortTwisted37(EARTH_2)));

        assertEquals(Arrays.toString(KEEPER_3),
                Arrays.toString(sort.sortTwisted37(EARTH_3)));
    }

    /**
     *
     */
    @Test
    public void testSortTwisted37UnChangedArrayTest() {


        assertEquals(Arrays.toString(KEEPER_4),
                Arrays.toString(sort.sortTwisted37(EARTH_4)));

        assertEquals("You should not modify the input array!", Arrays.toString(EARTH_5), Arrays.toString(EARTH_4));
    }
}
