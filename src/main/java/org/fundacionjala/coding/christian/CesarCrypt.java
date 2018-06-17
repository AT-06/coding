package org.fundacionjala.coding.christian;

import static java.lang.Character.isUpperCase;

/**
 * Class CesarCrypt.
 */
public class CesarCrypt {
    private static final char LAST = 'Z';
    private static final char FIRST = 'A';
    private static final int ALPHABET_SIZE = 26;

    /**
     * @param message String.
     * @param rotateBy int.
     * @return new String char.
     */
    public String encode(String message, int rotateBy) {
        if (null == message || message.isEmpty()) {
            return "";
        }
        rotateBy %= ALPHABET_SIZE;
        char[] chars = message.toCharArray();
        rotate(chars, rotateBy);
        return new String(chars);
    }

    /**
     * @param chars char.
     * @param rotateBy int.
     */
    private void rotate(char[] chars, int rotateBy) {
        try {
            for (int i = 0; i < chars.length; ++i) {
                if (isUpperCase(chars[i])) {
                    chars[i] = rotateChar(chars[i], rotateBy, FIRST, LAST);
                }
            }
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    /**
     * @param letter char.
     * @param rotateBy int.
     * @param first char.
     * @param last char.
     * @return char.
     */
    private char rotateChar(char letter, int rotateBy, final char first, char last) {
        letter += rotateBy;
        if (letter < first) {
            return (char) (letter + ALPHABET_SIZE);
        }
        if (letter > last) {
            return (char) (letter - ALPHABET_SIZE);
        }
        return letter;
    }

}
