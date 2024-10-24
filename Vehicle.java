/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
abstract class Vehicle {
    private String model;
    private String brand;
    private double rentalPrice;
    private Engine engine; 
    
    public Vehicle(String model, String brand, double rentalPrice, Engine engine) {
        this.model = model;
        this.brand = brand;
        this.rentalPrice = rentalPrice;
        this.engine = engine;
    }

    public abstract void displayInfo();     
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public Engine getEngine() {
        return engine;
    }
}
