package org.fundacionjala.coding.christian.movies;

/**
 * Developer by Christian.
 */
public class NewRelease extends Movie {

    private static final int NEW_FACTOR = 3;

    /**
     * @param title .
     */
    public NewRelease(String title) {
        super(title);
    }

    /**
     *
     */
    @Override
    double calculateAmount(int daysRented) {

        return (double) daysRented * NEW_FACTOR;
    }

    /**
     *
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {

        return daysRented > 1 ? 2 : 1;
    }

}
