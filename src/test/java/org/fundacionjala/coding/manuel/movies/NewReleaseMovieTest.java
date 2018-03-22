package org.fundacionjala.coding.manuel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/22/2018.
 */
public class NewReleaseMovieTest {
    private static final double DELTA = 0;
    private static final int DAYS_RENTED = 3;
    /**
     * Third test.
     */
    @Test
    public void testCalculateAmountNewRelease() {
        final double expectedValue = 24.0;
        final int daysRented = 8;
        Movie movie = new NewReleaseMovie("Tom Raider");
        assertEquals(expectedValue, movie.calculateAmount(daysRented), DELTA);
    }

    /**
     * Sixth test.
     */
    @Test
    public void testCalculateFrequentRenterPointsNewReleaseAndDaysRented() {
        Movie movie = new NewReleaseMovie("Game Night");
        assertEquals(2, movie.calculateFrequentRenterPoints(DAYS_RENTED));
    }

    /**
     * Seventh test.
     */
    @Test
    public void testCalculateFrequentRenterPointsNewReleaseAndDaysRentedLower2() {
        Movie movie = new NewReleaseMovie("Freddy vs Json");
        assertEquals(1, movie.calculateFrequentRenterPoints(0));
    }
}
