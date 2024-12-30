package com.rental.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Represents a rental agency managing vehicle rentals.
 */
public class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();
    private List<RentalTransaction> transactions = new ArrayList<>();

    /**
     * Adds a new vehicle to the agency's fleet.
     * 
     * @param vehicle The vehicle to add to the fleet.
     */
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    /**
     * Rent a vehicle to a customer for a specified number of days.
     * 
     * @param vehicle The vehicle being rented.
     * @param customer The customer renting the vehicle.
     * @param days The number of days for which the vehicle is rented.
     */
    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.rent(customer, days);
            transactions.add(new RentalTransaction(customer, vehicle, days));
            System.out.println("Vehicle rented to: " + customer.getName());
        } else {
            System.out.println("Vehicle not available for rental.");
        }
    }

    /**
     * Return a rented vehicle to the agency.
     * 
     * @param vehicle The vehicle to return.
     */
    public void returnVehicle(Vehicle vehicle) {
        vehicle.returnVehicle();
        System.out.println("Vehicle returned.");
    }

    /**
     * Fetch a vehicle by its ID.
     * 
     * @param vehicleId The ID of the vehicle.
     * @return An Optional containing the vehicle if found, empty otherwise.
     */
    public Optional<Vehicle> getVehicleById(String vehicleId) {
        return fleet.stream().filter(v -> v.getVehicleId().equals(vehicleId)).findFirst();
    }

    /**
     * Get a list of all rental transactions.
     * 
     * @return A list of all rental transactions.
     */
    public List<RentalTransaction> getAllTransactions() {
        return transactions;
    }
}
