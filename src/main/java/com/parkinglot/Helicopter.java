package com.parkinglot;

public class Helicopter extends Vehicle{
    Helicopter(String vehicleNumber){
        super(vehicleNumber);
    }

    @Override
    public VehicleType getType(){
        return VehicleType.HELICOPTER;
    }
}
