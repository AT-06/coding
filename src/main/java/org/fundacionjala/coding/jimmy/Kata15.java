package org.fundacionjala.coding.jimmy;

/**
 * Class for developing mostFrequentItemCount method..
 */
public class Kata15 {

    /**
     * Method that will return the most frequent number in an array.
     *
     * @param arrayNumbers the array entry to validate.
     * @return the most frequent number of the given array.
     */
    public int mostFrequentItemCount(int[] arrayNumbers) {
        int mostFrequentNumber = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            int counter = 0;
            for (int x : arrayNumbers) {
                if (x == arrayNumbers[i]) {
                    counter++;
                }
            }
            if (counter > mostFrequentNumber) {
                mostFrequentNumber = counter;
            }
        }
        return mostFrequentNumber;
    }
}
