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

    private static final int ASCII_MAX = 90;
    private static final int ASCII_MIN = 65;
    private static final int DIFFERENCE = 26;

    /**
     * Method to encode Message a string to new string.
     *
     * @param message This is message to encode.
     * @param key     This is key for encode.
     * @return String , string already encode with Cesar Encryption.
     */
    public String encodeMessageWithCesarEncryption(String message, int key) {
        return message == null || message.trim().isEmpty()
                ? ""
                : Arrays.stream(message.split(""))
                .map(letter -> String.valueOf(this.algorithm(letter, key)))
                .collect(Collectors.joining());
    }

    /**
     * Method to decode Message a string to new string.
     *
     * @param message This is message to decode.
     * @param key     This is key for decode.
     * @return String , string already encode with Cesar Encryption.
     */
    public String decodeMessageWithCesarEncryption(String message, int key) {
        return message == null || message.trim().isEmpty()
                ? ""
                : Arrays.stream(message.split(""))
                .map(letter -> String.valueOf(this.algorithm(letter, -key)))
                .collect(Collectors.joining());
    }

    /**
     * Method to encode or decode a letter.
     *
     * @param letter letter to encode or decode.
     * @param key    key to encode or decode.
     * @return char, letter already encode or decode.
     */
    public char algorithm(String letter, int key) {
        int currentlyAscii = letter.charAt(0);
        int finalAscii = this.getAsciiIndex(currentlyAscii + key);

        return currentlyAscii >= ASCII_MIN && currentlyAscii <= ASCII_MAX
                ? (char) finalAscii
                : letter.charAt(0);

    }

    /**
     * Method to get ascii index.
     *
     * @param ascii ascii integer value.
     * @return Integer, index of new ascii.
     */
    private int getAsciiIndex(int ascii) {
        if (ascii > ASCII_MAX) {
            return ascii - DIFFERENCE;
        } else if (ascii < ASCII_MIN) {
            return ascii + DIFFERENCE;
        } else {
            return ascii;
        }
    }
}

