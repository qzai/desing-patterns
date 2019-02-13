package com.mmosiej.desingpatterns.strategy;

import com.mmosiej.desingpatterns.strategy.travel.AdvancedTravelCostCalculator;
import com.mmosiej.desingpatterns.strategy.travel.VehicleType;
import com.mmosiej.desingpatterns.strategy.travel.strategy.BusTravelCostStrategy;
import com.mmosiej.desingpatterns.strategy.travel.TravelCostCalculator;

import java.math.BigDecimal;

public class StrategyClient {

    public static void main(String[] args) {
        TravelCostCalculator busTravelCostCalculator = new TravelCostCalculator(new BusTravelCostStrategy());
        BigDecimal warsawBusTravelCost = busTravelCostCalculator.calculate("Warsaw");
        System.out.println("Bus travel cost to Warsaw: " + warsawBusTravelCost);

        AdvancedTravelCostCalculator travelCostCalculator = new AdvancedTravelCostCalculator();
        BigDecimal warsawCarTravelCost = travelCostCalculator.calculate(VehicleType.CAR, "Warsaw");
        System.out.println("Car travel cost to Warsaw: " + warsawCarTravelCost);
    }
}
