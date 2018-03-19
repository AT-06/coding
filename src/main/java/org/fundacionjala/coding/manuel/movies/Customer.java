package org.fundacionjala.coding.manuel.movies;


import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Juan Manuel on 3/18/2018.
 */
public class Customer {
    private String name;
    private Vector rentals;

    /**
     * Constructor.
     * @param name .
     */
    public Customer(String name) {
        this.name = name;
        rentals = new Vector();
    }

    /**
     * Method to add a rental.
     * @param arg .
     */
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * Method getter.
     * @return name .
     */
    public String getName() {
        return name;
    }

    /**
     * Method statement.
     * @return result .
     */
    public String statement() {
        Enumeration rentals = this.rentals.elements();
        String result = String.format("%s %s%s", "Rental Record for", getName(), "\n");
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result = result.concat(String.format("%s%s%s", "\t", each.getMovie().getTitle(), "\t"));
            result = result.concat(String.format("%s%s", String.valueOf(each.calculateAmountFromMovie()), "\n"));
        }
        //add footer lines
        result = result.concat(String.format("%s %s%s", "Amount owed is", String.valueOf(getTotalAmount()), "\n"));
        result = result.concat(String.format("%s %s", "You earned", String.valueOf(getFrequentRenterPoints())));
        result = result.concat(" frequent renter points");
        return result;
    }

    /**
     * Method calculate total amount.
     * @return totalAMount .
     */
    public double getTotalAmount() {
        double totalAmount = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.calculateAmountFromMovie();
        }
        return totalAmount;
    }

    /**
     * Method calculate frequent points.
     * @return frequent points.
     */
    public int getFrequentRenterPoints() {
        // add frequent renter points
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.calculateFrequentRenterPointsForMovie();
        }
        return frequentRenterPoints;
    }
}

