package org.fundacionjala.coding.manuel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Administrator on 3/1/2018.
 */
public class Kata3Test {

    private static final int TEST_NUMBER_0 = 0;
    private static final int TEST_NUMBER_2 = 2;
    private static final int TEST_NUMBER_3 = 3;
    private static final int TEST_NUMBER_4 = 4;
    private static final int TEST_NUMBER_25 = 25;
    private static final int TEST_NUMBER_39 = 39;
    private static final int TEST_NUMBER_444 = 444;
    private static final int TEST_NUMBER_999 = 999;

    /**
     * test the persitance method..
     */
    @Test
    public void testPersistenceKata3() {
        Kata3 kata3 = new Kata3();
        System.out.println("****** Basic Tests ******");
        assertEquals(TEST_NUMBER_3, kata3.persistence(TEST_NUMBER_39));
        assertEquals(TEST_NUMBER_0, kata3.persistence(TEST_NUMBER_4));
        assertEquals(TEST_NUMBER_2, kata3.persistence(TEST_NUMBER_25));
        assertEquals(TEST_NUMBER_4, kata3.persistence(TEST_NUMBER_999));
        assertEquals(TEST_NUMBER_3, kata3.persistence(TEST_NUMBER_444));
    }

}


