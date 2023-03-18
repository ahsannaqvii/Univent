package com.univent.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univent.models.Email;
import com.univent.models.Student;
import com.univent.services.EmailService;
import com.univent.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	EmailService emailService;
	
	@Override
	public void sendMessage(Student student) {
		 String subject = "YOU HAVE BEEN LOGGED IN UNIVENT";
		    String content = "Hello " + student.getName() + ",\n"
		            + "For security reason, you're required to use the following \n"
		            + "One Time Password to login:\n"
		            + "\n\t\t\t\t\n"
		            + "\nNote: this OTP is set to expire in 5 minutes.";
		    
		    	    
		    //Sending EMAIL
		    Email email = new Email(student.getEmail(), content, subject);
		    emailService.sendSimpleMail(email);
	}

}
