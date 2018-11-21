package org.fundacionjala.coding.maria;

import java.util.ArrayList;
import java.util.Collections;

/**
 *Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order.
 * of the strings of a1 which are substrings of strings of a2.
 #Example 1: a1 = ["arp", "live", "strong"].
 a2 = ["lively", "alive", "harp", "sharp", "armstrong"].
 returns ["arp", "live", "strong"].
 #Example 2: a1 = ["tarp", "mice", "bull"].
 a2 = ["lively", "alive", "harp", "sharp", "armstrong"].
 returns [].
 */
public class WhichAreIn {
    /**
     * inArray verify if the string contains elements of another string.
     * @param array1 strings
     * @param array2 strings
     * @return array of strings
     */
    public String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    result.add(array1[i]);
                    break;
                }
            }
        }
        Collections.sort(result);
        return result.toArray(new String[result.size()]);
    }
}
