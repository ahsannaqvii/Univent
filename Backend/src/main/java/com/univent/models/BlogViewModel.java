package com.univent.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogViewModel {
	private String category;
	private String author;
	private String title;
	private String content;	
	private Date date;
}
