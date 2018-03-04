package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A class for testing Kata1 class.
 */
public class Kata1Test {


    private Kata1 kata;

    /**
     * Initializes variable kata.
     */
    @Before
    public void initialize() {
        kata = new Kata1();
    }

    /**
     * Tests if the word has more than five characters.
     */
    @Test
    public void theWordIsTheReverseStringIfItHasMoreThanFiveCharacters() {
        assertEquals("emocleW", kata.spinWords("Welcome"));
    }

    /**
     * Tests if the sentence has words with less than five characters.
     */
    @Test
    public void theSentenceIsTheSameIfTheWordsLengthAreLessThanFive() {
        assertEquals("This is a test", kata.spinWords("This is a test"));
    }

    /**
     * Tests if the sentence has words with more than five characters.
     */
    @Test
    public void theSentenceIsNotTheSameIfTheSentenceHasWordsWithCharactersMoreThanFive() {
        assertEquals("This is rehtona test", kata.spinWords("This is another test"));
    }
}
