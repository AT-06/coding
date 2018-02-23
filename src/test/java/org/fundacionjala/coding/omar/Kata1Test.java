package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains UnitTests for Kata1.java.
 */
public class Kata1Test {

    /**
     * This method is for testing if more that one word is present, but with all five or more letter:
     * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw".
     * spinWords( "This is a test") => returns "This is a test".
     * spinWords( "This is another test" )=> returns "This is rehtona test".
     */
    @Test
    public void ifMoreThatOneWordIsPresentItCanBeSpinWords() {
        Kata1 words = new Kata1();
        assertEquals("Hey wollef sroirraw", words.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", words.spinWords("This is a test"));
        assertEquals("This is rehtona test", words.spinWords("This is another test"));
    }


}
