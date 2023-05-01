package com.univent.models;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationResponse {
	private UUID regId;
	private String studentId;
	private String name;
	private UUID eventId;
	private String eventName;
	private Date eventDate;
	
}
