/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String model, String brand, double rentalPrice, Engine engine, boolean hasSidecar) {
        super(model, brand, rentalPrice, engine);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Model: " + getModel() + ", Brand: " + getBrand() + ", Rental Price: $" + getRentalPrice() + " per day");
        getEngine().displayEngineInfo();
        if(hasSidecar){
        System.out.println("Has Sidecar: Yes" );
        }
        else{
        System.out.println("Has Sidecar: No" );
        }
        
    }
}

