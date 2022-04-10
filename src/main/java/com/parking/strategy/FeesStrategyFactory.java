package com.parking.strategy;

import com.parking.strategy.dynamic.DynamicFeesFactory;
import com.parking.strategy.timeBased.TimeBasedFeesStrategyFactory;

public class FeesStrategyFactory {
	
	public static FeesCalculationFactory getFactory(String pricingScheme) {
        switch(pricingScheme) {
            case "TimeBased":
                return new TimeBasedFeesStrategyFactory();
            case "Dynamic":
                return new DynamicFeesFactory();
        }

        throw new RuntimeException();
    }

}
