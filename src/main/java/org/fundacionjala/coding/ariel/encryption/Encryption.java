package org.fundacionjala.coding.ariel.encryption;

/**
 * Encryption class.
 */
public abstract class Encryption {

    protected String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * @param text any text.
     * @param key  the key in order to encode  the message.
     * @return a text encoded.
     */
    public abstract String encodeMessage(String text, String key);

    /**
     * @param text any text.
     * @param key  the key in order to decode  the message.
     * @return a text decoded.
     */
    public abstract String decodeMessage(String text, String key);

    /**
     * @param letter any letter.
     * @param key    the position in order to encode the message.
     * @return a char changed.
     */
    public char encodeChar(String letter, int key) {
        int range = alfabet.indexOf(letter) + key;
        int encodePosition = alfabet.length() - alfabet.indexOf(letter);
        return range >= alfabet.length() ? alfabet.charAt(key - encodePosition) : alfabet.charAt(range);
    }

    /**
     * @param letter any letter.
     * @param key    the position in order to decode the message.
     * @return a char changed.
     */
    public char decodeChar(String letter, int key) {
        int range = alfabet.indexOf(letter) + key;
        int decodePosition = alfabet.length() + alfabet.indexOf(letter);
        return range < 0 ? alfabet.charAt(key + decodePosition) : alfabet.charAt(range);
    }

    /**
     * @param text any text.
     * @return true if it is ane empty or null input.
     */
    public boolean checkNullEmpty(String text) {
        return null == text || text.isEmpty();
    }
}
