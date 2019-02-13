package com.mmosiej.desingpatterns.strategy.travel;

import com.mmosiej.desingpatterns.strategy.travel.strategy.BusTravelCostStrategy;
import com.mmosiej.desingpatterns.strategy.travel.strategy.CarTravelCostStrategy;
import com.mmosiej.desingpatterns.strategy.travel.strategy.PlaneTravelCostStrategy;
import com.mmosiej.desingpatterns.strategy.travel.strategy.TravelCostStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AdvancedTravelCostCalculator {

    private static final Map<VehicleType, TravelCostStrategy> VEHICLE_TYPE_MAP = new HashMap<VehicleType, TravelCostStrategy>() {{
        put(VehicleType.BUS, new BusTravelCostStrategy());
        put(VehicleType.CAR, new CarTravelCostStrategy());
        put(VehicleType.PLANE, new PlaneTravelCostStrategy());
    }};

    public BigDecimal calculate(VehicleType vehicleType, String city) {
        TravelCostStrategy strategy = VEHICLE_TYPE_MAP.get(vehicleType);
        if (strategy == null) {
            throw new IllegalArgumentException(String.format("There's no implementation yet for %s travel cost type.", vehicleType));
        }

        return strategy.calculate(city);
    }

}
