package org.fundacionjala.coding.manuel.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class RentalTest {
    private static final double DELTA = 0;
    private static final int TEN = 10;
    /**
     * First test.
     */
    @Test
    public void testCalculateAmountRegularMovieMoreThanTwoDaysRented() {
        final double expectedValue = 14.0;
        Rental rental = new Rental(new Movie("Batman", 0), TEN);
        assertEquals(expectedValue, rental.calculateAmountFromMovie(), DELTA);
    }

    /**
     * Second test.
     */
    @Test
    public void testCalculateAmountRegularMovieLessThanTwoDaysRented() {
        final double expectedValue = 2.0;
        Rental rental = new Rental(new Movie("Superman", 0), 2);
        assertEquals(expectedValue, rental.calculateAmountFromMovie(), DELTA);
    }

    /**
     * Third test.
     */
    @Test
    public void testCalculateAmountRegularNewRelease() {
        final double expectedValue = 60.0;
        final int daysRented = 20;
        Rental rental = new Rental(new Movie("Infinity War", 1), daysRented);
        assertEquals(expectedValue, rental.calculateAmountFromMovie(), DELTA);
    }

    /**
     * Fourth test.
     */
    @Test
    public void testCalculateAmountRegularChildrenMoreThanThreeDaysRented() {
        final double expectedValue = 3.0;
        final int daysRented = 4;
        Rental rental = new Rental(new Movie("Coco", 2), daysRented);
        assertEquals(expectedValue, rental.calculateAmountFromMovie(), DELTA);
    }

    /**
     * Fifth test.
     */
    @Test
    public void testCalculateAmountRegularChildrenLessThanThreeDaysRented() {
        final double expectedValue = 1.5;
        final int daysRented = 3;
        Rental rental = new Rental(new Movie("Ole", 2), daysRented);
        assertEquals(expectedValue, rental.calculateAmountFromMovie(), DELTA);
    }

    /**
     * Sixth test.
     */
    @Test
    public void testCalculateFrequentRenterPointsCase1() {
        final double expectedValue = 2.0;
        Rental rental = new Rental(new Movie("Pacific RIM", 1), TEN);
        assertEquals(expectedValue, rental.calculateFrequentRenterPointsForMovie(), DELTA);
    }

    /**
     * Seventh test.
     */
    @Test
    public void testCalculateFrequentRenterPointsCase2() {
        final double expectedValue = 1.0;
        Rental rental = new Rental(new Movie("Pacific RIM", 0), TEN);
        assertEquals(expectedValue, rental.calculateFrequentRenterPointsForMovie(), DELTA);
    }
}
