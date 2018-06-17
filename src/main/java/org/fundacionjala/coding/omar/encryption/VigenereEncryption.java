/*
 * @(#)VigenereEncryption.java
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

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class VigenereEncryption extends Encryption {

    private int indexVigenereKey;

    /**
     * Constructor to initialize index for Vigenere Key.
     */
    public VigenereEncryption() {
        super();
        indexVigenereKey = 0;
    }

    /**
     * Method to encode Message with Vigenere Encryption.
     *
     * @param message This is message to encode with Vigenere Encryption.
     * @param key     This is a key with string value.
     * @return String , string already encode with Vigenere Encryption..
     */
    public String encodeMessageWithVigenereEncryption(String message, String key) {

        if (!this.isInvalidMessage(message)) {
            return Arrays.stream(message.split(""))
                    .map(letter -> this.isValidCharacter(letter)
                            ? this.getLetterWithVigenereEncryption(letter, key, true)
                            : letter)
                    .collect(Collectors.joining());
        }
        return "";
    }

    /**
     * Method to decode Message with Vigenere Encryption.
     *
     * @param message This is message to decode with Vigenere Encryption.
     * @param key     This is a key with string value.
     * @return String , string already encode with Vigenere Encryption..
     */
    public String decodeMessageWithVigenereEncryption(String message, String key) {

        if (!this.isInvalidMessage(message)) {
            return Arrays.stream(message.split(""))
                    .map(letter -> this.isValidCharacter(letter)
                            ? this.getLetterWithVigenereEncryption(letter, key, false)
                            : letter)
                    .collect(Collectors.joining());
        }
        return "";
    }

    /**
     * Method to get letter already encode/decode with vigenere getLetterWithAlgorithm.
     *
     * @param letter         This is a letter to encode/decode.
     * @param key            This is a key with string value.
     * @param encodeOrDecode True if is Encode and False if is Decode process.
     * @return String , string already encode with Vigenere Encryption.
     */
    public String getLetterWithVigenereEncryption(String letter, String key, boolean encodeOrDecode) {
        String result;
        int convertIndex = encodeOrDecode ? 1 : -1;
        if (indexVigenereKey < key.length()) {
            result = this.getLetterWithAlgorithm(letter, convertIndex * this.getVigenereKey(key.charAt(indexVigenereKey)));
            indexVigenereKey++;
        } else {
            indexVigenereKey = 0;
            result = this.getLetterWithAlgorithm(letter, convertIndex * this.getVigenereKey(key.charAt(indexVigenereKey)));
            indexVigenereKey++;
        }
        return result;
    }

    /**
     * Method to get key index.
     *
     * @param letter letter to get index.
     * @return Integer, index of new string key.
     */
    private int getVigenereKey(char letter) {
        int index = letter + 1;
        return index - FIRST_LETTER;
    }
}
