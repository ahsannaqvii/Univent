package com.univent.models;


import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Students")
@Data
@NoArgsConstructor
public class Student {
	
	@Id
	@Column(name="Student_id" , nullable=false)
	private String id;
	
	@Column(name="Name" , nullable=false)
	private String name;
	
	@Column(name="Email" , nullable=false)
	private String email;
	
	@Column(name="Password" , nullable=false)
	private String password;	
	
	@Column(name="DOB" , nullable=false)
	private Date dob;
	
	@Column(name="Gender" , nullable=false)
	private String gender;
	
	@Column(name="Phone" , nullable=false)
	private String phone;
	
	
	@OneToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    mappedBy = "student")
	@JsonIgnoreProperties("student")
    private Address address;
	
	
}
