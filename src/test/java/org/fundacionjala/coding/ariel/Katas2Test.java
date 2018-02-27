package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unittest of Kata2 check 4..
 */
public class Katas2Test {
    /**
     * Test to check the first condition.
     */
    @Test
    public void sortInnerContentTest1() {
        Katas2 text = new Katas2("sort the inner content in descending order");
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", text.changeWord());
    }

    /**
     * Test to check the second condition o.
     */
    @Test
    public void sortInnerContentTest2() {
        Katas2 text = new Katas2("wait for me");
        assertEquals("wiat for me", text.changeWord());
    }

    /**
     * Test to check the third condition.
     */
    @Test
    public void sortInnerContentTest3() {
        Katas2 text = new Katas2("this kata is easy");
        assertEquals("tihs ktaa is esay", text.changeWord());
    }
    /**
     * Test to check the fourth condition.
     */
    @Test
    public void sortInnerContentTest4() {
        Katas2 text = new Katas2("I am");
        assertEquals("I am", text.changeWord());
    }
}
