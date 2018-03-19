package org.fundacionjala.coding.escarleth.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for MovieNewReleaseTest.
 */
public class MovieNewReleaseTest {

    private Movie movie;

    /**
     * This method tests instancing of NewRelease Class.
     */
    @Before
    public void setUp() {
        movie = new MovieNewRelease("Fifty Shades Freed");
    }

    /**
     * This method tests calculus of amount of a NewRelease type.
     */
    @Test
    public void calculateAmount() {
        final double actualResult = movie.determineRentalAmount(3);
        final double expectedResult = 9;
        assertEquals(expectedResult, actualResult, 0);
    }

}
