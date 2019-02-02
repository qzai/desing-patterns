package com.mmosiej.desingpatterns.strategy.travel.strategy;

import java.math.BigDecimal;

public class BusTravelCostStrategy implements TravelCostStrategy {

    @Override
    public BigDecimal calculate(String city) {
        // Skomplikowany algorytm :)
        return new BigDecimal(5);
    }
}
