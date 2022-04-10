package com.parking.repositories;

import java.util.ArrayList;
import java.util.List;

import com.parking.models.ParkingSpot;
import com.parking.models.SpotStatus;
import com.parking.models.VehicleType;

public class ParkingSpotRepository {
	List<ParkingSpot> parkingSpots = new ArrayList();
	
	public ParkingSpot save(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }
	
	public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType type) {
        for (ParkingSpot parkingSpot: parkingSpots) {
            if (parkingSpot.getStatus() == SpotStatus.AVAILABLE && parkingSpot.getVehicleType() == type){
                return parkingSpot;
            }
        }
        return null;
    }
}
