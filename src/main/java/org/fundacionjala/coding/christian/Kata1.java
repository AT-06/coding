package org.fundacionjala.coding.christian;

import java.util.StringJoiner;

/**
 * Powered by Christian.
 */

public class Kata1 {

    public static final int LIMIT = 5;

    /**
     * @param words this is words for Spin Words.
     * @return result.
     */
    public String spinWords(String words) {

        StringJoiner join = new StringJoiner(" ");
        for (String c : words.split(" ")) {
            join = c.length() >= LIMIT ? join.add(new StringBuilder(c).reverse()) : join.add(c);
        }

        return join.toString();

    }
}
