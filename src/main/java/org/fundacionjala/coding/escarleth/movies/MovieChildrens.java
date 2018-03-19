package org.fundacionjala.coding.escarleth.movies;

/**
 * Powered by Escarleth L.
 */
public class MovieChildrens extends Movie {
    private static final double MAXIM = 3.0;
    private static final double AMOUNT = 1.5;

    /**
     * Constructor for MovieChildrens.
     *
     * @param title of the Movie.
     */
    public MovieChildrens(String title) {
        super(title);
    }

    /**
     * determineRentalAmount method.
     * {@inheritDoc}
     */
    @Override
    double determineRentalAmount(int daysRented) {

        return daysRented > MAXIM ? (daysRented - MAXIM) * AMOUNT : AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return DEFAULT_RENTER_POINT;
    }
}
