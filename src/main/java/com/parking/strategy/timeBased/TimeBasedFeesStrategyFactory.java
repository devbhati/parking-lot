package com.parking.strategy.timeBased;

import com.parking.models.VehicleType;
import com.parking.strategy.FeesCalculationFactory;
import com.parking.strategy.FeesStrategy;

public class TimeBasedFeesStrategyFactory implements FeesCalculationFactory {
	
	public FeesStrategy getStrategy(VehicleType vehicleType) {
		switch(vehicleType) {
			case LARGE:
				return new LargeVehicleTimeStrategy();
			case MEDIUM:
				return new MediumVehicleTimeStrategy();
			case SMALL:
				return new SmallVehicleTimeStrategy();
		}
		throw new RuntimeException("Invalid type");
	}

}
