package com.univent.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnionViewModel {
	private String name;
	private String announcement;
	private String president;
	private String vicePresident;
	private String coordinator;
	private String headITDept;
	private String deputyITDept;
	private String headCultureDept;
	private String deputyCultureDept;
	private String secretary;
	private String headProjectsDept;
	private String deputyProjectsDept;
	private String headPRDept;
	private String deputyPRDept;	
	private String headSportsDept;
	private String deputySportsDept;
	private String unionImage;


}
