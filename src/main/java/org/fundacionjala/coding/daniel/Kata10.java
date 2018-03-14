package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * A class which contains highAndLow method.
 */
public class Kata10 {
    /**
     * @param numbers a string of space separated numbers.
     * @return the highest and lowest number of them.
     */
    public String highAndLow(String numbers) {
        IntSummaryStatistics statistics = Arrays.stream(numbers.split("\\s"))
            .mapToInt(Integer::parseInt).summaryStatistics();
        return String.format("%d %d", statistics.getMax(), statistics.getMin());
    }
}
