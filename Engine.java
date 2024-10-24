/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
class Engine {
    private String type;
    private int rpm;
    
    public Engine(String type, int rpm) {
        this.type = type;
        this.rpm = rpm;
    }
    
    public String getType() {
        return type;
    }

    public int getrpm() {
        return rpm;
    }

    public void displayEngineInfo() {
        System.out.println("Engine Type: " + type + ", RPM: " + rpm);
    }
}
