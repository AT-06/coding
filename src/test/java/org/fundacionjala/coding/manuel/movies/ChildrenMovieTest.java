package org.fundacionjala.coding.manuel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/22/2018.
 */
public class ChildrenMovieTest {
    private static final double DELTA = 0;
    private static final int DAYS_RENTED = 3;
    /**
     * Fourth test.
     */
    @Test
    public void testCalculateAmountChildrenDaysRentedMoreThanThree() {
        final double expectedValue = 12.0;
        final int daysRented = 10;
        Movie movie = new ChildrenMovie("Lego Movie", 2);
        assertEquals(expectedValue, movie.calculateAmount(daysRented), DELTA);
    }

    /**
     * Fifth test.
     */
    @Test
    public void testCalculateAmountChildrenDaysRentedLessThanThree() {
        final double expectedValue = 1.5;
        Movie movie = new ChildrenMovie("Trolls", 2);
        assertEquals(expectedValue, movie.calculateAmount(DAYS_RENTED), DELTA);
    }
}
