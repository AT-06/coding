package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/**
 * Performed by Christian.
 */
public class ChristianKata14Test {
    public static final int NEGATIVE_TWO = -2;
    public static final int NEGATIVE_TEN = -10;
    public static final double NEGATIVE_FOURP = -4.5;
    public static final int NUMBER_2 = 2;
    public static final int NUMBER_0 = 0;
    public static final int NUMBER_4 = 4;
    public static final int NUMBER_1 = 1;
    public static final int NUMBER_3 = 3;
    public static final int NUMBER_5 = 5;

    private ChristianKata14 katita;
    /**
     *
     */
    @Before
    public void setup() {
        katita = new ChristianKata14();
    }

    /**
     *
     */
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[]{NUMBER_2, NUMBER_2, NUMBER_2, NUMBER_2 }),
                Arrays.toString(katita.averages(new int[]{
                        NUMBER_2, NUMBER_2, NUMBER_2, NUMBER_2, NUMBER_2 })));
        assertEquals(Arrays.toString(new double[]{
                NUMBER_0, NUMBER_0, NUMBER_0, NUMBER_0 }),
                Arrays.toString(katita.averages(new int[]{
                        NUMBER_2, NEGATIVE_TWO, NUMBER_2, NEGATIVE_TWO, NUMBER_2 })));
        assertEquals(Arrays.toString(new double[]{NUMBER_2, NUMBER_4, NUMBER_3, NEGATIVE_FOURP }),
                Arrays.toString(katita.averages(new int[]{
                        NUMBER_1, NUMBER_3, NUMBER_5, NUMBER_1, NEGATIVE_TEN })));
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
