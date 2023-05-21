package com.univent.models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetRegistrationByIdResponse {
	private UUID regId;
	private UUID eventId;
	private String eventName;	
}
