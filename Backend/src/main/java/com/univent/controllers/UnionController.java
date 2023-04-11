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
import com.univent.models.UnionViewModel;
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
	public ResponseEntity<Object> addUnion(@RequestBody UnionViewModel union){
		try {
		if(!(unionRepository.existsByName(union.getName()))){
				Union newUnion = new Union(null ,
						union.getName() ,
						union.getAnnouncement(),
						union.getPresident(),
						union.getVicePresident(),
						union.getCoordinator(),
						union.getHeadITDept(),
						union.getDeputyITDept(),
						union.getHeadCultureDept(),
						union.getDeputyCultureDept(),
						union.getSecretary(),
						union.getHeadProjectsDept(),
						union.getDeputyProjectsDept(),
						union.getHeadPRDept(),
						union.getDeputyPRDept(),
						union.getHeadSportsDept(),
						union.getDeputySportsDept(),
						union.getUnionImage(), 
						null);
				
				return new ResponseEntity<Object>(unionRepository.save(newUnion),HttpStatus.CREATED);
		}
		else
				return new ResponseEntity<Object>(HttpStatus.FOUND);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);
		}
	}
	
	
	//Get ALL Unions
    //http://localhost:8080/api/union/getAllUnions
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getAllUnions")
    public ResponseEntity<Object> getAllUnions(){
    	try {
    	return new ResponseEntity<Object>(unionRepository.findAll(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
    
    
    //Get Union Profile
    //http://localhost:8080/api/union/getUnion?name=ACM
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getUnion")
    public ResponseEntity<Object> getUnion(@RequestParam(name="name") String name){
    	Optional<Union> union = unionRepository.findByName(name);
    	try {
    	return new ResponseEntity<Object>(union.get(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
	
    
}
