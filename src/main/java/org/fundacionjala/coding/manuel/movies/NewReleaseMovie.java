package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Administrator on 3/19/2018.
 */
public class NewReleaseMovie extends Movie {
    private static final int THREE = 3;
    /**
     * Constructor.
     * @param title .
     * @param priceCode .
     */
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * Method to calculate amount.
     * @param daysRented .
     * @return amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * THREE;
    }
}
