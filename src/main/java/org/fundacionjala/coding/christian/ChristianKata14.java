package org.fundacionjala.coding.christian;

/**
 * Powered by Christian.
 */
public class ChristianKata14 {

    /**
     * @param numbers this is for averages
     * @return tag for 'numbers'
     */
    public double[] averages(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return new double[]{};
        }
        double[] ans = new double[numbers.length - 1];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = (numbers[i] + numbers[i + 1]) / 2.0;
        }
        return ans;
    }
}
