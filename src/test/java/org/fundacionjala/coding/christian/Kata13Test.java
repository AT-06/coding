package org.fundacionjala.coding.christian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Performed by christian.
 */
public class Kata13Test {
    private Kata13 validator;

    /**
     *
     */
    @Before
    public void setup() {
        validator = new Kata13();
    }

    /**
     *
     */
    @Test
    public void test01() {
        assertFalse("Check EAN-Code \"9783815820865\"", validator.validate("9783815820865"));
    }

    /**
     *
     */
    @Test
    public void test02() {
        assertFalse("Check EAN-Code \"9783815820864\"", validator.validate("9783815820864"));
    }

    /**
     *
     */
    @Test
    public void test03() {
        assertTrue("Check EAN-Code \"9783827317100\"", validator.validate("9783827317100"));
    }

    /**
     *
     */
    @Test
    public void test04() {
        assertFalse("Check EAN-Code \"4003301018398\"", validator.validate("4003301018398"));
    }

    /**
     *
     */
    @Test
    public void test05() {
        assertFalse("Check EAN-Code \"9783827317101\"", validator.validate("9783827317101"));
    }

    /**
     *
     */
    @Test
    public void test06() {
        assertFalse("Check EAN-Code \"4003301018392\"", validator.validate("4003301018392"));
    }

    /**
     *
     */
    @Test
    public void test07() {
        assertFalse("Check EAN-Code \"0000000000017\"", validator.validate("0000000000017"));
    }

    /**
     *
     */
    @Test
    public void test08() {
        assertFalse("Check EAN-Code \"0000000000010\"", validator.validate("0000000000010"));
    }

}
