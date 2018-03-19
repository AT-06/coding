package org.fundacionjala.coding.maria.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit Tests.
 */
public class ChildrenTest {
    private Movie movie;

    /**
     * initialize movie.
     */
    @Before
    public void initialize() {
        movie = new Children("La la land");
    }

    /**
     * Test calculateAmountWithDaysRentedLessThree.
     */
    @Test
    public void calculateAmountWithDaysRentedLessThree() {
        final double actualResult = movie.calculateAmount(3);
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test calculateAmountWithDaysRentedMoreThree.
     */
    @Test
    public void calculateAmountWithDaysRentedMoreThree() {
        final double actualResult = movie.calculateAmount(5);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test rentalFigure.
     */
    @Test
    public void rentalFigure() {
        final String actualResult = movie.rentalFigure(4);
        final String expectedResult = "La la land\t1.5";
        assertEquals(expectedResult, actualResult);
    }
}
