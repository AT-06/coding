package org.fundacionjala.coding.escarleth.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for MovieChildrensTest.
 */
public class MovieChildrensTest {

    private Movie movie;

    /**
     * This method tests instancing of Children Class.
     */
    @Before
    public void setUp() {
        movie = new MovieChildrens("Cenicienta");
    }

    /**
     * This method tests calculus of amount of a Children type when its quantity
     * of days rented is less than three.
     */
    @Test
    public void calculateAmountWithDaysRentedLessThanThree() {
        final double actualResult = movie.determineRentalAmount(2);
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of amount of a Children type when its quantity
     * of days rented is greater than three.
     */
    @Test
    public void calculateAmountWithDaysRentedGreaterThanThree() {
        final double actualResult = movie.determineRentalAmount(5);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }
}
