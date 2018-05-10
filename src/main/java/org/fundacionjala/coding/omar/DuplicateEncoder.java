/*
 * @(#)DuplicateEncoder.java
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

/**
 * The goal of this exercise is to convert a string to a new string
 * where each character in the new string is '(' if that character appears
 * only once in the original string, or ')'
 * if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 * <p>
 * Examples:
 * "din" => "((("
 * "recede" => "()()()"
 * "Success" => ")())())"
 * "(( @" => "))(("
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class DuplicateEncoder {

    /**
     * Method to encode a string to new string.
     *
     * @param word .
     * @return String , string already encode.
     */
    public String encode(String word) {

        StringBuilder result = new StringBuilder();
        String lowerWord = word.toLowerCase();
        Arrays.stream(lowerWord.split("")).forEach(character -> {
            boolean single = lowerWord.indexOf(character) == lowerWord.lastIndexOf(character);
            result.append(single ? '(' : ')');
        });

        return result.toString();
    }
}
