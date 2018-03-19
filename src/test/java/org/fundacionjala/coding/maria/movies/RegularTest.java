package org.fundacionjala.coding.maria.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test RegularTest.
 */
public class RegularTest {
    private Movie movie;
    /**
     * initialize movie.
     */
    @Before
    public void initialize() {
        movie = new Regular("Amelie");
    }

    /**
     * test calculateAmountWithDaysTwoOrLess.
     */
    @Test
    public void calculateAmountWithDaysTwoOrLess() {
        final double actualResult = movie.calculateAmount(2);
        final double expectedResult = 2;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test calculateAmountWithDaysRentedoreThanTwo.
     */
    @Test
    public void calculateAmountWithDaysRentedoreThanTwo() {
        final double actualResult = movie.calculateAmount(5);
        final double expectedResult = 4.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Test rentalFigure.
     */
    @Test
    public void rentalFigure() {
        final String actualResult = movie.rentalFigure(5);
        final String expectedResult = "Amelie\t4.5";
        assertEquals(expectedResult, actualResult);
    }

}
