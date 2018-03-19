package org.fundacionjala.coding.christian.movies;

/**
 * Developer by Christian.
 */
public abstract class Movie {
    protected final String titleMovie;

    /**
     * @param title .
     */
    public Movie(String title) {

        this.titleMovie = title;
    }
    /**
     * @param daysRented s.
     * @return .
     */
    abstract int calculateFrequentRenterPoints(int daysRented);
    /**
     * @param daysRented .
     * @return .
     */
    abstract double calculateAmount(int daysRented);
    /**
     * @param daysRented .
     * @return .
     */
    public String rentalFigure(int daysRented) {
        StringBuilder result = new StringBuilder();
        result.append(titleMovie)
            .append('\t')
            .append(calculateAmount(daysRented));
        return result.toString();
    }
}
