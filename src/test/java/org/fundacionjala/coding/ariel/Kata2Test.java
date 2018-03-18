package org.fundacionjala.coding.ariel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unittest of Kata2 check 4.
 */
public class Kata2Test {
    /**
     * Test to check the conditions.
     */
    @Test
    public void sortInnerContentTest1() {
        Kata2 text = new Kata2();
        String resp1 = "srot the inner ctonnet in dsnnieedcg oredr";
        String input1 = "sort the inner content in descending order";
        assertEquals(resp1, text.changeWord(input1));
        assertEquals("wiat for me", text.changeWord("wait for me"));
        assertEquals("tihs ktaa is esay", text.changeWord("this kata is easy"));
        assertEquals("I am", text.changeWord("I am"));
    }
}


