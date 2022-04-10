package com.parking.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingLot {
	private String address;
	private List<ParkingFloor> floors = new ArrayList();
	private List<EntryGate> entryGates = new ArrayList();
    private List<ExitGate> exitGates = new ArrayList();
}
