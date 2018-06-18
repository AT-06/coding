package org.fundacionjala.coding.ariel.CesarVigenereEncryption;

/**
 * Vigenre ENcryption Class.
 */
public class VigenereEncryption extends Encryption {
    private StringBuilder messageVigenere;

    /**
     * @param text    any text.
     * @param keyWord the key in order to encode  the message.
     * @return a text encoded.
     */
    @Override
    public String encodeMessage(String text, String keyWord) {
        if (checkNullEmpty(text)) {
            return "";
        }
        int i = 0;
        messageVigenere = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            if (alfabet.contains(c)) {
                messageVigenere.append(encodeChar(c, alfabet.indexOf(keyWord.charAt(i) + 1)));
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
     * @param text    any text.
     * @param keyWord the key in order to decode  the message.
     * @return a text decoded.
     */
    @Override
    public String decodeMessage(String text, String keyWord) {
        if (checkNullEmpty(text)) {
            return "";
        }
        int i = 0;
        messageVigenere = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            if (alfabet.contains(c)) {
                messageVigenere.append(decodeChar(c, -(alfabet.indexOf(keyWord.charAt(i) + 1))));
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
}
