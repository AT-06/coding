package org.fundacionjala.coding.daniel.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 3/11/2018.
 */
public class RegularTest {

    private Movie movie;

    /**
     * This method tests instancing of Regular Class.
     */
    @Before
    public void setUp() {
        movie = new Regular("Thor");
    }

    /**
     * This method tests calculus of amount of a Regular type when its quantity
     * of days rented is less than two.
     */
    @Test
    public void calculateAmountWithDaysRentedLessThanTwo() {
        final double actualResult = movie.calculateAmount(1);
        final double expectedResult = 2;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of amount of a Regular type when its quantity
     * of days rented is greater than two.
     */
    @Test
    public void calculateAmountWithDaysRentedGreaterThanTwo() {
        final double actualResult = movie.calculateAmount(4);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests output of Regular rental figure.
     */
    @Test
    public void rentalFigure() {
        final String actualResult = movie.rentalFigure(4);
        final String expectedResult = "Thor\t3.0";
        assertEquals(expectedResult, actualResult);
    }
}
