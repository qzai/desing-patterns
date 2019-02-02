package com.mmosiej.desingpatterns.strategy.travel.strategy;

import java.math.BigDecimal;

public class CarTravelCostStrategy implements TravelCostStrategy {

    @Override
    public BigDecimal calculate(String city) {
        // Skomplikowany algorytm :)
        return new BigDecimal(10);
    }
}
