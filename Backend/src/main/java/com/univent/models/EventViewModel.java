package com.univent.models;

import java.sql.Time;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventViewModel {
	
	private String name;
	private String description;
	private String eventType;
	private String guestName;
	private String venue;
	private String meetLink;
	private Date regDeadline;
	private Date eventDate;
	private Time eventTime;
	private String eventImage;
	private String unionName;
}
