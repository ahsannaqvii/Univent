package com.univent.models;

import java.util.Date;

import lombok.Data;

@Data
public class EventViewModel {
	
	private String name;
	private String eventType;
	private String guestName;
	private String venue;
	private Date date;
	private String unionName;
}
