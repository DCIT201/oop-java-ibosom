package com.rental.management;

/**
 * Represents a vehicle in the rental system. This is an abstract class that should be extended by specific vehicle types.
 */
public abstract class Vehicle {
    // Final fields ensure immutability where applicable
    private final String vehicleId;
    private final String model;
    private final double baseRentalRate;
    private boolean isAvailable;

    /**
     * Constructs a new Vehicle with the specified vehicle ID, model, and base rental rate.
     *
     * @param vehicleId      The unique ID of the vehicle.
     * @param model          The model of the vehicle.
     * @param baseRentalRate The base rental rate of the vehicle.
     */
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;  // Default availability is true
    }

    /**
     * Abstract method to calculate the rental cost of the vehicle based on the number of rental days.
     *
     * @param days The number of days the vehicle is rented.
     * @return The calculated rental cost.
     */
    public abstract double calculateRentalCost(int days);

    /**
     * Abstract method to check if the vehicle is available for rental.
     *
     * @return true if the vehicle is available, false otherwise.
     */
    public abstract boolean isAvailableForRental();

    // Getters for vehicle attributes
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the vehicle.
     *
     * @param isAvailable The new availability status of the vehicle.
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * Returns a string representation of the vehicle, useful for debugging or logging.
     *
     * @return A string representing the vehicle.
     */
    @Override
    public String toString() {
        return String.format("Vehicle{vehicleId='%s', model='%s', baseRentalRate=%.2f, isAvailable=%b}",
                vehicleId, model, baseRentalRate, isAvailable);
    }
}
