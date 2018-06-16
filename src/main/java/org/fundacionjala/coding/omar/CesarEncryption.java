/*
 * @(#)CesarEncryption.java
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

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class CesarEncryption {

    private static final char LAST_LETTER = 'Z';
    private static final char FIRST_LETTER = 'A';
    private static final int DIFFERENCE = 26;
    private int indexVigenereKey;

    /**
     * Constructor to initialize index for Vigenere Encryption.
     */
    public CesarEncryption() {
        this.indexVigenereKey = 0;
    }

    /**
     * Method to encode Message with Cesar Encryption.
     *
     * @param message This is message to encode.
     * @param key     This is key for encode.
     * @return String , string already encode with Cesar Encryption.
     */
    public String encodeMessageWithCesarEncryption(String message, int key) {
        if (!this.isInvalidMessage(message)) {
            return Arrays.stream(message.split(""))
                    .map(letter -> this.algorithm(letter, key))
                    .collect(Collectors.joining());
        }
        return "";
    }

    /**
     * Method to decode Message with Cesar Encryption.
     *
     * @param message This is message to decode.
     * @param key     This is key for decode.
     * @return String , string already encode with Cesar Encryption.
     */
    public String decodeMessageWithCesarEncryption(String message, int key) {

        if (!this.isInvalidMessage(message)) {
            return Arrays.stream(message.split(""))
                    .map(letter -> this.algorithm(letter, -key))
                    .collect(Collectors.joining());
        }
        return "";
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
     * Method to verify if the message is null or is empty.
     *
     * @param message Message to verify.
     * @return boolean ,return true if is not valid message, return false if is valid message.
     */
    public boolean isInvalidMessage(String message) {
        return message == null || message.trim().isEmpty();
    }

    /**
     * Method to get letter already encode/decode with vigenere algorithm.
     *
     * @param letter         This is a letter to encode/decode.
     * @param key            This is a key with string value.
     * @param encodeOrDecode True if is Encode and False if is Decode process.
     * @return String , string already encode with Vigenere Encryption.
     */
    public String getLetterWithVigenereEncryption(String letter, String key, boolean encodeOrDecode) {
        String result;
        int converIndex = encodeOrDecode ? 1 : -1;
        if (indexVigenereKey < key.length()) {
            result = this.algorithm(letter, converIndex * this.getVigenereKey(key.charAt(indexVigenereKey)));
            indexVigenereKey++;
        } else {
            indexVigenereKey = 0;
            result = this.algorithm(letter, converIndex * this.getVigenereKey(key.charAt(indexVigenereKey)));
            indexVigenereKey++;
        }
        return result;
    }

    /**
     * Method to verify if a letter exist on alphabet.
     *
     * @param letter This is a letter to encode/decode.
     * @return boolean , True if is on alphabet, False if is not on alphabet.
     */

    public boolean isValidCharacter(String letter) {
        int currentlyAscii = letter.charAt(0);
        return currentlyAscii >= FIRST_LETTER && currentlyAscii <= LAST_LETTER;
    }

    /**
     * Method to encode or decode a letter.
     *
     * @param letter letter to encode or decode.
     * @param key    key to encode or decode.
     * @return char, letter already encode or decode.
     */
    public String algorithm(String letter, int key) {
        char finalAscii = (char) this.getAsciiIndex(letter.charAt(0) + key);
        return this.isValidCharacter(letter)
                ? String.valueOf(finalAscii)
                : letter;
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

    /**
     * Method to get ascii index.
     *
     * @param ascii ascii integer value.
     * @return Integer, index of new ascii.
     */
    private int getAsciiIndex(int ascii) {
        if (ascii > LAST_LETTER) {
            return ascii - DIFFERENCE;
        } else if (ascii < FIRST_LETTER) {
            return ascii + DIFFERENCE;
        } else {
            return ascii;
        }
    }
}

