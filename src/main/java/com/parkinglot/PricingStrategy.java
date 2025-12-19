package com.parkinglot;

import java.time.Duration;

public interface PricingStrategy {
    int calculatePrice(Duration duration);
}
