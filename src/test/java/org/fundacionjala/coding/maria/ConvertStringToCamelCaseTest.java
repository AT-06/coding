package org.fundacionjala.coding.maria;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * test fot kata ConvertStringToCamelCase.
 */
public class ConvertStringToCamelCaseTest {
    private ConvertStringToCamelCase solution;
    /**
     * initialize ConvertStringToCamelCase kata.
     */
    @Before
    public void initialize() {
        solution = new ConvertStringToCamelCase();
    }

    /**
     * test without strings.
     */
    @Test
    public void testEmptyString() {
        String input = "";
        System.out.println("input: " + input);
        assertEquals("", solution.toCamelCase(input));
    }
    /**
     * test with some words.
     */
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", solution.toCamelCase(input));
    }
    /**
     * testSomeDashLowerStart.
     */
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", solution.toCamelCase(input));
    }
    /**
     * testSomeUnderscoreUpperStart.
     */
    @Test
    public void testSomeUnderscoreUpperStart() {
        String input = "The_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("TheStealthWarrior", solution.toCamelCase(input));
    }
    /**
     * testSomeUnderscoreUpperStart.
     */
    @Test
    public void testSomeDashUpperStart() {
        String input = "The-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("TheStealthWarrior", solution.toCamelCase(input));
    }

}
