package org.fundacionjala.coding.daniel;

/**
 * Primes in numbers
 * https://www.codewars.com/kata/the-big-pronic-challenge
 * <p>
 * Instructions:
 * <p>
 * Given a positive number n > 1 find the prime factor decomposition of n.
 * The result will be a string with the following form :
 * "(p1**n1)(p2**n2)...(pk**nk)"
 * with the p(i) in increasing order and n(i) empty if n(i) is 1.
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)".
 */
public class PrimeDecomp {
    /**
     * Obtains the prime factor decomposition of a number.
     *
     * @param n a positive number > 1.
     * @return the prime factor decomposition of n.
     */
    public String factors(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            int counter = 0;
            while (n % i == 0) {
                counter++;
                n = n / i;
            }
            if (counter != 0) {
                if (counter > 1) {
                    result.append(String.format("(%d**%d)", i, counter));
                } else {
                    result.append(String.format("(%d)", i));
                }
            }
        }
        return result.toString();
    }
}
