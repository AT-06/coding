package org.fundacionjala.coding.escarleth;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java)
 * for strings. All words must have their first letter capitalized without spaces.
 * camelCase("hello case"); // => "HelloCase"
 * camelCase("camel case word"); // => "CamelCaseWord"
 */
public class CamelCaseMethod {
    private static final int ONE = 1;

    /**
     * @param words this word contains empty,one or more words.
     * @return CamelCase Word.
     */
    public String camelCase(String words) {

        return !words.isEmpty() ? Arrays.stream(words.split(" "))
                .map(word -> word.length() > ONE ? word.substring(0, ONE).toUpperCase()
                        .concat(word.substring(ONE)) : word.toUpperCase())
                .collect(Collectors.joining()) : words;
    }
}


