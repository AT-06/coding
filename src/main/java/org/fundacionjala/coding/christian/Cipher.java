package org.fundacionjala.coding.christian;

/**
 * Powered by Christian.
 */
public class Cipher extends CesarCipher {

    /**
     * @param cipherMessage string.
     * @param key int.
     * @return message decoded.
     */
    public String decode(String cipherMessage, int key) {
        String letter;
        if (null == cipherMessage || cipherMessage.isEmpty()) {
            return "";
        }
        letter = encode(cipherMessage, ALPHABET - key);
        return letter;
    }


    /**
     * @param message String.
     * @param key int.
     * @return message encoded.
     */
    public  String encode(String message, int key) {
        key = key % ALPHABET  + ALPHABET;
        StringBuilder encoded = new StringBuilder();
        for (char i : message.toCharArray()) {
            if (Character.isLetter(i)) {
                encoded.append((char) ('A' + (i - 'A' + key) % ALPHABET));
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}
