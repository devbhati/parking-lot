package com.parking.repositories;

import java.util.ArrayList;
import java.util.List;

import com.parking.models.Ticket;
import com.parking.models.TicketStatus;

public class TicketRepository {
	private List<Ticket> tickets = new ArrayList<>();

    public Ticket save(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }
    
    public Ticket findOneByTicketID(String TicketID) {
        for (Ticket ticket: tickets) {
            if (ticket.getTicketId() == TicketID){
                return ticket;
            }
        }
        return null;
    }
}
