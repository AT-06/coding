/*
 * @(#)ReverseWords.java
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
import java.util.Collections;
import java.util.List;

/**
 * Complete the solution so that it reverses all of the words within the string passed in.
 * Example:
 * ReverseWords.reverseWords("The greatest victory is that which requires no battle");
 * // should return "battle no requires which that is victory greatest The"
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class Kata16 {

    public static final String BLANK_SPACE = " ";

    /**
     * @param str, String word.
     * @return result, reversed String word.
     */
    public static String reverseWords(String str) {
        List words = Arrays.asList(str.split(BLANK_SPACE));
        Collections.reverse(words);
        return String.join(BLANK_SPACE, words);
    }
}