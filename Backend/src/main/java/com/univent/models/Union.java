package com.univent.models;

import java.util.ArrayList;
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
@Table(name="Unions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Union {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="Union_Id", nullable = false)
	private UUID uniondId;

	@Column(name="Union_name", nullable = false)
	private String name;
	
	@Column(name="Announcement" , length=1000, nullable = true)
	private String announcement;
	
	@Column(name="President" , nullable = false)
	private String president;
	
	@Column(name="Vice_President" , nullable = false)
	private String vicePresident;
	
	@Column(name="Coordinator" , nullable = false)
	private String coordinator;
	
	@Column(name="Head_IT_Department" , nullable = false)
	private String headITDept;
	
	@Column(name="Deputy_IT_Department" , nullable = false)
	private String deputyITDept;

	@Column(name="Head_Culture_Department" , nullable = false)
	private String headCultureDept;

	@Column(name="Deputy_Culture_Department" , nullable = false)
	private String deputyCultureDept;

	@Column(name="Secretary" , nullable = false)
	private String secretary;

	@Column(name="Head_Projects_Department" , nullable = false)
	private String headProjectsDept;

	@Column(name="Deputy_Projects_Department" , nullable = false)
	private String deputyProjectsDept;

	@Column(name="Head_PR_Department" , nullable = false)
	private String headPRDept;

	@Column(name="Deputy_PR_Department" , nullable = false)
	private String deputyPRDept;
	
	@Column(name="Head_Sports_Department" , nullable = false)
	private String headSportsDept;

	@Column(name="Deputy_Sports_Department" , nullable = false)
	private String deputySportsDept;
	
	@Column(name="Union_Image" , nullable = true)
	private String unionImage;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER,
	cascade =  CascadeType.ALL,
	mappedBy = "union")
	@JsonIgnoreProperties("union")
	private List<Event> event = new ArrayList<>();


}
