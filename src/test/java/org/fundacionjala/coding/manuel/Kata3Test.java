package org.fundacionjala.coding.manuel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Administrator on 3/1/2018.
 */
public class Kata3Test {

    /**
     * test the persitance method..
     */
    @Test
    public void testPersistenceKata3() {
        final int testNumber0 = 0;
        final int testNumber2 = 2;
        final int testNumber3 = 3;
        final int testNumber4 = 4;
        final int testNumber25 = 25;
        final int testNumber39 = 39;
        final int testNumber444 = 444;
        final int testNumber999 = 999;
        Kata3 kata3 = new Kata3();
        assertEquals(testNumber3, kata3.persistence(testNumber39));
        assertEquals(testNumber0, kata3.persistence(testNumber4));
        assertEquals(testNumber2, kata3.persistence(testNumber25));
        assertEquals(testNumber4, kata3.persistence(testNumber999));
        assertEquals(testNumber3, kata3.persistence(testNumber444));
    }

}


