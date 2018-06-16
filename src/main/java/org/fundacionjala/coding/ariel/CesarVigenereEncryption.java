package org.fundacionjala.coding.ariel;

/**
 * Class Cesar_Vigenere_Encryption.
 */
public class CesarVigenereEncryption {
    private String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Class return a message encoded.
     *
     * @param text text before to encode.
     * @param key  the popsition in order to encode the message.
     * @return a message encoded.
     */
    public String encodeAndDecodeMessage(String text, int key) {
        if (null == text || text.isEmpty()) {
            return "";
        }
        StringBuilder message = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            message = alfabet.contains(c) ? message.append(changeChar(c, key)) : message.append(c);
        }
        return message.toString();
    }

    /**
     * @param letter a letter.
     * @param key    the popsition in order to encode the message.
     * @return a char changed.
     */
    public char changeChar(String letter, int key) {
        int range = alfabet.indexOf(letter) + key;
        int encodePosition = alfabet.length() - alfabet.indexOf(letter);
        int decodePosition = alfabet.length() + alfabet.indexOf(letter);
        if (key > 0) {
            return range >= alfabet.length() ? alfabet.charAt(key - encodePosition) : alfabet.charAt(range);
        }
        return range < 0 ? alfabet.charAt(key + decodePosition) : alfabet.charAt(range);
    }
}
