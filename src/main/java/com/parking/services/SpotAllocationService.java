package com.parking.services;

import com.parking.models.ParkingSpot;
import com.parking.models.VehicleType;
import com.parking.repositories.ParkingSpotRepository;

public class SpotAllocationService {
	
	private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot allocateSlot(VehicleType vehicleType) {
        return parkingSpotRepository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
    }

}
