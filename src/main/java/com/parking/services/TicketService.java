package com.parking.services;

import java.time.LocalDateTime;

import com.parking.models.ParkingSpot;
import com.parking.models.Payment;
import com.parking.models.Ticket;
import com.parking.models.TicketStatus;
import com.parking.models.VehicleType;
import com.parking.repositories.TicketRepository;
import com.parking.strategy.FeesStrategy;
import com.parking.strategy.FeesStrategyFactory;

public class TicketService {
	
	private TicketRepository ticketRepository = new TicketRepository();
	
	private static final String PRICING_SCHEME = "TimeBased";

    public Ticket createTicket(VehicleType vehicleType, ParkingSpot spot) {

        Ticket ticket = Ticket
                .builder()
                .entryTime(LocalDateTime.now())
                .floorNumber(spot.getFloorNumber())
                .slotNumber(spot.getId())
                .build();

        return ticketRepository.save(ticket);
    }
    
    public Payment exitFormalities(String ticketID, String mode) {
    	if(getTicketStatus(ticketID) == TicketStatus.DUE) {
    		Ticket ticket = ticketRepository.findOneByTicketID(ticketID);
    		FeesStrategy feesStrategy = FeesStrategyFactory
    				 						.getFactory(PRICING_SCHEME)
    				 						.getStrategy(ticket.getVehicleType());
    		int fees = feesStrategy.calculateFees(ticket);
    		return Payment.builder().amount(fees).ticketID(ticketID).mode(mode).build();
    	}
    	return null;
    }
    
    

	public TicketStatus getTicketStatus(String ticketID) {
		return ticketRepository.findOneByTicketID(ticketID).getStatus();
	}
    
    

}
