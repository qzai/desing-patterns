package com.mmosiej.desingpatterns.strategy.travel;

import com.mmosiej.desingpatterns.strategy.travel.strategy.TravelCostStrategy;

import java.math.BigDecimal;

public class TravelCostCalculator {

    private TravelCostStrategy travelCostStrategy;

    public TravelCostCalculator(TravelCostStrategy travelCostStrategy) {
        this.travelCostStrategy = travelCostStrategy;
    }

    public BigDecimal calculate(String city) {
        return travelCostStrategy.calculate(city);
    }
}
