package com.parking.controllers;

import com.parking.dto.TicketDTO;
import com.parking.models.VehicleType;
import com.parking.services.EntryGateService;

public class EntryGateController {
	EntryGateService entryGateService = new EntryGateService();

    public TicketDTO createTicket(VehicleType vehicleType) {
        return entryGateService.createTicket(vehicleType);
    }

}
