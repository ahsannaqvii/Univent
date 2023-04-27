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

import com.univent.models.Event;
import com.univent.models.EventViewModel;
import com.univent.models.Union;
import com.univent.repositories.EventRepository;
import com.univent.repositories.UnionRepository;

@RestController
@RequestMapping("/api/event")
public class EventController {
	@Autowired
	EventRepository eventRepository;
	@Autowired
	UnionRepository unionRepository;
	
	
	
	//Add Event Method
	//http://localhost:8080/api/event/addEvent
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/addEvent")
	public ResponseEntity<Object> addEvent(@RequestBody EventViewModel eventViewModel ){
	
		try {
			Optional<Union> union = unionRepository.findByName(eventViewModel.getUnionName());
			Optional<Event> event = eventRepository.findByName(eventViewModel.getName());
			
			if(union!=null) {
				Event newEvent = new Event(null ,
						eventViewModel.getName() ,
						eventViewModel.getDescription(),
						eventViewModel.getEventType() ,
						eventViewModel.getGuestName() ,
						eventViewModel.getVenue() ,
						eventViewModel.getMeetLink() ,
						eventViewModel.getRegDeadline() ,
						eventViewModel.getEventDate() ,
						eventViewModel.getEventTime(),
						eventViewModel.getEventImage(),
						union.get(),
						null);
				if(event.isEmpty())
					return new ResponseEntity<Object>(eventRepository.save(newEvent),HttpStatus.CREATED);
				else {
					newEvent.setId(event.get().getId());
					return new ResponseEntity<Object>(eventRepository.save(newEvent),HttpStatus.CREATED);
				}
			} else
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);
		}
	}
	
	
	//Get ALL EVENTS
    //http://localhost:8080/api/event/getAllEvents
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getAllEvents")
    public ResponseEntity<Object> getAllEvents(){
    	try {
    	return new ResponseEntity<Object>(eventRepository.findAll(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
    
    
	//Get Event Profile
    //http://localhost:8080/api/event/getEvent?name=ACM
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getEvent")
    public ResponseEntity<Object> getEvent(@RequestParam(name="name") String name){
    	Optional<Event> event = eventRepository.findByName(name);
    	try {
    	return new ResponseEntity<Object>(event.get(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }


	
}
