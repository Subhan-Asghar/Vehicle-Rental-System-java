/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
 class Car extends Vehicle {
    private int doors;
    
    public Car(String model, String brand, double rentalPrice, Engine engine, int doors) {
        super(model, brand, rentalPrice, engine);
        this.doors = doors;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Car Model: " + getModel() + ", Brand: " + getBrand() + ", Rental Price: $" + getRentalPrice() + " per day");
        getEngine().displayEngineInfo();
        System.out.println("Doors: " + doors);
    }
}
