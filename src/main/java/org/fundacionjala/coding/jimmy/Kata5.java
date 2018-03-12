package org.fundacionjala.coding.jimmy;

/**
 * Class for implementing makeComplement method.
 */
public class Kata5 {

    /**
     * This method make the complementary changes for the DNA like be:
     * A : T, T : A, C : G, G : C.
     *
     * @param dnaString is the DNA string entry to be complemented.
     * @return the complementary change.
     */
    public String makeComplement(String dnaString) {
        return dnaString.replaceAll("A", "Y")
                .replaceAll("C", "Z")
                .replaceAll("T", "A")
                .replaceAll("G", "C")
                .replaceAll("Y", "T")
                .replaceAll("Z", "G");
    }
}
