package com.parking.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder= true)
public class ExitGate extends Gate {
	private PaymentCounter paymentCounter;

}
