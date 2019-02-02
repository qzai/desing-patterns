package com.mmosiej.desingpatterns.strategy.travel.strategy;

import java.math.BigDecimal;

public interface TravelCostStrategy {
    BigDecimal calculate(String city);
}
