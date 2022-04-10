package com.parking.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class Payment {
	private String ticketID;
	private Integer amount;
	private String mode;
}
