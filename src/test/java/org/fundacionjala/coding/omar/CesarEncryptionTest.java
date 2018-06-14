/*
 * @(#)CesarEncryptionTest.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * Address
 * All rights reserved.
 *
 * This software is the confidential and propietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 */
package org.fundacionjala.coding.omar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTest to test CesarEncryption class.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class CesarEncryptionTest {

    private CesarEncryption enconde;

    /**
     * init Kata.
     */
    @Before
    public void init() {

        enconde = new CesarEncryption();
    }

    /**
     * Test to encode message with a key.
     */
    @Test
    public void testEncodeWithPositiveKey() {
        final int key1 = 3;
        final int key2 = 5;
        assertEquals("KROD", enconde.encodeMessage("HOLA", key1));
        assertEquals("ETWWT", enconde.encodeMessage("ZORRO", key2));
    }

    /**
     * Test to encode message with a key.
     */
    @Test
    public void testEncodeWithNegativeKey() {
        final int key = -3;
        assertEquals("HOLA", enconde.encodeMessage("KROD", key));
    }

    /**
     * Test to encode message with a key.
     */
    @Test
    public void testEncondeWithBlankSpaceAndNullMessage() {
        final int key = 5;
        assertEquals("", enconde.encodeMessage("", key));
        assertEquals("", enconde.encodeMessage(null, key));
    }

    /**
     * Test to decode message with a key.
     */
    @Test
    public void testDecodeWithPositiveKey() {
        final int key = 3;
        assertEquals("X", enconde.decodeMessage("A", key));
        assertEquals("W", enconde.decodeMessage("Z", key));
    }

    /**
     * Test to decode message with a key.
     */
    @Test
    public void testDecodeWithBlankAndNullMessage() {
        final int key = 3;
        assertEquals("", enconde.decodeMessage("", key));
        assertEquals("", enconde.decodeMessage(null, key));
    }
}
