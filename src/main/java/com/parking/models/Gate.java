package com.parking.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
public abstract class Gate {
	private String gateNumber;
	private Operator operator;
}
