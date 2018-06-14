package org.fundacionjala.coding.maria;


/**
 * kata cifrado cesar.
 */
public class CifradoCesar {
    private static final int A_POSITION = 64;
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
            char aux = letters[i].charAt(0);
            newSentence[i] = (char) getPosition((int) aux, key);
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
        if (sentence == null || sentence.length() == 0) {
            return "";
        }
        return encode(sentence, -key);
    }

    /**
     * Method vigenere to use a key word.
     * @param clave String.
     * @param menssaje String.
     * @return a new string.
     */
    public String vigenere(String clave, String menssaje) {
        String[] lettersMessaje = menssaje.split("");
        char[] newMessaje = new char[menssaje.length()];

        String[] lettersClave = clave.split("");
        int[] positionClave = new int[lettersClave.length];
        for (int i = 0; i < lettersClave.length; i++) {
            positionClave[i] = (int) lettersClave[i].charAt(0);
        }
        int j = 0;
        for (int i = 0; i < lettersMessaje.length; i++) {
            char ascii = lettersMessaje[i].charAt(0);
            j = j >=  clave.length() ? 0 : j;
            newMessaje[i] = (char) getPosition((int) ascii, positionClave[j] - A_POSITION);
            if ((int) ascii  > A_POSITION && (int) ascii <= Z_POSITION) {
                j++;
            }
        }
        return String.valueOf(newMessaje);
    }

    /**
     * Method getPosition to get the new ascii position.
     * @param pos int position.
     * @param key int key.
     * @return a new int.
     */
    public int getPosition(int pos, int key) {
        if (pos > A_POSITION && pos <= Z_POSITION) {
            pos += key;
            pos = pos > Z_POSITION ? pos - ABC_SIZE : pos;
            pos = pos < A_POSITION + 1 ? pos + ABC_SIZE : pos;
        }
        return pos;
    }
}
