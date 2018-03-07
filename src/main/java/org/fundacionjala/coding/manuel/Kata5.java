package org.fundacionjala.coding.manuel;


import java.util.HashMap;
import java.util.Map;
/**
 * Created by Administrator on 3/5/2018.
 */
public class Kata5 {
    /**
     * makeComplement method.
     * @param s .
     * @return newword .
     */
    public String makeComplement(String s) {
        Map<String, String> complementaries = new HashMap<>();
        complementaries.put("A", "T");
        complementaries.put("T", "A");
        complementaries.put("C", "G");
        complementaries.put("G", "C");
        String[] letters = s.split("");
        StringBuilder newWord = new StringBuilder();
        for (String single : letters) {
            newWord.append(complementaries.containsKey(single) ? complementaries.get(single) : single);
        }
        return newWord.toString();
    }
}

