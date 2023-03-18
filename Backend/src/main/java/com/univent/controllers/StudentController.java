package com.univent.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univent.models.Address;
import com.univent.models.AddressViewModel;
import com.univent.models.LoginViewModel;
import com.univent.models.Student;
import com.univent.repositories.AddressRepository;
import com.univent.repositories.StudentRepository;
import com.univent.services.MessageService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private MessageService messageService;
	@Autowired
	private AddressRepository addressRepository;
	
	//Signup Method
    @CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/signup")
	public ResponseEntity<Object> signUp(@RequestBody Student student){
		if(!(studentRepository.existsById(student.getId()))){
			return new ResponseEntity<Object>(studentRepository.save(student),HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<Object>(HttpStatus.FOUND);
	}
	
    
	// Add a Address
    @CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/addAddress")
	public ResponseEntity<Object> addAddress(@RequestBody AddressViewModel addressViewModel){
		
		Optional<Student> student = studentRepository.findById(addressViewModel.getStudent_id());
		
		if(student!=null) {
		Address address = new Address(null,addressViewModel.getStreet(),addressViewModel.getCity(),addressViewModel.getCountry(), student.get());
		
			return new ResponseEntity<Object>(addressRepository.save(address),HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		
	}
    
    
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getstudentbyId")
    public ResponseEntity<Object> getStudentbyId(@RequestParam(name="id") String id){
    	Optional<Student> student = studentRepository.findById(id);
    	try {
    	return new ResponseEntity<Object>(student.get(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
	
	
    @CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody LoginViewModel loginViewModel){
		try {
	    	Optional<Student> student = studentRepository.findByEmail(loginViewModel.getEmail());
	    	if(student.get().getPassword().equals(loginViewModel.getPassword())) {
	    		//messageService.sendMessage(student.get());
	    		return new ResponseEntity<Object>(student.get(),HttpStatus.OK);
	    	}
	    	else
	    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
	    	}
	    	catch(Exception ex) {
	    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
	    	}
}
}
