package org.fundacionjala.coding.maria.cifrado;


/**
 * kata cifrado cesar.
 */
public class CifradoCesar extends Cifrado {
    /**
     * method encode to encode a string using a key.
     * @param sentence string.
     * @param key number.
     * @return the encode string.
     */
    @Override
    public String encode(String sentence, Object key) {
        if (sentence == null || sentence.length() == 0) {
            return "";
        }
        String[] letters = sentence.split("");
        char[] newSentence = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            newSentence[i] = (char) getPosition((int) letters[i].charAt(0), (int) key);
        }
        return String.valueOf(newSentence);
    }



    /**
     * Method decode to decode an encode sentence.
     * @param sentence String.
     * @param key int.
     * @return a new String decode.
     */
    @Override
    public String decode(String sentence, Object key) {
        return encode(sentence, (int) key * -1);
    }


}
