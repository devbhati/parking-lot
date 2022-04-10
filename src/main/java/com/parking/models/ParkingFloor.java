package com.parking.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingFloor {
	private Integer floorNumber;
	private List<ParkingSpot> parkingSpots = new ArrayList();;
	private PaymentCounter paymentCounter;
}
