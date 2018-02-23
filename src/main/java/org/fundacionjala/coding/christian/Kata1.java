package org.fundacionjala.coding.christian;

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

        StringBuffer buffer = new StringBuffer();
        String[] arr = words.split(" ");
        String space = " ";
        for (String c : arr) {

            if (c.length() >= LIMIT) {
                buffer.append(new StringBuilder(c).reverse());

            } else {
                buffer.append(c);

            }
            buffer.append(space);
        }

        System.out.println(buffer);
        return buffer.toString().trim();

    }
}
