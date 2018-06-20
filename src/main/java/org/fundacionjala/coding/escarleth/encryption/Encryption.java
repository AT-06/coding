package org.fundacionjala.coding.escarleth.encryption;

/**
 * Encryption is a class that contains methods to return encode,decode letter and validators.
 */
public abstract class Encryption {
    protected static final int ALPHABET_LENGTH = 26;

    /**
     * Method to encode Message with Encryption.
     *
     * @param message This is message to encode.
     * @param key     This is key for encode.
     * @return String , string already encode.
     */
    public abstract String encode(String message, Object key);

    /**
     * Method to decode Message with Encryption.
     *
     * @param message This is message to decode.
     * @param key     This is key for decode.
     * @return String , string already decode.
     */
    public abstract String decode(String message, Object key);

    /**
     * @param letter letter to encode
     * @param key    the position to encode the letter
     * @return aEncodeLetter
     */
    public char getLetterEncode(char letter, int key) {
        key = key % ALPHABET_LENGTH;
        return (letter + key) > 'Z' ? (char) (letter + key - ALPHABET_LENGTH) : (char) (letter + key);

    }

    /**
     * @param letter letter to encode
     * @param key    the position to encode the letter
     * @return aEncodeLetter
     */
    public char getLetterDecode(char letter, int key) {
        key = key % ALPHABET_LENGTH;
        return (letter + key) < 'A' ? (char) (letter + key + ALPHABET_LENGTH) : (char) (letter + key);

    }

    /**
     * @param letter letter to verify if exist in alphabet.
     * @return boolean exists in alphabet.
     */
    public boolean existInAlphabet(char letter) {
        return letter >= 'A' && letter <= 'Z';
    }

    /**
     * @param word word to verify if is a invalid word.
     * @return boolean is null or empty.
     */
    public boolean isInvalidWord(String word) {
        return word == null || word.isEmpty();
    }

}

