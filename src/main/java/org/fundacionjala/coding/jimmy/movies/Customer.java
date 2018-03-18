package org.fundacionjala.coding.jimmy.movies;

/**
 * Customer class that manage the data of the customer.
 */
class Customer {

    private final String name;

    /**
     * Customer method constructor.
     *
     * @param nameCustomer The name of the customer.
     */
    Customer(final String nameCustomer) {
        this.name = nameCustomer;
    }

    /**
     * Get the customer name.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }
}
