package org.fundacionjala.coding.daniel;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * A class which contains mostFrequentItemCount method.
 */
public class Kata15 {
    /**
     * @param numbers An array of integers.
     * @return the most frequent item of an array.
     */
    public int mostFrequentItemCount(int[] numbers) {
        return (int) Arrays.stream(numbers).boxed()
            .collect(Collectors.groupingBy(identity(), counting()))
            .values().stream().mapToLong(Long::longValue).max().orElse(0);

    }
}
