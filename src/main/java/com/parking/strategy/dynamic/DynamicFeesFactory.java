package com.parking.strategy.dynamic;

import com.parking.models.VehicleType;
import com.parking.strategy.FeesCalculationFactory;
import com.parking.strategy.FeesStrategy;

public class DynamicFeesFactory implements FeesCalculationFactory {

	@Override
    public FeesStrategy getStrategy(VehicleType vehicleType) {
        switch(vehicleType) {
            case SMALL:
                return new SmallVehicleDynamicStrategy();
            case LARGE:
            case MEDIUM:
                throw new RuntimeException("Not implemented");
        }
        
        throw new RuntimeException("Invalid type!");
    }
	
}
