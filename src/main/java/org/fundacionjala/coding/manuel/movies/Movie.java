package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public abstract class Movie {
    public static final int NEW_RELEASE = 1;
    private String title;


    /**
     * Constructor.
     * @param title .
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Method getter title.
     * @return title .
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Method calculate amount.
     * @param daysRented .
     * @return amount .
     */
    abstract double calculateAmount(int daysRented);

    /**
     * Method calculate frequent.
     * @param daysRented .
     * @return frequency .
     */
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
