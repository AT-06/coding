package org.fundacionjala.coding.maria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
/**
 * Jaden_Casing_StringsTest contains test to the kata solution Jaden_Casing_StringsTest.
 */
public class JadenCasingStringsTest { 

    private JadenCasingStrings jadenCase = new JadenCasingStrings();

    /**
     * first test with a lot of strings.
     */
    @Test
    public void test() {
        String result = "toJadenCase doesn't return a valide JadenCase String! try again please :)";
        assertEquals(result, jadenCase.toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }
    /**
     * second test with a null argument.
     */
    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }
    /**
     * third test with a empty argument.
     */
    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(""));
    }

}
