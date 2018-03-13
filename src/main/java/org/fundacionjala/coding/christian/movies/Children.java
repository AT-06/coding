package org.fundacionjala.coding.christian.movies;

/**
 * Developer by Christian.
 */
public class Children extends Movie {
    private static final int LOAN_DAYS = 3;
    private static final double CHILDREN_FACTOR = 1.5;

    /**
     * @param title is the Movie title.
     */
    public Children(String title) {
        super(title);
    }

    /**
     *
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented > LOAN_DAYS ? (daysRented - LOAN_DAYS) * CHILDREN_FACTOR : CHILDREN_FACTOR;
    }

    /**
     *
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
