package org.fundacionjala.coding.omar.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omar Limbert Huanca Sanchez AT06.
 */
public class Customer {
    private static final String NEW_LINE = "\n";
    private static final int CAPACITY = 100;
    private static final String VAR = "%s %s";
    private String customerName;
    private List<Rental> rentalsList;

    /**
     * Constructor for Customer.
     *
     * @param name customer name.
     */
    public Customer(String name) {

        this.customerName = name;
        this.rentalsList = new ArrayList<>();
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

        overviewBuilder.append(String.format(VAR, "Customer:", customerName))
                .append(NEW_LINE);

        for (Rental rental : rentalsList) {
            overviewBuilder.append(String.format(VAR, rental.getMovieTitle(), rental.getAmount()))
                    .append(NEW_LINE);
        }

        overviewBuilder.append("=====================================\n")
                .append(String.format(VAR, "Total", getTotalAmount()))
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
        return rentalsList.stream()
                .mapToDouble(Rental::getAmount)
                .sum();
    }

    /**
     * This Method return frequent renter points.
     *
     * @return frequentRenterPoints.
     */
    private int getFrequentRenterPoints() {
        return rentalsList.stream()
                .mapToInt(Rental::getFrequentRenterPoints)
                .sum();
    }

}
