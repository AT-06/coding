package org.fundacionjala.coding.escarleth.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for MovieRegularTest.
 */
public class MovieRegularTest {
    private Movie movie;

    /**
     * This method tests instancing of Regular Class.
     */
    @Before
    public void setUp() {
        movie = new MovieRegular("Dr Strange");
    }

    /**
     * This method tests calculus of amount of a Regular type when its quantity
     * of days rented is less than two.
     */
    @Test
    public void calculateAmountWithDaysRentedLessThanTwo() {
        final double actualResult = movie.determineRentalAmount(1);
        final double expectedResult = 2;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of amount of a Regular type when its quantity
     * of days rented is greater than two.
     */
    @Test
    public void calculateAmountWithDaysRentedGreaterThanTwo() {
        final double actualResult = movie.determineRentalAmount(4);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }

}
