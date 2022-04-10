package com.parking.strategy;

import com.parking.models.VehicleType;

public interface FeesCalculationFactory {
	public FeesStrategy getStrategy(VehicleType vehicleType);
}	
