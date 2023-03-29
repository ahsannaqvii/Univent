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

import com.univent.models.Union;
import com.univent.repositories.EventRepository;
import com.univent.repositories.UnionRepository;

@RestController
@RequestMapping("/api/union")
public class UnionController {
	@Autowired
	EventRepository eventRepository;
	@Autowired
	UnionRepository unionRepository;
	
	//Add Union Method
	//http://localhost:8080/api/union/addUnion
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/addUnion")
	public ResponseEntity<Object> addUnion(@RequestBody Union union){
		try {
		if(!(unionRepository.existsById(union.getName()))){
				return new ResponseEntity<Object>(unionRepository.save(union),HttpStatus.CREATED);
		}
		else
				return new ResponseEntity<Object>(HttpStatus.FOUND);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);
		}
	}
	
	
	//Get Union Profile
    //http://localhost:8080/api/union/getUnion?name=ACM
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getUnion")
    public ResponseEntity<Object> getUnion(@RequestParam(name="name") String name){
    	Optional<Union> union = unionRepository.findById(name);
    	try {
    	return new ResponseEntity<Object>(union.get(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
	
}
