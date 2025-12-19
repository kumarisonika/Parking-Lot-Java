package com.parkinglot;

import java.time.Duration;

public class TruckPricingStrategy implements PricingStrategy{
    @Override
    public int calculatePrice(Duration duration){
        long hours = Math.max(1, duration.toHours());
        return (int) (hours * 30);
    }
}
