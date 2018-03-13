package org.fundacionjala.coding.christian;

import java.util.Arrays;

/**
 * Develop by Christian.
 */
public class Kata3 {
    private static final int LIM = 10;

    /**
     * @param num this is for Persistence
     * @return tag for 'num'
     */
    public  int persistence(int num) {
        int cont = 0;
        while (num / LIM > 0) {
            int[] digits = Integer.toString(num).chars().map(Character::getNumericValue).toArray();
            num = 1;
            num *= Arrays.stream(digits).reduce(1, (a, b) -> a * b);
            cont++;
        }
        return  cont;
    }
}
