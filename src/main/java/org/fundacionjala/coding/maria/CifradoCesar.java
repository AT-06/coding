package org.fundacionjala.coding.maria;


/**
 * kata cifrado cesar.
 */
public class CifradoCesar {
    private static final int A_POSITION = 65;
    private static final int Z_POSITION = 90;
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
     * @param clave String.
     * @param menssaje String.
     * @return a new string.
     */
    public String vigenere(String clave, String menssaje) {
        int[] positionClave = getArrayPositions(clave);
        int keyPosition = 0;
        String[] lettersMessaje = menssaje.split("");
        char[] newMessaje = new char[menssaje.length()];

        for (int i = 0; i < lettersMessaje.length; i++) {
            char ascii = lettersMessaje[i].charAt(0);
            newMessaje[i] = (char) getPosition((int) ascii, positionClave[keyPosition] - A_POSITION + 1);
            keyPosition = addKeyPosition(keyPosition, ascii);
            keyPosition = (clave.length() <= keyPosition) ? 0 : keyPosition;
        }
        return String.valueOf(newMessaje);
    }

    /**
     * Method getArrayPositions get the positions of elements of key word.
     * @param text String.
     * @return array of int with the positions.
     */
    public int[] getArrayPositions(String text) {
        String[] lettersClave = text.split("");
        int[] positionClave = new int[lettersClave.length];
        for (int i = 0; i < lettersClave.length; i++) {
            positionClave[i] = (int) lettersClave[i].charAt(0);
        }
        return positionClave;
    }

    /**
     * method addKeyPosition to get the new position of array clave.
     * @param actual position.
     * @param ascii letter.
     * @return the actual position.
     */
    public int addKeyPosition(int actual, char ascii) {
        if ((int) ascii  >= A_POSITION && (int) ascii <= Z_POSITION) {
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
