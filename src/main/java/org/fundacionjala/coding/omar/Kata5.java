package org.fundacionjala.coding.omar;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * This class contains a method with this Kata. In DNA strings, symbols "A" and "T"
 * are complements of each other, as "C" and "G". You have function with one side of the DNA
 * (string, except for Haskell); you need to get the other complementary side. DNA strand
 * is never empty or there is no DNA at all (again, except for Haskell).
 */
public class Kata5 {

    private static final char LETTER_T = 'T';
    private static final char KEEPER = 'K';
    private static final char LETTER_A = 'A';
    private static final char LETTER_C = 'C';
    private static final char LETTER_G = 'G';

    /**
     * @param dna this is adn.
     * @return result
     */
    public String makeComplement(String dna) {

        //for long dna, first I save "T" to "Keeper", and [replace "A" for "T"], finally [replace "Keeper" for "A"]
        //for long dna, first I save "C to "Keeper", and [replace "G" for "C"], finally [replace "Keeper" for "G"]
        return dna.replace(LETTER_T, KEEPER)
                .replace(LETTER_A, LETTER_T)
                .replace(KEEPER, LETTER_A)
                .replace(LETTER_C, KEEPER)
                .replace(LETTER_G, LETTER_C)
                .replace(KEEPER, LETTER_G);


    }
}
