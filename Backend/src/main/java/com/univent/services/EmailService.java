package com.univent.services;

import org.springframework.stereotype.Service;

import com.univent.models.Email;

@Service
public interface EmailService {
 
    
	public String sendSimpleMail(Email details);
    
}