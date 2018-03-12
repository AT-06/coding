package org.fundacionjala.coding.christian;

import java.util.HashMap;
import java.util.Map;

/**
 * Develop by Christian.
 */
public class Kata5 {

    /**
     * @param dna hi is for makeComplement
     * @return tag for 'dna'
     */
    public String makeComplement(String dna) {


        StringBuilder builder = new StringBuilder();
        Map<String, String> dnaMap = new HashMap<>();
        dnaMap.put("A", "T");
        dnaMap.put("T", "A");
        dnaMap.put("G", "C");
        dnaMap.put("C", "G");
        String[] letters = dna.split("");
        for (String  letter : letters) {
            builder.append(dnaMap.get(letter));
        }
         return builder.toString();
     }


}
