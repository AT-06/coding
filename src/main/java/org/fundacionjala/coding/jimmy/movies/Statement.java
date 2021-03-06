package org.fundacionjala.coding.jimmy.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Statement.
 */
public class Statement {

    private static final String TAB = "\t";
    private static final String BREAK_LINE = "\n";
    private final Customer customer;
    private final List<Rental> rentals;

    /**
     * Constructor method for Statement.
     *
     * @param customerStatement The customer object.
     */
    Statement(final Customer customerStatement) {
        this.customer = customerStatement;
        rentals = new ArrayList<>();
    }

    /**
     * Method to add a new movie rental to the list of all rentals.
     *
     * @param rental Contains the rental days and the movie.
     */
    public void addRental(final Rental rental) {
        rentals.add(rental);
    }

    /**
     * Method that obtains the detail and totals of the customer voucher.
     *
     * @return The built voucher in string format.
     */
    public String obtainVoucher() {
        return String.format("%s%s%s", obtainVoucherHeader(), obtainRentalDetail(), obtainTotals());
    }

    /**
     * Method that calculates the total points of the customer according to his rentals.
     *
     * @return The total frequent rentals points.
     */
    public int calculateTotalFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }

    /**
     * Method that calculates the total amount to pay of all rentals of a customer.
     *
     * @return The total amount to pay of all rentals of a customer.
     */
    public double calculateTotalAmount() {
        return rentals.stream().mapToDouble(Rental::calculateAmount).sum();
    }

    /**
     * Method that contains the customer name.
     *
     * @return The header of the voucher in string format.
     */
    private String obtainVoucherHeader() {
        final int capacity = 18;
        StringBuilder result = new StringBuilder(capacity);
        result.append("Rental Record for ").append(customer.getName()).append(BREAK_LINE);
        return result.toString();
    }

    /**
     * Method that builds the detail of rental price according the movies rented and the time.
     *
     * @return The detail of the build in String format.
     */
    private String obtainRentalDetail() {
        final StringBuilder rentalDetail = new StringBuilder();
        rentals.forEach((final Rental rental) -> rentalDetail.append(obtainMovieDetail(rental)));
        return rentalDetail.toString();
    }

    /**
     * Method that builds the rental detail of an specific movie.
     *
     * @param rental Contains the movie and the days of the rental.
     * @return The detail of an specific movie rental in string format.
     */
    private String obtainMovieDetail(final Rental rental) {
        StringBuilder result = new StringBuilder();
        result.append(TAB)
                .append(rental.getMovie().getTitle()).append(TAB)
                .append(rental.calculateAmount())
                .append(BREAK_LINE);
        return result.toString();
    }

    /**
     * Method that builds the footer of the voucher that contains the totals.
     *
     * @return The footer of the voucher in string format.
     */
    private String obtainTotals() {
        final int capacity = 49;
        StringBuilder result = new StringBuilder(capacity);
        result.append("Amount owed is ")
                .append(calculateTotalAmount())
                .append(BREAK_LINE)
                .append("You earned ")
                .append(calculateTotalFrequentRenterPoints())
                .append(" frequent renter points");
        return result.toString();
    }
}
