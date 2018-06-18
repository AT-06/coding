package org.fundacionjala.coding.ariel.CesarVigenereEncryption;

/**
 * Cesar Encryption Class.
 */
public class CesarEncryption extends Encryption {
    private StringBuilder message;
    private int key;

    /**
     * @param text        any text.
     * @param keyPosition the key in order to encode  the message.
     * @return a text encoded.
     */
    @Override
    public String encodeMessage(String text, String keyPosition) {
        key = Integer.parseInt(keyPosition);
        if (checkNullEmpty(text)) {
            return "";
        }
        message = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            message = alfabet.contains(c) ? message.append(encodeChar(c, key)) : message.append(c);
        }
        return message.toString();
    }

    /**
     * @param text        any text.
     * @param keyPosition the key in order to encode  the message.
     * @return a text encoded.
     */
    @Override
    public String decodeMessage(String text, String keyPosition) {
        key = Integer.parseInt(keyPosition);
        if (checkNullEmpty(text)) {
            return "";
        }
        message = new StringBuilder();
        String[] texts = text.split("");
        for (String c : texts) {
            message = alfabet.contains(c) ? message.append(decodeChar(c, key)) : message.append(c);
        }
        return message.toString();
    }
}
