package com.univent.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Unions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Union {
	
	@Id
	@Column(name="Union_name", nullable = false)
	private String name;
	
	@Column(name="Announcement" , nullable = true)
	private String announcement;
	
	@Column(name="President" , nullable = false)
	private String president;
	
	@Column(name="Vice_President" , nullable = false)
	private String vicePresident;
	
	@Column(name="Secretary" , nullable = false)
	private String secretary;
	
	@Column(name="Treasurer" , nullable = false)
	private String treasurer;

	@Column(name="P&M_Relations" , nullable = false)
	private String pmRelations;

	@Column(name="Academics_Officer" , nullable = false)
	private String academicsOfficer;

	@Column(name="Sports_Officer" , nullable = false)
	private String sportsOfficer;
	
	@OneToMany(fetch = FetchType.LAZY,
	cascade =  CascadeType.ALL,
	mappedBy = "union")
	@JsonIgnoreProperties("union")
	private List<Event> event = new ArrayList<>();
}
