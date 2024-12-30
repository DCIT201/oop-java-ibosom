package com.rental.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car extends Vehicle implements Rentable {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);
    private static final double CAR_RATE_MULTIPLIER = 1.2;

    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * CAR_RATE_MULTIPLIER * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setIsAvailable(false);
            logger.info("Car rented to: {}", customer.getName());
        } else {
            logger.warn("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setIsAvailable(true);
        logger.info("Car returned.");
    }
}
