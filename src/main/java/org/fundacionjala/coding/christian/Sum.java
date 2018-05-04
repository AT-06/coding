package org.fundacionjala.coding.christian;

/**
 * Class for Sum.
 *
 * Description:
 Given two integers a and b, which can be positive or negative,
 find the sum of all the numbers
 between including them too and return it.
 If the two numbers are equal return a or b.

 Note: a and b are not ordered!

 Examples
 GetSum(1, 0) == 1   // 1 + 0 = 1
 GetSum(1, 2) == 3   // 1 + 2 = 3
 GetSum(0, 1) == 1   // 0 + 1 = 1
 GetSum(1, 1) == 1   // 1 Since both are same
 GetSum(-1, 0) == -1 // -1 + 0 = -1
 GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2.
 */
public class Sum {
    /**
     * @param a fists number.
     * @param b second numer.
     * @return result.
     */
    public int getSum(int a, int b) {
        int min = a < b ? a : b;
        int max = a > b ? a : b;
        int result = 0;

        for (int i = min; i <= max; i++) {
            result += i;
        }
        return result;
    }
}
