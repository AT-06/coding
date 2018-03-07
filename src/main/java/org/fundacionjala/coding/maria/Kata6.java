package org.fundacionjala.coding.maria;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Kata 6.
 */
public class Kata6 {
    private static final int SEVEN = 7;
    private static final int THIRD = 3;

    /**
     * @param arrayNum integer array
     * @return integer array sorted and changed
     */
    public Integer[] sortTwisted(Integer[] arrayNum) {
        Map<Integer, Integer> content = new HashMap<>();
        content.put(THIRD, SEVEN);
        content.put(SEVEN, THIRD);

        Integer[] arrayNumClone = arrayNum.clone();
        Arrays.sort(arrayNumClone);

        for (int i = 0; i < arrayNumClone.length; i++) {
            if (content.containsKey(arrayNumClone[i])) {
                arrayNumClone[i] = content.get(arrayNumClone[i]);
            }
        }
        return arrayNumClone;
    }

}
