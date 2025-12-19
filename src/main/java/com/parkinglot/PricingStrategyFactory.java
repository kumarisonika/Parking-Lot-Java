package com.parkinglot;

public class PricingStrategyFactory {
    public static  PricingStrategy getStrategy(VehicleType type){
        if(type==VehicleType.BIKE) return new BikePricingStrategy();
        if(type==VehicleType.CAR) return new CarPricingStrategy();
        if(type==VehicleType.TRUCK) return new TruckPricingStrategy();
        if(type==VehicleType.HELICOPTER) return new HelicopterPricingStrategy();
        else throw new IllegalArgumentException("Unsupported vehicle type");
    }
}
