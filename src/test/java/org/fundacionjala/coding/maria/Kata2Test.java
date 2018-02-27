package org.fundacionjala.coding.maria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kata 2 test.
 */
public class Kata2Test {
    /**
     * test returnStringWithSortInnerContent.
     */
    @Test
    public void returnStringWithSortInnerContentLarge() {
        String sentence = "srot the inner ctonnet in dsnnieedcg oredr";
        Kata2 words = new Kata2();
        assertEquals(sentence, words.sortInnerContent("sort the inner content in descending order"));
    }
    /**
     * test returnStringWithSortInnerContentShort.
     */
    @Test
    public void returnStringWithSortInnerContentShort() {
        String sentence = "wiat for me";
        Kata2 words = new Kata2();
        assertEquals(sentence, words.sortInnerContent("wait for me"));
    }
    /**
     * test returnStringWithSortInnerContentShortTwo.
     */
    @Test
    public void returnStringWithSortInnerContentShortTwo() {
        String sentence = "tihs ktaa is esay";
        Kata2 words = new Kata2();
        assertEquals(sentence, words.sortInnerContent("this kata is easy"));
    }
    /**
     * test returnStringWithSortInnerContentShortThree.
     */
    @Test
    public void returnStringWithSortInnerContentShortThree() {
        String sentence = "I am";
        Kata2 words = new Kata2();
        assertEquals(sentence, words.sortInnerContent("I am"));
    }

}
