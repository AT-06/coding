package org.fundacionjala.coding.christian.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Developer by Christian.
 */
public class RegularTest {

    private Movie movie;
    private Movie movieChildren;
    private Movie movieNew;

    /**
     *
     */
    @Before
    public void setUp() {
        movie = new Regular("X-men");
        movieChildren = new Children("King Lion");
        movieNew = new NewRelease("Men in Black");
    }

    /**
     *
     */
    @Test
    public void testCalculateDaysRentedGreaterThanTwo() {
        final double actualResult = movie.calculateAmount(4);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     *
     */
    @Test
    public void testCalculateDaysRentedMovieChildrenGreaterThanThree() {
        final double actualResult = movieChildren.calculateAmount(5);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     *
     */
    @Test
    public void testCalculateDaysRentedMovieChildrenLessThanThree() {
        final double actualResult = movieChildren.calculateAmount(2);
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }


    /**
     *
     */
    @Test
    public void testCalculateDaysRentedLessThanTwo() {
        final double actualResult = movie.calculateAmount(1);
        final double expectedResult = 2;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     *
     */
    @Test
    public void testCalculateAmountNewMovie() {
        final double actualResult = movieNew.calculateAmount(3);
        final double expectedResult = 9;
        assertEquals(expectedResult, actualResult, 0);
    }

}
