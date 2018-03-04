package org.fundacionjala.coding.jimmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class created by Jimmy Romero.
 */
public class Kata2Test {

    private Kata2 kata2;

    /**
     * It initializes kata2.
     */
    @Before
    public void initialize() {
        kata2 = new Kata2();
    }


    /**
     * This test is performed in order to compare the expected and actual result.
     */
    @Test
    public void test1() {
        String stringWords = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", kata2.sortInnerContent(stringWords));
    }

    /**
     * This test is performed in order to compare the expected and actual result.
     */
    @Test
    public void test2() {
        String stringWords = "wait for me";
        assertEquals("wiat for me", kata2.sortInnerContent(stringWords));
    }

    /**
     * This test is performed in order to compare the expected and actual result.
     */
    @Test
    public void test3() {
        String stringWords = "this kata is easy";
        assertEquals("tihs ktaa is esay", kata2.sortInnerContent(stringWords));
    }

    /**
     * This test is performed in order to compare the expected and actual result.
     */
    @Test
    public void test4() {
        String stringWords = "I am";
        assertEquals("I am", kata2.sortInnerContent(stringWords));
    }
}
