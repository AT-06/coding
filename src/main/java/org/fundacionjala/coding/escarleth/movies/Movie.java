package org.fundacionjala.coding.escarleth.movies;

/**
 * Powered by Escarleth L.
 */
public abstract class Movie {
    private final String title;

    /**
     * Constructor Movie Class.
     *
     * @param title of the Movie.
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * @return title of the Movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param daysRented is the quantity of rental days.
     * @return the total amount .
     */
    abstract double determineRentalAmount(int daysRented);

    /**
     * @param daysRented is the FrequentRenterPoints.
     * @return FrequentRenterPoints .
     */
    int determinateFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
