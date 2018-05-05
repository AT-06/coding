package org.fundacionjala.coding.escarleth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTests for CamelCaseMethod.
 */
public class CamelCaseMethodTest {
    private CamelCaseMethod kata16;

    /**
     * initialize kata16.
     */
    @Before
    public void initialize() {
        kata16 = new CamelCaseMethod();
    }

    /**
     * This method is for testing two words converted to CamelCase.
     */
    @Test
    public void testTwoWords() {
        assertEquals("TestCase", kata16.camelCase("test case"));
    }

    /**
     * This method is for testing three words converted to CamelCase.
     */
    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", kata16.camelCase("camel case method"));
    }

    /**
     * This method is for testing three words with a space converted to CamelCase.
     */
    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", kata16.camelCase(" camel case word"));
    }

    /**
     * This method is for testing two words with trailing space converted to CamelCase.
     */
    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", kata16.camelCase("say hello "));
    }

    /**
     * This method is for testing a single letter converted to CamelCase.
     */
    @Test
    public void testSingleLetter() {
        assertEquals("Z", kata16.camelCase("z"));
    }

    /**
     * This method is for testing Two Space sBetween Words converted to CamelCase.
     */
    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", kata16.camelCase("ab  c"));
    }

    /**
     * This method is for testing a empty String.
     */
    @Test
    public void testEmptyString() {
        assertEquals("", kata16.camelCase(""));
    }

}
