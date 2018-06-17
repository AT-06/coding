package org.fundacionjala.coding.ariel;

/**
 * Class Cesar_Vigenere_Encryption.
 */
public class CesarVigenereEncryption {
    private String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Class return a message encoded or decoded.
     *
     * @param text text before to encode or decode.
     * @param key  the position in order to encode or decode the message.
     * @return a message encoded or decoded.
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
     * This method encode vigenere a text.
     *
     * @param keyWord conditon in order to encode the text.
     * @param text    Any Text.
     * @return encode vigenere a text.
     */
    public String encodeVigenere(String keyWord, String text) {
        if (null == text || text.isEmpty()) {
            return "";
        }
        int i = 0;
        StringBuilder messageVigenere = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            if (alfabet.contains(c)) {
                messageVigenere.append(changeChar(c, alfabet.indexOf(keyWord.charAt(i) + 1)));
                i++;
            } else {
                messageVigenere.append(c);
            }
            if (i >= keyWord.length()) {
                i = 0;
            }
        }
        return messageVigenere.toString();
    }

    /**
     * This method decode a vigenere message a text.
     *
     * @param keyWord conditon in order to decode the text.
     * @param text    Any Text.
     * @return decode a text.
     */
    public String decodeVigenere(String keyWord, String text) {
        if (null == text || text.isEmpty()) {
            return "";
        }
        int i = 0;
        StringBuilder messageVigenere = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            if (alfabet.contains(c)) {
                messageVigenere.append(changeChar(c, -(alfabet.indexOf(keyWord.charAt(i) + 1))));
                i++;
            } else {
                messageVigenere.append(c);
            }
            if (i >= keyWord.length()) {
                i = 0;
            }
        }
        return messageVigenere.toString();
    }

    /**
     * @param letter a letter.
     * @param key    the position in order to encode or decode the message.
     * @return a char changed.
     */
    private char changeChar(String letter, int key) {
        int range = alfabet.indexOf(letter) + key;
        int encodePosition = alfabet.length() - alfabet.indexOf(letter);
        int decodePosition = alfabet.length() + alfabet.indexOf(letter);
        if (key > 0) {
            return range >= alfabet.length() ? alfabet.charAt(key - encodePosition) : alfabet.charAt(range);
        }
        return range < 0 ? alfabet.charAt(key + decodePosition) : alfabet.charAt(range);
    }
}
