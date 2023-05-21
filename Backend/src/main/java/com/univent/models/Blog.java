package com.univent.models;

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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Blog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="Blog_id" , nullable=false)
	private UUID id;

	@Column(name="Category" , nullable=false)
	private String category;
	
	@Column(name="Author" , nullable=false)
	private String author;
	
	@Column(name="Title" , nullable=false)
	private String title;
	
	@Column(name="Content" , length = 10000, nullable=false)
	private String content;
	
	@Column(name="Date" , nullable=false)
	private Date date;
	
//	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,
			cascade =  CascadeType.ALL,
			mappedBy = "id")
//	@JsonIgnoreProperties("id")
	private List<BlogComments> blogComments = new ArrayList<>();
	
//	private List<BlogComments> blogComments1 = new ArrayList<>();

}