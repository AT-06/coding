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
     * @param message .
     * @param key     .
     * @return String , string already encodeMessage.
     */
    public String encodeMessage(String message, int key) {
        return message == null || message.trim().isEmpty()
                ? ""
                : Arrays.stream(message.split(""))
                .map(letter -> String.valueOf(algorithm(letter, key, true)))
                .collect(Collectors.joining());
    }

    /**
     * Method to decode Message a string to new string.
     *
     * @param message .
     * @param key     .
     * @return String , string already encodeMessage.
     */
    public String decodeMessage(String message, int key) {
        return message == null || message.trim().isEmpty()
                ? ""
                : Arrays.stream(message.split(""))
                .map(letter -> String.valueOf(algorithm(letter, key * -1, false)))
                .collect(Collectors.joining());
    }

    /**
     * Method to encode or decode a letter.
     *
     * @param letter letter to encode or decode.
     * @param key    key to encode or decode.
     * @param type   is true to encode a letter, false to decode a letter.
     * @return char, letter already encode or decode.
     */
    public char algorithm(String letter, int key, boolean type) {
        int index = letter.charAt(0) + key;
        char result;
        if (type) {
            if (index >= ASCII_MAX) {
                result = (char) (index - DIFFERENCE);
            } else {

                result = (char) (index);
            }
        } else {
            if (index <= ASCII_MIN) {
                result = (char) (index + DIFFERENCE);
            } else {
                result = (char) (index);
            }
        }
        return result;
    }

}

