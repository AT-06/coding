package org.fundacionjala.coding.escarleth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata6 is a class that contains a sortTwisted method
 */

public class Kata6 {
    private static final int THREE = 3;
    private static final int SEVEN = 7;

    /**
     * @param arrayToSort is a Array for sorting, the way it would be sorted on Twisted-3-7
     *                    ( Our 3 means 7 on the planet Twisted-3-7. And 7 means 3)
     * @return result
     */

    public Integer[] sortTwisted(Integer[] arrayToSort) {
        Map<Integer, Integer> listTwister = new HashMap<>();
        listTwister.put(THREE, SEVEN);
        listTwister.put(SEVEN, THREE);
        Integer[] arrayCopy = arrayToSort;
        return Arrays.stream(arrayCopy).sorted()
                .map(number -> listTwister.containsKey(number) ? listTwister.get(number) : number)
                .toArray(Integer[]::new);
    }
}
