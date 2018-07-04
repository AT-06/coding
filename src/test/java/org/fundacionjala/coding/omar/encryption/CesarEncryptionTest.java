/*
 * @(#)EncryptionTest.java
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
package org.fundacionjala.coding.omar.encryption;

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

    private CesarEncryption cesarEncryption;
    /**
     * init Kata.
     */
    @Before
    public void init() {
        cesarEncryption = new CesarEncryption();
    }

    /**
     * Test to encode message with positive key.
     */
    @Test
    public void testEncodeWithPositiveKey() {
        final String key1 = "3";
        final String key2 = "5";
        assertEquals("KROD", cesarEncryption.encodeMessage("HOLA", key1));
        assertEquals("ETWWT", cesarEncryption.encodeMessage("ZORRO", key2));
    }

    /**
     * Test to encode message with negative key.
     */
    @Test
    public void testEncodeWithNegativeKey() {
        final String key = "-3";
        assertEquals("HOLA", cesarEncryption.encodeMessage("KROD", key));
    }

    /**
     * Test to encode message with empty message.
     */
    @Test
    public void testEncodeWithEmptyMessage() {
        final String key = "5";
        assertEquals("", cesarEncryption.encodeMessage("", key));
    }

    /**
     * Test to encode message with null message.
     */
    @Test
    public void testEncodeWithNullMessage() {
        final String key = "5";
        assertEquals("", cesarEncryption.encodeMessage(null, key));
    }

    /**
     * Test to encode message with special characters and blank spaces.
     */
    @Test
    public void testEncodeWithSpecialCharactersAndBlankSpace() {
        final String key = "3";
        assertEquals("K_ROD", cesarEncryption.encodeMessage("H_OLA", key));
        assertEquals("KROD CRUUR", cesarEncryption.encodeMessage("HOLA ZORRO", key));
    }

    /**
     * Test to decode message with positive key.
     */
    @Test
    public void testDecodeWithPositiveKey() {
        final String key = "3";
        assertEquals("X", cesarEncryption.decodeMessage("A", key));
        assertEquals("W", cesarEncryption.decodeMessage("Z", key));
    }

    /**
     * Test to decode message with negative key.
     */
    @Test
    public void testDecodeWithNegativeKey() {
        final String key = "-3";
        assertEquals("FKVG", cesarEncryption.decodeMessage("CHSD", key));
        assertEquals("CCGIV VGI", cesarEncryption.decodeMessage("ZZDFS SDF", key));
    }

    /**
     * Test to decode message with empty message.
     */
    @Test
    public void testDecodeWithEmptyMessage() {
        final String key = "3";
        assertEquals("", cesarEncryption.decodeMessage("", key));
    }

    /**
     * Test to decode message with null message.
     */
    @Test
    public void testDecodeWithNullMessage() {
        final String key = "3";
        assertEquals("", cesarEncryption.decodeMessage(null, key));
    }

    /**
     * Test to encode message with special character or blanks spaces.
     */
    @Test
    public void testDecodeWithSpecialCharactersAndBlankSpace() {
        final String key = "3";
        assertEquals("H_OLA", cesarEncryption.decodeMessage("K_ROD", key));
        assertEquals("HOLA ZORRO", cesarEncryption.decodeMessage("KROD CRUUR", key));
    }
}
