package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Administrator on 3/19/2018.
 */
public class NewReleaseMovie extends Movie {
    private static final double THREE = 3.0;
    /**
     * Constructor.
     * @param title .
     */
    public NewReleaseMovie(String title) {
        super(title);
    }

    /**
     * Method to calculate amount.
     * @param daysRented .
     * @return amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        return Double.parseDouble(String.valueOf(daysRented)) * THREE;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
