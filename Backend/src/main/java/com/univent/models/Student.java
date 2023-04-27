package com.univent.models;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
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
	
	@Lob
	@Column(name="Image" , nullable=true)
	private byte[] image;
	
	@OneToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL,
    mappedBy = "student")
	@JsonIgnoreProperties("student")
    private Address address;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,
			cascade =  CascadeType.ALL,
			mappedBy = "student")
	@JsonIgnoreProperties("student")
	private List<Registration> registration = new ArrayList<>();
}
