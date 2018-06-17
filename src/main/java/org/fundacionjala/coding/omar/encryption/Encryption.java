/*
 * @(#)Encryption.java
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

/**
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public abstract class Encryption {

    protected static final char LAST_LETTER = 'Z';
    protected static final char FIRST_LETTER = 'A';
    protected static final int DIFFERENCE = 26;

    /**
     * Method to encode Message with Vigenere Encryption.
     *
     * @param message This is message to encode.
     * @param key     This is key for encode.
     * @return String , string already encode with Cesar Encryption.
     */
    public abstract String encodeMessage(String message, String key);
    /**
     * Method to decode Message with Vigenere Encryption.
     *
     * @param message This is message to decode.
     * @param key     This is key for decode.
     * @return String , string already decode with Cesar Encryption.
     */
    public abstract String decodeMessage(String message, String key);

    /**
     * Method to encode Message with Cesar Encryption.
     *
     * @param message This is message to encode.
     * @param key     This is key for encode.
     * @return String , string already encode with Cesar Encryption.
     */
    public abstract String encodeMessage(String message, int key);
    /**
     * Method to decode Message with Cesar Encryption.
     *
     * @param message This is message to decode.
     * @param key     This is key for decode.
     * @return String , string already decode with Cesar Encryption.
     */
    public abstract String decodeMessage(String message, int key);

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
     * Method to verify if the message is null or is empty.
     *
     * @param message Message to verify.
     * @return boolean ,return true if is not valid message, return false if is valid message.
     */
    public boolean isInvalidMessage(String message) {
        return message == null || message.trim().isEmpty();
    }

    /**
     * Method to encode or decode a letter.
     *
     * @param letter letter to encode or decode.
     * @param key    key to encode or decode.
     * @return char, letter already encode or decode.
     */
    public String getLetterWithAlgorithm(String letter, int key) {
        char finalAscii = (char) this.getAsciiIndex(letter.charAt(0) + key);
        return this.isValidCharacter(letter)
                ? String.valueOf(finalAscii)
                : letter;
    }

    /**
     * Method to get ascii index.
     *
     * @param ascii ascii integer value.
     * @return Integer, index of new ascii.
     */
    public int getAsciiIndex(int ascii) {
        if (ascii > LAST_LETTER) {
            return ascii - DIFFERENCE;
        } else if (ascii < FIRST_LETTER) {
            return ascii + DIFFERENCE;
        } else {
            return ascii;
        }
    }

}
