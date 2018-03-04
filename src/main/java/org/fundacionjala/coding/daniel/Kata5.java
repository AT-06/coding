package org.fundacionjala.coding.daniel;

/**
 * A class that contains 'makeComplement' method.
 */
public class Kata5 {
    /**
     * @param dna A string that represents a DNA strand.
     *            In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
     * @return A string with the other complementary side.
     */
    public String makeComplement(String dna) {
        return dna.replace("A", "B")
            .replace("C", "D")
            .replace("T", "A")
            .replace("G", "C")
            .replace("B", "T")
            .replace("D", "G");
    }
}
