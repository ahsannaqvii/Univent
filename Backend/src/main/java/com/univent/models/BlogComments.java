package com.univent.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="Blog_Comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogComments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="Comment_id" , nullable=false)
	private UUID id;

	@Column(name="Student Name" , nullable=false)
	private String sName;
	
	@Column(name="Comment" , nullable=false , length=1000)
	private String comment;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "Blog", nullable = false)
	private Blog blog;
	
	
}