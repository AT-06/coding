package org.fundacionjala.coding.omar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata16Test {

    @Test
    public void testReverseWords() {
        assertEquals(Kata16.reverseWords("I like eating"), "eating like I");
        assertEquals(Kata16.reverseWords("I like flying"), "flying like I");
        assertEquals(Kata16.reverseWords("The world is nice"), "nice is world The");
    }
}