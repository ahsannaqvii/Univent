package com.univent.models;

import lombok.Data;

@Data
public class Email {
	private String recipient;
	private String content;
	private String subject;
	
	public Email(String recipient, String content, String subject) {
		super();
		this.recipient = recipient;
		this.content = content;
		this.subject = subject;
	}
}
