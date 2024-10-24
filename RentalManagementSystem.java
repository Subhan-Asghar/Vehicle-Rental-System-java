/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
public class RentalManagementSystem {

    public static void main(String[] args) {
      RentalSystem rentalSystem = new RentalSystem(5);

        Engine carEngine = new Engine("V6", 250);
        Vehicle car = new Car("Model S", "Tesla", 150.0, carEngine, 4);
        
        Engine motorcycleEngine = new Engine("V2", 150);
        Vehicle motorcycle = new Motorcycle("Ninja", "Kawasaki", 80.0, motorcycleEngine, false);
        
        Engine truckEngine = new Engine("V8", 400);
        Vehicle truck = new Truck("F-150", "Ford", 200.0, truckEngine, 5.0);
        
        rentalSystem.addVehicle(car);
        rentalSystem.addVehicle(motorcycle);
        rentalSystem.addVehicle(truck);

        rentalSystem.displayAllVehicles();
    }
}
