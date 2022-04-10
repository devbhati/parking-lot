package com.parking.strategy;

import com.parking.models.Ticket;

public interface FeesStrategy {
	public int calculateFees(Ticket ticket);
}
