package org.fundacionjala.coding.christian;

/**
 * Powered by Christian.
 */
public abstract class CesarCipher {
    /**
     *
     */
    static final int ALPHABET = 26;

    /**
     * @param message string.
     * @param key int.
     * @return message decoded.
     */
    public abstract String decode(String message, int key);

    /**
     * @param message String.
     * @param key int.
     * @return message encoded.
     */
    public abstract String encode(String message, int key);




}
