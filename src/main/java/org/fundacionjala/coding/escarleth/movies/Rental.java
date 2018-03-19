package org.fundacionjala.coding.escarleth.movies;

/**
 * Powered by Escarleth L.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * This is the constructor of Rental.
     *
     * @param movie      is an Movie .
     * @param daysRented is days rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * getDaysRented.
     *
     * @return daysRented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * DetermineRentalAmount.
     *
     * @return determineRentalAmount of days rented.
     */
    public double determineRentalAmount() {
        return movie.determineRentalAmount(getDaysRented());
    }

    /**
     * the frequent renter points of the Movie.
     *
     * @return renter points.
     */
    public int determinateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(getDaysRented());
    }

    /**
     * @return the rental figure depending on the Movie type.
     */
    public String makeMovieLine() {
        StringBuilder result = new StringBuilder();
        result.append(movie.getTitle())
                .append('\t')
                .append(determineRentalAmount());
        return result.toString();
    }
}
