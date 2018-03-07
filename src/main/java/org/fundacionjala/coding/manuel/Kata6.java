package org.fundacionjala.coding.manuel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 3/5/2018.
 */
public class Kata6 {
    private static final int SORT_3 = 3;
    private static final int SORT_7 = 7;

    /**
     * Method to twist sort.
     * @param num .
     * @return sortedTwist .
     */
    public Integer[] sortTwisted37(Integer[] num) {
        Integer[] sortedTwist = num.clone();
        Arrays.sort(sortedTwist);
        Map<Integer, Integer> twist = new HashMap<>();
        twist.put(SORT_3, SORT_7);
        twist.put(SORT_7, SORT_3);
        for (int i = 0; i < sortedTwist.length; i++) {
            sortedTwist[i] = twist.containsKey(sortedTwist[i]) ? twist.get(sortedTwist[i]) : sortedTwist[i];
        }
        return sortedTwist;
    }

}
