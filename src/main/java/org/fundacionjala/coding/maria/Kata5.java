package org.fundacionjala.coding.maria;


import java.util.HashMap;
import java.util.Map;

/**
 * Kata 5.
 * Complementary DNA
 */
public class Kata5 {
    /**
     * @param dna DNA
     * @return complement to DNA
     */
    public String makeComplement(String dna) { //ATTGC   -> TAACG
        Map<String, String> comp = new HashMap<String, String>();
        comp.put("A", "T");
        comp.put("C", "G");
        comp.put("G", "C");
        comp.put("T", "A");
        StringBuilder complement = new StringBuilder();
        String[] letters = dna.split("");
        for (String letter : letters) {
         complement.append(comp.get(letter));
        }
        return complement.toString();
    }
}
