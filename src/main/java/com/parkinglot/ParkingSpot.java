package com.parkinglot;

public class ParkingSpot{
    private Vehicle vehicle;
    public VehicleType supportedType;

    public ParkingSpot(VehicleType supportedTypes){
        this.supportedType = supportedType;
    }

    boolean isFree(){
        return vehicle==null;
    }

    boolean canPark(Vehicle vehicle){
        return isFree() && vehicle.getType() == supportedType;
    }

    void park(Vehicle vehicle){
        if(!canPark(vehicle)) throw new IllegalStateException("This vehicle type cannot be parked here");
        this.vehicle=vehicle;
    }

    void unPark(){
        this.vehicle=null;
    }

    String getTheParkedVehicleNumber(){
        if(vehicle==null) return "this spot is empty";
        return vehicle.getVehicleNumber();
    }

}