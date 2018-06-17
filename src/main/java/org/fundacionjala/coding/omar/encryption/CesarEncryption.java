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
package org.fundacionjala.coding.omar.encryption;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class CesarEncryption extends Encryption {

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
                    .map(letter -> this.getLetterWithAlgorithm(letter, key))
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
                    .map(letter -> this.getLetterWithAlgorithm(letter, -key))
                    .collect(Collectors.joining());
        }
        return "";
    }
}

