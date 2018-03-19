package org.fundacionjala.coding.escarleth.movies;

/**
 * Powered by Escarleth L.
 */
public abstract class Movie {
    private final String title;
    protected static final int DEFAULT_RENTER_POINT = 1;

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
     * @param daysRented rental days.
     * @return the total frequent renter points.
     */
    abstract int calculateFrequentRenterPoints(int daysRented);
}
