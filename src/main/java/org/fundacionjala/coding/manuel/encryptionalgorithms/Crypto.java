package org.fundacionjala.coding.manuel.encryptionalgorithms;

/**
 * Class to encrypt texts.
 */
public abstract class Crypto {

    private static final char ASCII_LOWER = 'A';
    private static final char ASCII_UPPER = 'Z';

    /**
     * Abstract method to encode text.
     * @param objects to encode, can be a String and a int or two Strings.
     * @return the text encrypted.
     */
    public abstract String encode(Object... objects);

    /**
     * Abstract method to decode text.
     * @param objects to decode, can be a String and a int or two Strings.
     * @return the text decoded.
     */
    public abstract String decode(Object... objects);

    /**
     * Method to determine how many movements for letters.
     * @param letter to move right or left.
     * @param key the number of movements.
     * @return the letter moved.
     */
    public int determineNumberMovements(char letter, int key) {
        if (letter + key > ASCII_UPPER) {
            return (letter + key - ASCII_UPPER) + (ASCII_LOWER - 1);
        }
        if (letter + key < ASCII_LOWER) {
            return ASCII_UPPER + 1 - (ASCII_LOWER - (letter + key));
        }
        return letter + key;
    }
}
