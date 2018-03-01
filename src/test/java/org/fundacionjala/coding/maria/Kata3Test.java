package org.fundacionjala.coding.maria;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test kata 3.
 */
public class Kata3Test {


    /**
     * Test testpersistentBuggerOne.
     */
    @Test
    public void testpersistentBuggerOne() {
        final int ini1 = 39;
        final int fin1 = 3;
        final int ini2 = 25;
        final int fin2 = 2;
        final int ini3 = 444;
        final int fin3 = 3;
        final int ini4 = 4;
        final int fin4 = 0;
        final int ini5 = 999;
        final int fin5 = 4;

        Kata3 persist = new Kata3();

        assertEquals(fin1, persist.persistence(ini1));
        assertEquals(fin2, persist.persistence(ini2));
        assertEquals(fin3, persist.persistence(ini3));
        assertEquals(fin4, persist.persistence(ini4));
        assertEquals(fin5, persist.persistence(ini5));
    }
}
