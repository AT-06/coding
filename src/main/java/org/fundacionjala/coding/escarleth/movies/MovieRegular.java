package org.fundacionjala.coding.escarleth.movies;

/**
 * Powered by Escarleth L.
 */
public class MovieRegular extends Movie {
    private static final double AMOUNT = 1.5;

    /**
     * Constructor for MovieRegular.
     *
     * @param title of the Movie.
     */
    public MovieRegular(String title) {
        super(title);
    }

    /**
     * determineRentalAmount method.
     * {@inheritDoc}
     */
    @Override
    double determineRentalAmount(int daysRented) {
        return daysRented > 2 ? (daysRented - 2.0) * AMOUNT : 2;
    }
}
