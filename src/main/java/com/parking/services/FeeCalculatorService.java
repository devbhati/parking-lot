package com.parking.services;

import com.parking.models.Ticket;
import com.parking.strategy.FeesStrategy;
import com.parking.strategy.FeesStrategyFactory;

public class FeeCalculatorService {
	
	private static final String PRICING_SCHEME = "TimeBased";

    public int calculateFees(Ticket ticket) {
        
        FeesStrategy feesStrategy = FeesStrategyFactory
                .getFactory(PRICING_SCHEME)
                .getStrategy(ticket.getVehicleType());
        
                return feesStrategy.calculateFees(ticket);
    }

}
