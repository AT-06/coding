package org.fundacionjala.coding.manuel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Juan Manuel on 3/11/2018.
 */
public class Kata7Test {
    private Kata7 kata7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    /**
     * Method to initialize object.
     */
    @Before
    public void initialize() {
        kata7 = new Kata7();
    }
    /**
     * First Test fizzBuzz method.
     */
    @Test
    public void test1FizzBuzzKata7() {

        final String[] expectedResult = new String[]{"1", "2", FIZZ, "4", BUZZ};
        final String[] initialSequence = new String[]{"1", "2", "3", "4", "5"};
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], kata7.fizzBuzz(initialSequence[i]));
        }
    }

    /**
     * Second Test fizzBuzz method.
     */
    @Test
    public void test2FizzBuzzKata7() {
        final String[] expectedResult = new String[]{"8", FIZZ, BUZZ, "11", FIZZ, FIZZ, "14", FIZZ_BUZZ, "16"};
        final String[] initialSequence = new String[]{"8", "9", "10", "11", "12", "13", "14", "15", "16"};
        for (int i = 0; i < expectedResult.length; i++) {
            assertEquals(expectedResult[i], kata7.fizzBuzz(initialSequence[i]));
        }
    }

}
