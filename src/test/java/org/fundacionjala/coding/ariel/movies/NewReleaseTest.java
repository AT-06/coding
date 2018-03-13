package org.fundacionjala.coding.ariel.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit Tests.
 */
public class NewReleaseTest {

    private Movie movie;

    /**
     * This method tests instancing of NewRelease Class.
     */
    @Before
    public void setUp() {
        movie = new NewRelease("Cantinflas");
    }

    /**
     * This method tests calculus of amount of a NewRelease type.
     */
    @Test
    public void calculateAmount() {
        final double actualResult = movie.calculateAmount(3);
        final double expectedResult = 9;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests output of NewRelease rental figure.
     */
    @Test
    public void rentalFigure() {
        final String actualResult = movie.rentalFigure(2);
        final String expectedResult = "Cantinflas\t6.0";
        assertEquals(expectedResult, actualResult);
    }

}
