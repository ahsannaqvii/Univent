package com.univent.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univent.models.Event;
import com.univent.models.Registration;
import com.univent.models.RegistrationViewModel;
import com.univent.models.Student;
import com.univent.repositories.EventRepository;
import com.univent.repositories.RegistrationRepository;
import com.univent.repositories.StudentRepository;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
	@Autowired
	RegistrationRepository registrationRepository;
	@Autowired
	EventRepository eventRepository;
	@Autowired
	StudentRepository studentRepository;
	
	//Add Registration Method
	//http://localhost:8080/api/registration/addRegistration
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/addRegistration")
	public ResponseEntity<Object> addRegistration(@RequestBody RegistrationViewModel regViewModel){
		
		try {
		Optional<Student> student = studentRepository.findById(regViewModel.getStudentId());
		Optional<Event> event = eventRepository.findById(regViewModel.getEventId());
		
			if(student!=null  && event!=null) {
				Registration newReg = new Registration(null , student.get() , event.get());
				return new ResponseEntity<Object>(registrationRepository.save(newReg),HttpStatus.CREATED);
			}
			else
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);

		}
	}

}
