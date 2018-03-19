package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Administrator on 3/19/2018.
 */
public class RegularMovie extends Movie {
    private static final double MULTIPLY = 1.5;

    /**
     * Constructor.
     * @param title .
     * @param priceCode .
     */
    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * Override abstract method.
     * @param daysRented .
     * @return amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented > 2 ? 2 + ((daysRented - 2) * MULTIPLY) : 2;
    }
}
