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
     * @param pos  the popsition in order to encode the message.
     * @return a message encoded.
     */
    public String codeMessage(String text, int pos) {
        if (null == text || text.isEmpty()) {
            return "";
        }
        StringBuilder message = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            if (alfabet.indexOf(c) != -1) {
                message.append(changeChar(c, pos));
            } else {
                message.append(c);
            }
        }
        return message.toString();
    }

    /**
     * @param letter a letter.
     * @param pos    the popsition in order to encode the message.
     * @return a char changed.
     */
    public char changeChar(String letter, int pos) {
        int range = alfabet.indexOf(letter) + pos;
        int position = alfabet.length() - alfabet.indexOf(letter);
        return range >= alfabet.length() ? alfabet.charAt(pos - position) : alfabet.charAt(range);
    }
}
