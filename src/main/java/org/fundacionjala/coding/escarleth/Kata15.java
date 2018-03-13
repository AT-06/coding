package org.fundacionjala.coding.escarleth;

/**
 * Powered by Escarleth Ledezma Q.
 * Kata15 is a class that contains a mostFrequentItemCount method;
 */
public class Kata15 {
    /**
     * @param numbers contains numbers .
     * @return the mostFrequent number count
     */
    public int mostFrequentItemCount(int[] numbers) {
        int mostFrequent = 0;
        for (int index : numbers) {
            int count = 0;
            for (int element : numbers) {
                if (index == element) {
                    count++;
                }
            }
            if (count > mostFrequent) {
                mostFrequent = count;
            }
        }
        return mostFrequent;
    }
}
