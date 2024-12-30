package com.rental.management;

/**
 * Represents a truck in the rental system.
 * The rental rate is higher due to the larger size and capacity of the truck.
 */
public final class Truck extends Vehicle implements Rentable {
    // Final multiplier for truck rate, used to calculate rental cost.
    private static final double TRUCK_RATE_MULTIPLIER = 1.5;

    /**
     * Constructs a new Truck instance with the given vehicle ID, model, and base rental rate.
     * 
     * @param vehicleId The unique ID for the truck.
     * @param model The model of the truck.
     * @param baseRentalRate The base rental rate for the truck.
     */
    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    /**
     * Calculates the rental cost for the truck based on the number of days rented.
     * 
     * @param days The number of days the truck is rented.
     * @return The total rental cost.
     */
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * TRUCK_RATE_MULTIPLIER * days;
    }

    /**
     * Checks if the truck is available for rental.
     * 
     * @return true if the truck is available, false otherwise.
     */
    @Override
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }

    /**
     * Rents the truck to a customer for a specific number of days, if available.
     * 
     * @param customer The customer who is renting the truck.
     * @param days The number of days the truck will be rented for.
     */
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setIsAvailable(false);
            System.out.println("Truck rented to: " + customer.getName());
        } else {
            System.out.println("Truck is not available for rental.");
        }
    }

    /**
     * Marks the truck as returned and available for rental.
     */
    @Override
    public void returnVehicle() {
        setIsAvailable(true);
        System.out.println("Truck returned.");
    }

    /**
     * Returns a string representation of the truck, useful for debugging or logging.
     * 
     * @return A string representation of the truck.
     */
    @Override
    public String toString() {
        return String.format("Truck{vehicleId='%s', model='%s', baseRentalRate=%.2f}", getVehicleId(), getModel(), getBaseRentalRate());
    }
}
