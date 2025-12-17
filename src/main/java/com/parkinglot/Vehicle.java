package com.parkinglot;

public abstract class Vehicle{
    private String vehicleNumber;


    public Vehicle(String vehicleNumber){
        this.vehicleNumber= vehicleNumber;
    }

    public  String getVehicleNumber(){
        return vehicleNumber;
    }

    public abstract VehicleType getType();
}