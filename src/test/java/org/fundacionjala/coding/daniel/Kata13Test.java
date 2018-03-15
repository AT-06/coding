package org.fundacionjala.coding.daniel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A class for testing Kata 13.
 */
public class Kata13Test {

    private Kata13 kata;

    /**
     * Initializes variable kata;
     */
    @Before
    public void setUp(){
        kata = new Kata13();
    }

    /**
     * unit testing of 'validate' method.
     */
    @Test
    public void testValidate(){
        assertEquals(true,kata.validate("4003301018398"));
        assertEquals(false,kata.validate("4003301018392"));
        assertEquals(false,kata.validate("400330101839"));
    }

}