package com.rental.management;

public class Main {
    public static void main(String[] args) {
        var agency = new RentalAgency();

        var car = new Car("CAR123", "Toyota Corolla", 50);
        var motorcycle = new Motorcycle("MOT456", "Honda CBR", 40);
        var truck = new Truck("TRK789", "Volvo FH16", 70);

        var customer = new Customer("John Doe", "DL123456");

        // Adding vehicles to the rental agency fleet
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Renting a vehicle to the customer
        agency.rentVehicle(car, customer, 5);

        // Returning the vehicle
        agency.returnVehicle(car);
    }
}
