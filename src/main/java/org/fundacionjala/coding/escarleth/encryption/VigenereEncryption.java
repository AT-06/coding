package org.fundacionjala.coding.escarleth.encryption;

/**
 * VigenereEncryption is a class that contains methods to encode,decode.
 */
public class VigenereEncryption extends Encryption {
    private static final int VALUE_REST = 64;

    /**
     * {@inheritDoc}
     */
    @Override
    public String encode(String cadToEncode, Object key) {
        if (!isInvalidWord(cadToEncode)) {
            StringBuilder cad = new StringBuilder();
            int cont = 0;
            for (int i = 0; i < cadToEncode.length(); i++) {
                char character = cadToEncode.charAt(i);
                if (cont == String.valueOf(key).length()) {
                    cont = 0;
                }
                if (existInAlphabet(character)) {
                    cad.append(getLetterEncode(character, String.valueOf(key).charAt(cont) - VALUE_REST));
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
     * {@inheritDoc}
     */
    @Override
    public String decode(String cadToEncode, Object key) {
        if (!isInvalidWord(cadToEncode)) {
            StringBuilder cad = new StringBuilder();
            int cont = 0;
            for (int i = 0; i < cadToEncode.length(); i++) {
                char character = cadToEncode.charAt(i);
                if (cont == String.valueOf(key).length()) {
                    cont = 0;
                }
                if (existInAlphabet(character)) {
                    cad.append(getLetterDecode(character, -(String.valueOf(key).charAt(cont) - VALUE_REST)));
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
