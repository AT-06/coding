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
        String[] arr = words.split(" ");
        for (String c : arr) {

            if (c.length() >= LIMIT) {
                join.add(new StringBuilder(c).reverse());

            } else {
                join.add(c);
            }
        }

        System.out.println(join);
        return join.toString();

    }
}
