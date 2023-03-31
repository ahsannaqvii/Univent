package com.univent.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Registrations",uniqueConstraints = {@UniqueConstraint(columnNames = {"Student", "Event"})})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="Registration_Id" , nullable=false)
	private UUID regId;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Student", nullable = false)

	private Student student;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Event", nullable = false)

	private Event event;
	
}
