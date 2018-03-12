package org.fundacionjala.coding.omar.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class Customer {
    private static final int ZERO = 0;
    private static final String NEW_LINE = "\n";
    private static final int CAPACITY = 100;
    private final String customerName;
    private final List<Rental> rentalsList = new ArrayList<>();

    /**
     * Constructor for Customer.
     *
     * @param name customer name.
     */
    public Customer(String name) {
        this.customerName = name;
    }

    /**
     * @param rental this method add rental to rental list.
     */
    public void addRental(Rental rental) {
        rentalsList.add(rental);
    }

    /**
     * This Method returns, Rental Overview.
     *
     * @return StringBuilder.
     */
    public String getRentalOverview() {
        StringBuilder overviewBuilder = new StringBuilder(CAPACITY);

        overviewBuilder.append(String.format("%s %s", "Customer:", customerName))
                .append(NEW_LINE);

        for (Rental rental : rentalsList) {
            overviewBuilder.append(String.format("%s %s", rental.getMovieTitle(), rental.getAmount()))
                    .append(NEW_LINE);
        }

        overviewBuilder.append("=====================================\n")
                .append(String.format("%s %s", "Total", getTotalAmount()))
                .append(NEW_LINE)
                .append(String.format(
                "%s %s %s", "You earned", getFrequentRenterPoints(), "frequent renter point(s)"));

        return overviewBuilder.toString();
    }

    /**
     * This Method return Total Amount..
     *
     * @return totalAmount.
     */

    private double getTotalAmount() {
        double totalAmount = ZERO;
        for (Rental rental : rentalsList) {
            totalAmount += rental.getAmount();
        }
        return totalAmount;
    }

    /**
     * This Method return frequent renter points.
     *
     * @return frequentRenterPoints.
     */
    private int getFrequentRenterPoints() {
        int frequentRenterPoints = ZERO;
        for (Rental rental : rentalsList) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

}
