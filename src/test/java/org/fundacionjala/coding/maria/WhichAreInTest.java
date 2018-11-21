package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * test for kata WhichAreIn.
 */
public class WhichAreInTest {
    private WhichAreIn whichAreIn;
    /**
     * initialize WhichAreIn.
     */
    @Before
    public void initialize() {
        whichAreIn = new WhichAreIn();
    }
    /**
     * test basic test.
     */
    @Test
    public void test1() {
        String[] a = new String[]{"arp", "live", "strong"};
        String[] b = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] r = new String[] {"arp", "live", "strong"};
        assertArrayEquals(r, whichAreIn.inArray(a, b));
    }

}
