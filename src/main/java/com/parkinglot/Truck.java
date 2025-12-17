package com.parkinglot;

public class Truck extends Vehicle{
    Truck(String vehicleNumber){
        super(vehicleNumber);
    }

    public VehicleType getType(){
        return VehicleType.TRUCK;
    }
}
