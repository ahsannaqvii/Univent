package com.univent.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
	@Column(name="Description" , length=1000, nullable = true)
	private String description;
	
	@Column(name="Event_type" , nullable=false)
	private String eventType;
	
	@Column(name="Guest_name" , nullable=true)
	private String guestName;
	
	@Column(name="Venue" , nullable=false)
	private String venue;
	
	@Column(name="Meeting_Link" , nullable=true)
	private String meetLink;
	
	@Column(name="Registration_Deadline" , nullable=false)
	private Date regDeadline;
	
	@Column(name="Event_Date" , nullable=false)
	private Date eventDate;
	
	@Column(name="Event_Time" , nullable=false)
	private Time eventTime;
	
	@Column(name="Event_Image" , nullable = true)
	private String eventImage;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Union_name", nullable = false)
    private Union union;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,
			cascade =  CascadeType.ALL,
			mappedBy = "event")
	@JsonIgnoreProperties("event")
	private List<Registration> registration = new ArrayList<>();

	
}
