package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kata 2 test.
 */
public class Kata2Test {
    private Kata2 kata2;
    /**
     * initialize kata2.
     */
    @Before
    public void initialize() {
        kata2 = new Kata2();
    }
    /**
     * test returnStringWithSortInnerContent.
     */
    @Test
    public void returnStringWithSortInnerContentLarge() {
        String sentence = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(sentence, kata2.sortInnerContent("sort the inner content in descending order"));
    }
    /**
     * test returnStringWithSortInnerContentShort.
     */
    @Test
    public void returnStringWithSortInnerContentShort() {
        String sentence = "wiat for me";
        assertEquals(sentence, kata2.sortInnerContent("wait for me"));
    }
    /**
     * test returnStringWithSortInnerContentShortTwo.
     */
    @Test
    public void returnStringWithSortInnerContentShortTwo() {
        String sentence = "tihs ktaa is esay";
        assertEquals(sentence, kata2.sortInnerContent("this kata is easy"));
    }
    /**
     * test returnStringWithSortInnerContentShortThree.
     */
    @Test
    public void returnStringWithSortInnerContentShortThree() {
        String sentence = "I am";
        assertEquals(sentence, kata2.sortInnerContent("I am"));
    }
}
