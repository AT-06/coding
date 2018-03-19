package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public abstract class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String title;
    private int priceCode;

    /**
     * Constructor.
     * @param title .
     * @param priceCode .
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
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
        if (this.priceCode == NEW_RELEASE
                &&
                daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
