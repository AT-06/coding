package org.fundacionjala.coding.christian.movies;

/**
 * Developer by Christian.
 */
public class Regular extends Movie {

    private static final double REGULAR_FACTOR = 1.5;

    /**
     * @param title .
     */
    public Regular(String title) {
        super(title);
    }

    /**
     *
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented > 2 ? (daysRented - 2) * REGULAR_FACTOR : 2;
    }

    /**
     *
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
