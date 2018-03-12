package org.fundacionjala.coding.omar;

import java.util.stream.Stream;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06.
 * In this little assignment you are given a string
 * of space separated numbers, and have to return
 * the highest and lowest number.
 */
public class Kata10 {

    private static final String BLACK_SPACE = " ";

    /**
     * @param numbers This is a number for find high and low.
     * @return result
     */
    public String highAndLow(String numbers) {
        Integer[] sorted = Stream.of(numbers.split(BLACK_SPACE))
                .mapToInt(Integer::valueOf)
                .sorted()
                .boxed()
                .toArray(Integer[]::new);
        return String.format("%s %s",sorted[sorted.length - 1].toString(),sorted[0]);
    }
}
