/*
 * @(#)Abbreviator.java
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

/**
 * The word i18n is a common abbreviation of internationalization in the developer community,
 * used instead of typing the whole word and trying to spell it correctly.
 * Similarly, a11y is an abbreviation of accessibility.
 * Write a function that takes a string and turns any and all "words"
 * (see below) within that string of length 4 or greater into an abbreviation,
 * following these rules:
 * A "word" is a sequence of alphabetical characters. By this definition,
 * any other character like a space or hyphen (eg. "elephant-ride")
 * will split up a series of letters into two words (eg. "elephant" and "ride").
 * The abbreviated version of the word should have the first letter,
 * then the number of removed characters, then the last letter
 * (eg. "elephant ride" => "e6t r2e").
 * Example
 * abbreviate("elephant-rides are really fun!")
 * //          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
 * // words (^):   "elephant" "rides" "are" "really" "fun"
 * //                123456     123     1     1234     1
 * // ignore short words:               X              X
 * // abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
 * // all non-word characters (*) remain in place
 * //                     "-"      " "    " "     " "     "!"
 * === "e6t-r3s are r4y fun!"
 *
 * @author Omar Limbert Huanca Sanchez - AT-[06].
 * @version 1.0.
 */
public class Abbreviator {

    /**
     * Method to abbreviate.
     *
     * @param string input word.
     * @return String, output time in readable format.
     */
    public String abbreviate(String string) {

        String[] words = string.split("[^a-zA-Z]");
        final int limit = 3;
        for (String word : words) {

            if (word.length() > limit) {
                StringBuilder builder = new StringBuilder();
                int count = word.length() - 2;
                builder.append(word.charAt(0));
                builder.append(count);
                builder.append(word.charAt(word.length() - 1));
                string = string.replaceFirst(word, builder.toString());
            }
        }
        return string;
    }
}
