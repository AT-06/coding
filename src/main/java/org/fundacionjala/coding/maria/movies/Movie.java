package org.fundacionjala.coding.maria.movies;

/**
 * Class Movie.
 */
public abstract class Movie {
    protected final String title;
    /**
     * @param titleMovie of the Movie.
     */
    public Movie(String titleMovie) {
        this.title = titleMovie;
    }
    /**
     * @param daysRented is the quantity of rental days.
     * @return the total amount of the Movie type.
     */
    abstract double calculateAmount(int daysRented);
    /**
     * @param daysRented is the quantity of rental days.
     * @return the total frequent renter points of the Movie type.
     */
    abstract int calculateFrequentRenterPoints(int daysRented);
    /**
     * @param daysRented is the quantity of rental days.
     * @return the rental figure depending of the Movie type.
     */
    public String rentalFigure(int daysRented) {
        StringBuilder result = new StringBuilder();
        result.append(title)
                .append('\t')
                .append(calculateAmount(daysRented));
        return result.toString();
    }
}
