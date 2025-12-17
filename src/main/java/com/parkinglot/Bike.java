package com.parkinglot;

public class Bike extends Vehicle{
    Bike(String vehicleNumber){
        super(vehicleNumber);
    }

    @Override
    public VehicleType getType(){
        return VehicleType.BIKE;
    }
}
