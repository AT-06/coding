package org.fundacionjala.coding.manuel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/22/2018.
 */
public class RegularMovieTest {
    private static final double DELTA = 0;
    private static final int DAYS_RENTED = 3;
    /**
     * First test.
     */
    @Test
    public void testCalculateAmountRegularDaysRentedMoreThanTwo() {
        final double expectedValue = 14.0;
        final int daysRented = 10;
        Movie movie = new RegularMovie("Avatar");
        assertEquals(expectedValue, movie.calculateAmount(daysRented), DELTA);
    }

    /**
     * Second test.
     */
    @Test
    public void testCalculateAmountRegularDaysRentedLessThanTwo() {
        final int daysRented = 1;
        final double expectedValue = 2.0;
        Movie movie = new RegularMovie("Bad Moms");
        assertEquals(expectedValue, movie.calculateAmount(daysRented), DELTA);
    }

    /**
     * Seventh test.
     */
    @Test
    public void testCalculateFrequentRenterPointsDaysRented() {
        Movie movie = new RegularMovie("Hit and Run");
        assertEquals(1, movie.calculateFrequentRenterPoints(DAYS_RENTED));
    }
}
