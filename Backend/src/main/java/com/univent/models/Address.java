package com.univent.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Address")
@Data
@NoArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="Address_id" , nullable=false)
	private UUID id;

	
	@Column(name="Street")
	private String street;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Country")
	private String country;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Student_id", nullable = false)
    private Student student;

	
	public Address(UUID id, String street, String city, String country, Student student) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.country = country;
		this.student = student;
	}
}
