package org.fundacionjala.coding.escarleth;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;


/**
 * Powered by Escarleth L.
 * This class  contains a highAndLow method
 */
public class Kata10 {

    /**
     * @param numbersList is a list with numbers
     * @return the max and min value
     */

    public String highAndLow(String numbersList) {

        IntSummaryStatistics array = Arrays.stream(numbersList.split(" "))
                .collect(Collectors.summarizingInt(Integer::parseInt));
        return String.format("%s %s", array.getMax(), array.getMin());

    }
}
