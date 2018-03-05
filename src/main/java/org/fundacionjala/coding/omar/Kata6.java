package org.fundacionjala.coding.omar;

import java.util.Arrays;

/**
 * Powered by Omar Limbert Huanca Sanchez - AT06
 * There is a planet... in a galaxy far far away. It is exactly like our planet,
 * but it has one difference: The values of the digits 3 and 7 are twisted.
 * Our 3 means 7 on the planet Twisted-3-7. And 7 means 3.
 * This class contains a method (sortTwisted37(Integer[] arrayToTwisted)),
 * that can sort an array the way it would be sorted on Twisted-3-7.
 */
public class Kata6 {

    private static final String NUMBER_7 = "7";
    private static final String KEEPER = "K";
    private static final String NUMBER_3 = "3";


    /**
     * @param numberFromArray This is a number of array for swap position.
     * @return result
     */
    private static Integer swapPositions(Integer numberFromArray) {
        return Integer.valueOf(numberFromArray.toString()
                .replace(NUMBER_7, KEEPER)
                .replace(NUMBER_3, NUMBER_7)
                .replace(KEEPER, NUMBER_3));
    }

    /**
     * @param arrayToTwisted contains all numbers for sort and swap position.
     * @return result
     */
    public Integer[] sortTwisted37(Integer[] arrayToTwisted) {

        return Arrays.stream(arrayToTwisted)
                .map(Kata6::swapPositions)
                .sorted(Integer::compare)
                .map(Kata6::swapPositions)
                .toArray(Integer[]::new);
    }
}
