package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * class to test camelCase.
 */
public class CamelCaseTest {
    private CamelCase solution;
    /**
     * initialize camelCasetest.
     */
    @Before
    public void initialize() {
        solution = new CamelCase();
    }

    /**
     * test testTwoWords.
     */
    @Test
    public void testTwoWords() {
        assertEquals("TestCase", solution.camelCase("test case"));
    }
    /**
     * test testThreeWords.
     */
    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", solution.camelCase("camel case method"));
    }
    /**
     * test testLeadingSpace.
     */
    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", solution.camelCase(" camel case word"));
    }
    /**
     * test testTrailingSpace.
     */
    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", solution.camelCase("say hello "));
    }
    /**
     * test testSingleLetter.
     */
    @Test
    public void testSingleLetter() {
        assertEquals("Z", solution.camelCase("z"));
    }
    /**
     * test testTwoSpacesBetweenWords.
     */
    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", solution.camelCase("ab  c"));
    }
    /**
     * test testEmptyString.
     */
    @Test
    public void testEmptyString() {
        assertEquals("", solution.camelCase(""));
    }

}
