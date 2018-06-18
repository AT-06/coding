package org.fundacionjala.coding.escarleth.finalKata;

/**
 * CifradoCesar is a class that contains methods to encode,decode.
 */
public class CesarEncryption extends Encryption {

    /**
     * @param cadToEncode word to encode.
     * @param key         the position to encode the letters.
     * @return aEncodeWord
     */
    public String encode(String cadToEncode, int key) {
        if (!isInvalidWord(cadToEncode)) {
            StringBuilder cad = new StringBuilder();
            for (int i = 0; i < cadToEncode.length(); i++) {
                char character = cadToEncode.charAt(i);
                cad.append(existInAlphabet(character) ? getLetterEncode(character, key) : character);
            }
            return cad.toString();
        }
        return "";

    }

    /**
     * @param cadToDecode word to decode.
     * @param key         the position to decode the letters.
     * @return aDecodeWord
     */
    public String decode(String cadToDecode, int key) {
        if (!isInvalidWord(cadToDecode)) {
            StringBuilder cad = new StringBuilder();
            for (int i = 0; i < cadToDecode.length(); i++) {
                char character = cadToDecode.charAt(i);
                cad.append(existInAlphabet(character) ? getLetterDecode(character, key) : character);
            }
            return cad.toString();
        }
        return "";
    }

}


