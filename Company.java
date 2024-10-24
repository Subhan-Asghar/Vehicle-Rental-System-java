/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rental.management.system;

/**
 *
 * @author lenovo
 */
public class Company {
     private String Cmpname;
    private String location;
    Company(){
    this.Cmpname="abc";
    this.location="xyz";
    
    }
    Company(String Cmpname,String location){
        this.Cmpname=Cmpname;
        this.location=location;
    
    }
    public void setCmpname(String Cmpname){
    this.Cmpname=Cmpname;
    }
    public void setLocation(String location){
    this.location=location;
    }
    public String getCmpname(){
    return this.Cmpname;
    }
     public String getLocation(){
    return this.location;
    }
    
}
