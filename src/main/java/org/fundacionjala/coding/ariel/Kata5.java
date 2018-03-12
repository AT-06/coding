package org.fundacionjala.coding.ariel;

/**
 * Kata5.
 * by Ariel Gonzales Vargas.
 */
public class Kata5 {
    /**
     * @param text Any text Type String.
     * @return A text changed (A <=> T and C<=>G).
     */
    public String makeComplement(String text) {


        return text.replace('A', '0')
                .replace('T', 'A')
                .replace('0', 'T')
                .replace('C', '0')
                .replace('G', 'C')
                .replace('0', 'G');
    }
}
