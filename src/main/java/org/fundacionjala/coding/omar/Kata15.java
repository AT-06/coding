package org.fundacionjala.coding.omar;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 */
public class Kata15 {

    /**
     * @param collection .
     * @return result .
     */
    public int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) {

            return 0;

        }

        Map<Integer, Integer> map = new HashMap<>();


        for (int key : collection) {

            if (map.containsKey(key)) {

                int occurrence = map.get(key);
                occurrence++;

                map.put(key, occurrence);
            } else {
                map.put(key, 1);


            }
        }
        return Collections.max(map.values());
    }
}
