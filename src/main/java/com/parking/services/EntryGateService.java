package com.parking.services;

import com.parking.dto.TicketDTO;
import com.parking.models.ParkingSpot;
import com.parking.models.SpotStatus;
import com.parking.models.Ticket;
import com.parking.models.VehicleType;

public class EntryGateService {
	
	ParkingSpotService parkingSpotService = new ParkingSpotService();
    SpotAllocationService allocationService = new SpotAllocationService();
    TicketService ticketService = new TicketService();

    public TicketDTO createTicket(VehicleType vehicleType) {

        // Early returns
        ParkingSpot parkingSpot = allocationService.allocateSlot(vehicleType);
        if (parkingSpot == null) {
            throw new RuntimeException("Slot not available!");
        }

        // Update parking spot
        parkingSpot.setStatus(SpotStatus.FILLED);
        parkingSpotService.markSlotBooked(parkingSpot);

        // Create and persist ticket
        Ticket ticket = ticketService.createTicket(vehicleType, parkingSpot);

        return TicketDTO
                .builder()
                .entryTime(ticket.getEntryTime())
                .vehicleType(ticket.getVehicleType())
                .build();
    }

}
