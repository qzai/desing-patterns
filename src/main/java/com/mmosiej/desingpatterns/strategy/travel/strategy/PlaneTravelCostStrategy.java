package com.mmosiej.desingpatterns.strategy.travel.strategy;

import java.math.BigDecimal;

public class PlaneTravelCostStrategy implements TravelCostStrategy {

    @Override
    public BigDecimal calculate(String city) {
        // Skomplikowany algorytm :)
        return new BigDecimal(20);
    }
}
