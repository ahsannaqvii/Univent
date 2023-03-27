package com.univent.models;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="Event_id" , nullable=false)
	private UUID id;
	
	@Column(name="Name" , nullable=false)
	private String name;
	
	@Column(name="Event_type" , nullable=false)
	private String eventType;
	
	@Column(name="Guest_name" , nullable=true)
	private String guestName;
	
	@Column(name="Venue" , nullable=false)
	private String venue;
	
	@Column(name="Date" , nullable=false)
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Union_name", nullable = false)
    private Union union;

	
	
}
