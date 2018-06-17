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

import org.fundacionjala.coding.omar.encryption.CesarEncryption;
import org.fundacionjala.coding.omar.encryption.VigenereEncryption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class contains UnitTest to test CesarEncryption class.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class EncryptionTest {

    private static final String VIGENERE_KEY = "LIMON";
    private CesarEncryption cesarEncryption;
    private VigenereEncryption vigenereEncryption;

    /**
     * init Kata.
     */
    @Before
    public void init() {

        cesarEncryption = new CesarEncryption();
        vigenereEncryption = new VigenereEncryption();
    }

    /**
     * Test to encode message with positive key.
     */
    @Test
    public void testEncodeWithPositiveKey() {
        final int key1 = 3;
        final int key2 = 5;
        assertEquals("KROD", cesarEncryption.encodeMessageWithCesarEncryption("HOLA", key1));
        assertEquals("ETWWT", cesarEncryption.encodeMessageWithCesarEncryption("ZORRO", key2));
    }

    /**
     * Test to encode message with negative key.
     */
    @Test
    public void testEncodeWithNegativeKey() {
        final int key = -3;
        assertEquals("HOLA", cesarEncryption.encodeMessageWithCesarEncryption("KROD", key));
    }

    /**
     * Test to encode message with empty message.
     */
    @Test
    public void testEncodeWithEmptyMessage() {
        final int key = 5;
        assertEquals("", cesarEncryption.encodeMessageWithCesarEncryption("", key));
    }

    /**
     * Test to encode message with null message.
     */
    @Test
    public void testEncodeWithNullMessage() {
        final int key = 5;
        assertEquals("", cesarEncryption.encodeMessageWithCesarEncryption(null, key));
    }

    /**
     * Test to encode message with special characters and blank spaces.
     */
    @Test
    public void testEncodeWithSpecialCharactersAndBlankSpace() {
        final int key = 3;
        assertEquals("K_ROD", cesarEncryption.encodeMessageWithCesarEncryption("H_OLA", key));
        assertEquals("KROD CRUUR", cesarEncryption.encodeMessageWithCesarEncryption("HOLA ZORRO", key));
    }

    /**
     * Test to decode message with positive key.
     */
    @Test
    public void testDecodeWithPositiveKey() {
        final int key = 3;
        assertEquals("X", cesarEncryption.decodeMessageWithCesarEncryption("A", key));
        assertEquals("W", cesarEncryption.decodeMessageWithCesarEncryption("Z", key));
    }

    /**
     * Test to decode message with negative key.
     */
    @Test
    public void testDecodeWithNegativeKey() {
        final int key = -3;
        assertEquals("FKVG", cesarEncryption.decodeMessageWithCesarEncryption("CHSD", key));
        assertEquals("CCGIV VGI", cesarEncryption.decodeMessageWithCesarEncryption("ZZDFS SDF", key));
    }

    /**
     * Test to decode message with empty message.
     */
    @Test
    public void testDecodeWithEmptyMessage() {
        final int key = 3;
        assertEquals("", cesarEncryption.decodeMessageWithCesarEncryption("", key));
    }

    /**
     * Test to decode message with null message.
     */
    @Test
    public void testDecodeWithNullMessage() {
        final int key = 3;
        assertEquals("", cesarEncryption.decodeMessageWithCesarEncryption(null, key));
    }

    /**
     * Test to encode message with special character or blanks spaces.
     */
    @Test
    public void testDecodeWithSpecialCharactersAndBlankSpace() {
        final int key = 3;
        assertEquals("H_OLA", cesarEncryption.decodeMessageWithCesarEncryption("K_ROD", key));
        assertEquals("HOLA ZORRO", cesarEncryption.decodeMessageWithCesarEncryption("KROD CRUUR", key));
    }

    /**
     * Test to encode with Vigenere Encryption and String key.
     */
    @Test
    public void testEncodeVigenereEncryption() {
        assertEquals("VJYPGAOG", vigenereEncryption.encodeMessageWithVigenereEncryption("JALASOFT", VIGENERE_KEY));
    }

    /**
     * Test to encode with Vigenere Encryption and String key with blank spaces.
     */
    @Test
    public void testEncodeVigenereEncryptionWithBlankSpaces() {
        assertEquals("TXYP XMUNHCRC",
                vigenereEncryption.encodeMessageWithVigenereEncryption("HOLA JALASOFT", VIGENERE_KEY));
    }

    /**
     * Test to encode with Vigenere Encryption and String key with empty message.
     */
    @Test
    public void testEncodeVigenereEncryptionWithEmptyMessage() {
        assertEquals("", vigenereEncryption.encodeMessageWithVigenereEncryption("", VIGENERE_KEY));
    }

    /**
     * Test to encode with Vigenere Encryption and String key with null message.
     */
    @Test
    public void testEncodeVigenereEncryptionWithNullMessage() {
        assertEquals("", vigenereEncryption.encodeMessageWithVigenereEncryption(null, VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key.
     */
    @Test
    public void testDecodeVigenereEncryption() {
        assertEquals("JALASOFT", vigenereEncryption.decodeMessageWithVigenereEncryption("VJYPGAOG", VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key and blank spaces.
     */
    @Test
    public void testDecodeVigenereEncryptionWithBlankSpaces() {
        assertEquals("HOLA JALASOFT",
                vigenereEncryption.decodeMessageWithVigenereEncryption("TXYP XMUNHCRC", VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key and empty message.
     */
    @Test
    public void testDecodeVigenereEncryptionWithEmptyMessage() {
        assertEquals("", vigenereEncryption.decodeMessageWithVigenereEncryption("", VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key and null message.
     */
    @Test
    public void testDecodeVigenereEncryptionWithNullMessage() {
        assertEquals("", vigenereEncryption.decodeMessageWithVigenereEncryption(null, VIGENERE_KEY));
    }

}

