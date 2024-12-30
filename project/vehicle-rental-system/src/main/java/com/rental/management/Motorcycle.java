package com.rental.management;

public class Motorcycle extends Vehicle implements Rentable {
    private static final double MOTORCYCLE_RATE_MULTIPLIER = 0.8;

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * MOTORCYCLE_RATE_MULTIPLIER * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setIsAvailable(false);
            System.out.println("Motorcycle rented to: " + customer.getName());
        } else {
            System.out.println("Motorcycle is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setIsAvailable(true);
        System.out.println("Motorcycle returned.");
    }
}
