package org.fundacionjala.coding.maria;


/**
 * kata cifrado cesar.
 */
public class CifradoCesar {
    private static final char A_POSITION = 'A';
    private static final char Z_POSITION = 'Z';
    private static final int ABC_SIZE = 26;
    /**
     * method encode to encode a string using a key.
     * @param sentence string.
     * @param key number.
     * @return the encode string.
     */
    public String encode(String sentence, int key) {
        if (sentence == null || sentence.length() == 0) {
            return "";
        }
        String[] letters = sentence.split("");
        char[] newSentence = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            newSentence[i] = (char) getPosition((int) letters[i].charAt(0), key);
        }
        return String.valueOf(newSentence);
    }

    /**
     * Method decode to decode an encode sentence.
     * @param sentence String.
     * @param key int.
     * @return a new String decode.
     */
    public String decode(String sentence, int key) {
        return encode(sentence, -key);
    }
    /**
     * Method vigenere to use a key word.
     * @param key String.
     * @param message String.
     * @return a new string.
     */
    public String vigenereEncode(String key, String message) {
        return vigenereType(key, message, 1);
    }

    /**
     * Method vigenere to use a key word.
     * @param clave String.
     * @param message String.
     * @return a new string.
     */
    public String vigenereDecode(String clave, String message) {
        return vigenereType(clave, message, -1);
    }
    /**
     * Method vigenereType to send if is encode or decode to vigenere encoder.
     * @param key String.
     * @param message String.
     * @param type represent encode or decode vigenere.
     * @return a new string.
     */
    public String vigenereType(String key, String message, int type) {
        if (message == null || message.length() == 0) {
            return "";
        }
        int[] positionsKey = getArrayPositions(key);
        String[] lettersMessage = message.split("");
        return String.valueOf(vigenereEncoder(lettersMessage, positionsKey, message.length(), key.length(), type));

    }
    /**
     * Method vigenere to use a key word.
     * @param message message array.
     * @param key array with positions key.
     * @param messageLength messageLength.
     * @param keyLength key length.
     * @param type int positive or negative.
     * @return a char array with the new message.
     */

    public char[] vigenereEncoder(String[] message, int[] key, int messageLength, int keyLength, int type) {
        char[] newMessage = new char[messageLength];
        int keyPosition = 0;
        for (int i = 0; i < message.length; i++) {
            char ascii = message[i].charAt(0);
            newMessage[i] = (char) getPosition((int) ascii, (key[keyPosition] - A_POSITION + 1) * type);
            keyPosition = addKeyPosition(keyPosition, ascii);
            keyPosition = keyLength <= keyPosition ? 0 : keyPosition;
        }
        return newMessage;
    }

    /**
     * Method getArrayPositions get the positions of elements of key word.
     * @param text String.
     * @return array of int with the positions.
     */
    public int[] getArrayPositions(String text) {
        String[] lettersKey = text.split("");
        int[] positionsKey = new int[lettersKey.length];
        for (int i = 0; i < lettersKey.length; i++) {
            positionsKey[i] = (int) lettersKey[i].charAt(0);
        }
        return positionsKey;
    }

    /**
     * method addKeyPosition to get the new position of array key.
     * @param actual position.
     * @param ascii letter.
     * @return the actual position.
     */
    public int addKeyPosition(int actual, char ascii) {
        if (ascii  >= A_POSITION && ascii <= Z_POSITION) {
            actual++;
        }
        return actual;
    }

    /**
     * Method getPosition to get the new ascii position.
     * @param pos int position.
     * @param key int key.
     * @return a new int.
     */
    public int getPosition(int pos, int key) {
        if (pos >= A_POSITION && pos <= Z_POSITION) {
            pos += key;
            pos = pos > Z_POSITION ? pos - ABC_SIZE : pos;
            pos = pos < A_POSITION ? pos + ABC_SIZE : pos;
        }
        return pos;
    }
}
