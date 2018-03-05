package org.fundacionjala.coding.escarleth;

import java.util.HashMap;
import java.util.Map;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata5 is a class that contains a complementaryDNA method
 */

public class Kata5 {
    private static final char T = 'T';
    private static final char A = 'A';
    private static final char C = 'C';
    private static final char G = 'G';

    /**
     * @param oneComplementary is a String that will find a ComplementaryDNA
     *                         (In DNA strings, symbols "A" and "T"
     *                         are complements of each other, as "C" and "G")
     * @return result
     */
    public String complementaryDNA(String oneComplementary) {
        StringBuilder complementary = new StringBuilder();
        Map<Character, Character> dnaStructure = new HashMap<>();
        dnaStructure.put(T, A);
        dnaStructure.put(A, T);
        dnaStructure.put(C, G);
        dnaStructure.put(G, C);
        for (int i = 0; i < oneComplementary.length(); i++) {
            complementary.append(dnaStructure.get(oneComplementary.charAt(i)));
        }
        return complementary.toString();
    }
}

