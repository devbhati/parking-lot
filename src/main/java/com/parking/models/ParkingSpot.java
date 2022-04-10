package com.parking.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {
	
	private Integer id;
	private Integer floorNumber;
	private VehicleType vehicleType;
	private SpotStatus status;

}
