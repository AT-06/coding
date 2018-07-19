package org.fundacionjala.coding.escarleth.encryption;

/**
 * CifradoCesar is a class that contains methods to encode,decode.
 */
public class CesarEncryption extends Encryption {

    /**
     * {@inheritDoc}
     */
    @Override
    public String encode(String cadToEncode, Object key) {
        if (!isInvalidWord(cadToEncode)) {
            StringBuilder cad = new StringBuilder();
            for (int i = 0; i < cadToEncode.length(); i++) {
                char character = cadToEncode.charAt(i);
                cad.append(existInAlphabet(character) ? getLetterEncode(character, (int) (key)) : character);
            }
            return cad.toString();
        }
        return "";

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String decode(String cadToDecode, Object key) {
        if (!isInvalidWord(cadToDecode)) {
            StringBuilder cad = new StringBuilder();
            for (int i = 0; i < cadToDecode.length(); i++) {
                char character = cadToDecode.charAt(i);
                cad.append(existInAlphabet(character) ? getLetterDecode(character, (int) key) : character);
            }
            return cad.toString();
        }
        return "";
    }

}


