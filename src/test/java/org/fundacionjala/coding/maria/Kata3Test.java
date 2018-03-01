package org.fundacionjala.coding.maria;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test kata 3.
 */
public class Kata3Test {
    public static final int INI1 = 39;
    public static final int FIN1 = 3;
    public static final int INI2 = 25;
    public static final int FIN2 = 2;
    public static final int INI3 = 444;
    public static final int FIN3 = 3;
    public static final int INI4 = 4;
    public static final int FIN4 = 0;
    public static final int INI5 = 999;
    public static final int FIN5 = 4;

    /**
     * Test testpersistentBuggerOne.
     */
    @Test
    public void testpersistentBuggerOne() {
        Kata3 persist = new Kata3();

        assertEquals(FIN1, persist.persistence(INI1));
        assertEquals(FIN2, persist.persistence(INI2));
        assertEquals(FIN3, persist.persistence(INI3));
    }
    /**
     * Test testpersistentBuggerTwo.
     */
    @Test
    public void testpersistentBuggerTwo() {
        Kata3 persist = new Kata3();
        assertEquals(FIN4, persist.persistence(INI4));
    }
    /**
     * Test testpersistentBuggerThree.
     */
    @Test
    public void testpersistentBuggerThree() {
        Kata3 persist = new Kata3();
        assertEquals(FIN5, persist.persistence(INI5));
    }

}
