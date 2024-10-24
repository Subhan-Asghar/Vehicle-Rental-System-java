/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
class Truck extends Vehicle {
    private double loadCapacity;
    
    public Truck(String model, String brand, double rentalPrice, Engine engine, double loadCapacity) {
        super(model, brand, rentalPrice, engine);
        this.loadCapacity = loadCapacity;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Truck Model: " + getModel() + ", Brand: " + getBrand() + ", Rental Price: $" + getRentalPrice() + " per day");
        getEngine().displayEngineInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
