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
        assertEquals("KROD", enconde.encodeMessageWithCesarEncryption("HOLA", key1));
        assertEquals("ETWWT", enconde.encodeMessageWithCesarEncryption("ZORRO", key2));
    }

    /**
     * Test to encode message with a key.
     */
    @Test
    public void testEncodeWithNegativeKey() {
        final int key = -3;
        assertEquals("HOLA", enconde.encodeMessageWithCesarEncryption("KROD", key));
    }

    /**
     * Test to encode message with a key.
     */
    @Test
    public void testEncodeWithBlankSpaceAndNullMessage() {
        final int key = 5;
        assertEquals("", enconde.encodeMessageWithCesarEncryption("", key));
        assertEquals("", enconde.encodeMessageWithCesarEncryption(null, key));
    }

    /**
     * Test to encode message with a key.
     */
    @Test
    public void testEncodeWithSpecialCharactersAndBlankSpace() {
        final int key = 3;
        assertEquals("K_ROD", enconde.encodeMessageWithCesarEncryption("H_OLA", key));
        assertEquals("KROD CRUUR", enconde.encodeMessageWithCesarEncryption("HOLA ZORRO", key));
    }

    /**
     * Test to decode message with a key.
     */
    @Test
    public void testDecodeWithPositiveKey() {
        final int key = 3;
        assertEquals("X", enconde.decodeMessageWithCesarEncryption("A", key));
        assertEquals("W", enconde.decodeMessageWithCesarEncryption("Z", key));
    }

    /**
     * Test to decode message with a key.
     */
    @Test
    public void testDecodeWithNegativeKey() {
        final int key = -3;
        assertEquals("FKVG", enconde.decodeMessageWithCesarEncryption("CHSD", key));
        assertEquals("CCGIV VGI", enconde.decodeMessageWithCesarEncryption("ZZDFS SDF", key));
    }

    /**
     * Test to decode message with a key.
     */
    @Test
    public void testDecodeWithBlankAndNullMessage() {
        final int key = 3;
        assertEquals("", enconde.decodeMessageWithCesarEncryption("", key));
        assertEquals("", enconde.decodeMessageWithCesarEncryption(null, key));
    }

    /**
     * Test to encode message with a key.
     */
    @Test
    public void testDecodeWithSpecialCharactersAndBlankSpace() {
        final int key = 3;
        assertEquals("H_OLA", enconde.decodeMessageWithCesarEncryption("K_ROD", key));
        assertEquals("HOLA ZORRO", enconde.decodeMessageWithCesarEncryption("KROD CRUUR", key));
    }
}

