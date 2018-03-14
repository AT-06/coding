package org.fundacionjala.coding.maria;

/**
 * test.
 */
public class Kata3 {

    private static final int LIM = 10;
    /**
     * @param num numero
     * @return total persistent
     */
    public int persistence(int num) {

        int cont = 0;
        while (num / LIM > 0) {
            String stringNum = Integer.toString(num);
            int[] digits = stringNum.chars().map(Character::getNumericValue).toArray();
            num = 1;
            for (int tam : digits) {
                num *= tam;
            }
            cont++;
        }
        return cont;
    }
}
