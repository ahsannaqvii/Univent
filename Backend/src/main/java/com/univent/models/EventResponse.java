package com.univent.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventResponse {
	private List<Event> Past = new ArrayList<Event>();
	private List<Event> Future = new ArrayList<Event>();
	
	public void addPast(Event event) {
		Past.add(event);
	}

	public void addFuture(Event event) {
		Future.add(event);
	}

}
