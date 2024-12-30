package com.rental.management;

/**
 * Represents a rental transaction where a customer rents a vehicle for a specific number of days.
 */
public final class RentalTransaction {
    private final Customer customer;
    private final Vehicle vehicle;
    private final int days;

    /**
     * Constructs a rental transaction with the given customer, vehicle, and rental duration.
     * 
     * @param customer The customer renting the vehicle.
     * @param vehicle The vehicle being rented.
     * @param days The number of days the vehicle is rented for.
     */
    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    /**
     * Gets the customer associated with this rental transaction.
     * 
     * @return The customer.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets the vehicle associated with this rental transaction.
     * 
     * @return The vehicle.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Gets the number of days the vehicle was rented for.
     * 
     * @return The number of rental days.
     */
    public int getDays() {
        return days;
    }

    /**
     * Returns a string representation of the rental transaction, useful for logging or debugging.
     * 
     * @return A string representation of the transaction.
     */
    @Override
    public String toString() {
        return String.format("RentalTransaction{customer=%s, vehicle=%s, days=%d}", customer.getName(), vehicle.getVehicleId(), days);
    }

    /**
     * Checks if this rental transaction is equal to another object.
     * Two rental transactions are equal if they have the same customer, vehicle, and rental days.
     * 
     * @param obj The object to compare to.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RentalTransaction that = (RentalTransaction) obj;
        return days == that.days && customer.equals(that.customer) && vehicle.equals(that.vehicle);
    }

    /**
     * Generates a hash code for this rental transaction.
     * 
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(customer, vehicle, days);
    }
}
