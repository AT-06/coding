package org.fundacionjala.coding.maria.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for TaskRelTest.
 */
public class ReleaseMovieTest {

    private Movie movie;

    /**
     * initialize movie.
     */
    @Before
    public void initialize() {
        movie = new ReleaseMovie("Sing");
    }

    /**
     * Test calculateAmount.
     */
    @Test
    public void calculateAmount() {
        final double actualResult = movie.calculateAmount(5);
        final double expectedResult = 15;
        assertEquals(expectedResult, actualResult, 0);
    }
    /**
     * Test rentalFigure.
     */
    @Test
    public void rentalFigure() {
        final String actualResult = movie.rentalFigure(4);
        final String expectedResult = "Sing\t12.0";
        assertEquals(expectedResult, actualResult);
    }

}
