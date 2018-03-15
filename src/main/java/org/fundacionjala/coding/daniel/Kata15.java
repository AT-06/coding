package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

/**
 *
 */
public class Kata15 {
    public int mostFrequentItemCount(int[] numbers) {
        return (int)Arrays.stream(numbers).mapToObj(i -> i)
            .collect(Collectors.groupingBy(identity(), counting()))
            .values().stream().mapToLong(i -> (long)i).max().orElse(0);

    }
}
