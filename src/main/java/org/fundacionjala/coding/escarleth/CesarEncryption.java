package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth Ledezma Q.
 * CifradoCesar is a class that contains methods to encode,decode,vigenere encripton.
 */
public class CesarEncryption {
    private static final int ALPHABET_LENGTH = 26;

    /**
     * @param cadToEncode word to encode.
     * @param key         the position to encode the letters.
     * @return aEncodeWord
     */
    public String encode(String cadToEncode, int key) {
        if (cadToEncode == null || cadToEncode.isEmpty()) {
            return "";
        }
        StringBuilder cad = new StringBuilder();
        key = key % ALPHABET_LENGTH;
        for (int i = 0; i < cadToEncode.length(); i++) {
            char character = Character.toUpperCase(cadToEncode.charAt(i));
            cad.append(existInAlphabet(character) ? getLetterEncode(character, key) : character);
        }
        return cad.toString();

    }

    /**
     * @param letter letter to encode
     * @param key    the position to encode the letter
     * @return aEncodeLetter
     */
    public char getLetterEncode(char letter, int key) {
        return (letter + key) > 'Z' ? (char) (letter + key - ALPHABET_LENGTH) : (char) (letter + key);

    }

    /**
     * @param letter letter to verify if exist in alphabet.
     * @return boolean exists in alphabet.
     */
    public boolean existInAlphabet(char letter) {
        return letter >= 'A' && letter <= 'Z';
    }

}


