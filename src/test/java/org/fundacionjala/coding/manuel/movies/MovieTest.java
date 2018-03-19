package org.fundacionjala.coding.manuel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class MovieTest {
    private static final double DELTA = 0;
    private static final int DAYS_RENTED = 3;
    /**
     * First test.
     */
    @Test
    public void testCalculateAmountRegularDaysRentedMoreThanTwo() {
        final double expectedValue = 14.0;
        final int daysRented = 10;
        Movie movie = new RegularMovie("Avatar", 0);
        assertEquals(expectedValue, movie.calculateAmount(daysRented), DELTA);
    }

    /**
     * Second test.
     */
    @Test
    public void testCalculateAmountRegularDaysRentedLessThanTwo() {
        final int daysRented = 1;
        final double expectedValue = 2.0;
        Movie movie = new RegularMovie("Bad Moms", 0);
        assertEquals(expectedValue, movie.calculateAmount(daysRented), DELTA);
    }

    /**
     * Third test.
     */
    @Test
    public void testCalculateAmountNewRelease() {
        final double expectedValue = 24.0;
        final int daysRented = 8;
        Movie movie = new NewReleaseMovie("Tom Raider", 1);
        assertEquals(expectedValue, movie.calculateAmount(daysRented), DELTA);
    }

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

    /**
     * Sixth test.
     */
    @Test
    public void testCalculateFrequentRenterPointsNewReleaseAndDaysRented() {
        Movie movie = new NewReleaseMovie("Game Night", 1);
        assertEquals(2, movie.calculateFrequentRenterPoints(DAYS_RENTED));
    }

    /**
     * Seventh test.
     */
    @Test
    public void testCalculateFrequentRenterPointsDaysRented() {
        Movie movie = new RegularMovie("Hit and Run", 0);
        assertEquals(1, movie.calculateFrequentRenterPoints(DAYS_RENTED));
    }

    /**
     * Eight test.
     */
    @Test
    public void testCalculateFrequentRenterPointsNewRelease() {
        Movie movie = new NewReleaseMovie("Cementerio de Elefantes", 1);
        assertEquals(1, movie.calculateFrequentRenterPoints(1));
    }

}
