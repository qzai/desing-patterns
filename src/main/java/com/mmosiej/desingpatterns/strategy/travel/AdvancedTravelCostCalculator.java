package com.mmosiej.desingpatterns.strategy.travel;

import com.mmosiej.desingpatterns.strategy.travel.strategy.BusTravelCostStrategy;
import com.mmosiej.desingpatterns.strategy.travel.strategy.CarTravelCostStrategy;
import com.mmosiej.desingpatterns.strategy.travel.strategy.PlaneTravelCostStrategy;
import com.mmosiej.desingpatterns.strategy.travel.strategy.TravelCostStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AdvancedTravelCostCalculator {

    private static final Map<TravelCostType, TravelCostStrategy> TRAVEL_COST_TYPE_MAP = new HashMap<TravelCostType, TravelCostStrategy>() {{
        put(TravelCostType.BUS, new BusTravelCostStrategy());
        put(TravelCostType.CAR, new CarTravelCostStrategy());
        put(TravelCostType.PLANE, new PlaneTravelCostStrategy());
    }};

    public BigDecimal calculate(TravelCostType travelCostType, String city) {
        TravelCostStrategy strategy = TRAVEL_COST_TYPE_MAP.get(travelCostType);
        if (strategy == null) {
            throw new IllegalArgumentException(String.format("There's no implementation yet for %s travel cost type.", travelCostType));
        }

        return strategy.calculate(city);
    }

}
