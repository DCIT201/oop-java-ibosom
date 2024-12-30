package com.rental.management;

/**
 * Interface representing the ability to rent and return vehicles.
 */
public interface Rentable {

    /**
     * Rent the vehicle to a customer for a specified number of days.
     * 
     * @param customer The customer who is renting the vehicle.
     * @param days The number of days the vehicle is being rented for.
     */
    void rent(Customer customer, int days);

    /**
     * Return the rented vehicle.
     */
    void returnVehicle();
}
