package org.fundacionjala.coding.daniel.cipher;

/**
 * Class for encode/decode messages.
 */
public abstract class Cipher {
    static final int NUMBER_LETTERS = 26;
    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String SPECIAL_CHARS = " <([{\\^-=$!|]})?*+.>";

    /**
     * Method that encodes a text using encryption.
     *
     * @param text the text for encode.
     * @return the message encoded.
     */
    public abstract String encode(String text);

    /**
     * Method that decodes a text.
     *
     * @param message the message for decode.
     * @return the message decoded.
     */
    public abstract String decode(String message);
}
