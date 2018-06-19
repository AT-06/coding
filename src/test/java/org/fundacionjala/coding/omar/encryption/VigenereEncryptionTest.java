/*
 * @(#)VigenereEncryptionTest.java
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
 * This class contains UnitTest to test Vigenere Encryption class.
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class VigenereEncryptionTest {

    private static final String VIGENERE_KEY = "LIMON";
    private VigenereEncryption vigenereEncryption;

    /**
     * init Kata.
     */
    @Before
    public void init() {
        vigenereEncryption = new VigenereEncryption();
    }

    /**
     * Test to encode with Vigenere Encryption and String key.
     */
    @Test
    public void testEncodeVigenereEncryption() {
        assertEquals("VJYPGAOG", vigenereEncryption.encodeMessage("JALASOFT", VIGENERE_KEY));
    }

    /**
     * Test to encode with Vigenere Encryption and String key with blank spaces.
     */
    @Test
    public void testEncodeVigenereEncryptionWithBlankSpaces() {
        assertEquals("TXYP XMUNHCRC",
                vigenereEncryption.encodeMessage("HOLA JALASOFT", VIGENERE_KEY));
    }

    /**
     * Test to encode with Vigenere Encryption and String key with empty message.
     */
    @Test
    public void testEncodeVigenereEncryptionWithEmptyMessage() {
        assertEquals("", vigenereEncryption.encodeMessage("", VIGENERE_KEY));
    }

    /**
     * Test to encode with Vigenere Encryption and String key with null message.
     */
    @Test
    public void testEncodeVigenereEncryptionWithNullMessage() {
        assertEquals("", vigenereEncryption.encodeMessage(null, VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key.
     */
    @Test
    public void testDecodeVigenereEncryption() {
        assertEquals("JALASOFT", vigenereEncryption.decodeMessage("VJYPGAOG", VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key and blank spaces.
     */
    @Test
    public void testDecodeVigenereEncryptionWithBlankSpaces() {
        assertEquals("HOLA JALASOFT",
                vigenereEncryption.decodeMessage("TXYP XMUNHCRC", VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key and empty message.
     */
    @Test
    public void testDecodeVigenereEncryptionWithEmptyMessage() {
        assertEquals("", vigenereEncryption.decodeMessage("", VIGENERE_KEY));
    }

    /**
     * Test to decode with Vigenere Encryption and String key and null message.
     */
    @Test
    public void testDecodeVigenereEncryptionWithNullMessage() {
        assertEquals("", vigenereEncryption.decodeMessage(null, VIGENERE_KEY));
    }

}
