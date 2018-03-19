package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Administrator on 3/15/2018.
 */
public class Kata13Test {
    private Kata13 kata13;

    /**
     * Method to initialize.
     */
    @Before
    public void initializa() {
        kata13 = new Kata13();
    }

    /**
     * First test.
     */
    @Test
    public void test1IsValidEANKata13() {
        assertTrue(kata13.isValidEAN("4003301018398"));
    }

    /**
     * Second test.
     */
    @Test
    public void test2IsValidEANKata13() {
        assertFalse(kata13.isValidEAN("4003301018392"));
    }

    /**
     * Third test.
     */
    @Test
    public void test3IsValidEANKata13() {
        assertTrue(kata13.isValidEAN("2200000002020"));
    }
}
