package org.fundacionjala.coding.manuel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Created by Administrator on 3/1/2018.
 */
public class Kata4Test {

    /**
     * Created by Administrator on 3/1/2018.
     */
    @Test
    public void testDigitalRootKata4Test() {
        Kata4 kata4 = new Kata4();
        final int expectedResult1 = 7;
        final int expectedResult2 = 6;
        final int expectedResult3 = 2;

        final int paramSent1 = 16;
        final int paramSent2 = 942;
        final int paramSent3 = 132189;
        final int paramSent4 = 493193;

        assertEquals(expectedResult1, kata4.digitalRoot(paramSent1));
        assertEquals(expectedResult2, kata4.digitalRoot(paramSent2));
        assertEquals(expectedResult2, kata4.digitalRoot(paramSent3));
        assertEquals(expectedResult3, kata4.digitalRoot(paramSent4));
    }
}
