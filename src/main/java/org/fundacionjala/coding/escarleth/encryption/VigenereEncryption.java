package org.fundacionjala.coding.escarleth.encryption;

/**
 * VigenereEncryption is a class that contains methods to encode,decode.
 */
public class VigenereEncryption extends Encryption {
    private static final int VALUE_REST = 64;

    /**
     * @param cadToEncode word to decode.
     * @param key         the position to decode the letters.
     * @return aDecodeWord
     */
    public String vigenereEncode(String cadToEncode, String key) {
        if (!isInvalidWord(cadToEncode)) {
            StringBuilder cad = new StringBuilder();
            int cont = 0;
            for (int i = 0; i < cadToEncode.length(); i++) {
                char character = cadToEncode.charAt(i);
                if (cont == key.length()) {
                    cont = 0;
                }
                if (existInAlphabet(character)) {
                    cad.append(getLetterEncode(character, key.charAt(cont) - VALUE_REST));
                    cont++;
                } else {
                    cad.append(character);
                }
            }
            return cad.toString();
        }
        return "";
    }

    /**
     * @param cadToEncode word to decode.
     * @param key         the position to decode the letters.
     * @return aDecodeWord
     */
    public String vigenereDecode(String cadToEncode, String key) {
        if (!isInvalidWord(cadToEncode)) {
            StringBuilder cad = new StringBuilder();
            int cont = 0;
            for (int i = 0; i < cadToEncode.length(); i++) {
                char character = cadToEncode.charAt(i);
                if (cont == key.length()) {
                    cont = 0;
                }
                if (existInAlphabet(character)) {
                    cad.append(getLetterDecode(character, -(key.charAt(cont) - VALUE_REST)));
                    cont++;
                } else {
                    cad.append(character);
                }
            }
            return cad.toString();
        }
        return "";
    }
}
