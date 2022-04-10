package com.parking.services;

import com.parking.models.ParkingSpot;
import com.parking.repositories.ParkingSpotRepository;

public class ParkingSpotService {
	
	private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public void markSlotBooked(ParkingSpot spot) {
        parkingSpotRepository.save(spot);
    }


}
