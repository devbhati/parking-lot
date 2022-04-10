package com.parking.dto;

import java.time.LocalDateTime;

import com.parking.models.VehicleType;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class TicketDTO {
	private VehicleType vehicleType;
    private LocalDateTime entryTime;
}
