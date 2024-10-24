/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
class RentalSystem {
    private Vehicle[] vehicles;
    private int vehicleCount;

    public RentalSystem(int capacity) {
        vehicles = new Vehicle[capacity];
        vehicleCount = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicleCount < vehicles.length) {
            vehicles[vehicleCount++] = vehicle;
            System.out.println("Vehicle added: " + vehicle.getModel());
        } else {
            System.out.println("System full, can't add more vehicles.");
        }
    }

    public void displayAllVehicles() {
        for (int i = 0; i < vehicleCount; i++) {
            vehicles[i].displayInfo();
            System.out.println("-----------");
        }
    }
}

