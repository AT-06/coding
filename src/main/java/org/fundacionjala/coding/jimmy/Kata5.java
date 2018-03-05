package org.fundacionjala.coding.jimmy;

import java.util.Arrays;
import java.util.stream.Collectors;

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
        return Arrays.stream(dnaString.split(""))
                .map(dnaChain -> dnaChain.replace("A", "Y")
                        .replace("C", "Z")
                        .replace("T", "A")
                        .replace("G", "C")
                        .replace("Y", "T")
                        .replace("Z", "G"))
                .collect(Collectors.joining());
    }
}
