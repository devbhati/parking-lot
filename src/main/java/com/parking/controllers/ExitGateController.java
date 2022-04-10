package com.parking.controllers;

import com.parking.models.Payment;
import com.parking.models.TicketStatus;
import com.parking.services.TicketService;

public class ExitGateController {
	
	TicketService ticketService = new TicketService();
	
	String mode = "UPI";
	
	public Payment exitFormalities(String TicketID) {
		return ticketService.exitFormalities(TicketID, mode);
	}

}
