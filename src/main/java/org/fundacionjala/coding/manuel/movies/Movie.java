package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private static final double MULTIPLY = 1.5;
    private static final int THREE = 3;

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
    public double calculateAmount(int daysRented) {
        //determine amounts for each line
        double amount = 0;
        switch (this.priceCode) {
            case REGULAR:
                amount += 2;
                if (daysRented > 2) {
                    amount += (daysRented - 2) * MULTIPLY;
                }
                break;
            case NEW_RELEASE:
                amount += daysRented * THREE;
                break;
            case CHILDRENS:
                amount += MULTIPLY;
                if (daysRented > THREE) {
                    amount += (daysRented - THREE) * MULTIPLY;
                }
                break;
            default: amount = 0.0;
        }
        return amount;
    }

    /**
     * Method calculate frequent.
     * @param daysRented .
     * @return frequency .
     */
    public int calculateFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        if (this.priceCode == NEW_RELEASE
                &&
                daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
