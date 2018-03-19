package org.fundacionjala.coding.manuel.movies;

/**
 * Created by Administrator on 3/19/2018.
 */
public class ChildrenMovie extends Movie {
    private static final int THREE = 3;
    private static final double MULTIPLY = 1.5;

    /**
     * Constructor.
     * @param title .
     * @param priceCode .
     */
    public ChildrenMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * Override abstract method.
     * @param daysRented .
     * @return amount.
     */
    @Override
    public double calculateAmount(int daysRented) {
        if (daysRented > THREE) {
            return MULTIPLY + ((daysRented - THREE) * MULTIPLY);
        }
        return MULTIPLY;

    }
}
