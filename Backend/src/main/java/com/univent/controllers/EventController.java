package com.univent.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import com.univent.models.EventResponse;
import com.univent.models.EventViewModel;
import com.univent.models.Registration;
import com.univent.models.Union;
import com.univent.repositories.EventRepository;
import com.univent.repositories.RegistrationRepository;
import com.univent.repositories.UnionRepository;

@RestController
@RequestMapping("/api/event")
public class EventController {
	@Autowired
	EventRepository eventRepository;
	@Autowired
	UnionRepository unionRepository;
	@Autowired
	RegistrationRepository registrationRepository;
	
	
	
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

    //Get Past EVENTS
    //http://localhost:8080/api/event/getPastEvents
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getPastEvents")
    public ResponseEntity<Object> getPastEvents(){
    	try {
    	List<Event> event = eventRepository.findAll();
    	List<EventResponse> pastEvent = new ArrayList<EventResponse>();
    	Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    	String formattedDate = formatter.format(date);
    	Date parsedDate = formatter.parse(formattedDate);
    	
    	for(Event temp: event) {
    		Date tempDate = formatter.parse(temp.getEventDate().toString());
        	
        	if (parsedDate.compareTo(tempDate)>0) {
            	boolean flag = false;
        		List<Registration> registration = registrationRepository.findByEventId(temp.getId());
        		if(registration!=null) {
        		for(Registration reg: registration) {
        			if(reg.getAttendance()==null) {
                		flag = true;
        			}		
        		}
        		if(flag==true) {
        			pastEvent.add(
        					new EventResponse(temp.getId(),
        							temp.getName()));
             	 }
        	  }        		
            }        	
    	}
    	return new ResponseEntity<Object>(pastEvent, HttpStatus.OK);
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

    //Get Future / Past EVENTS
//  //http://localhost:8080/api/event/getFpEvents
//  @CrossOrigin(origins = "http://localhost:8081")
//	@GetMapping("/getFpEvents")
//  public ResponseEntity<Object> getFpEvents(){
//  	try {
//  	List<Event> event = eventRepository.findAll();
//  	EventResponse res = new EventResponse();
//
//  	Date date = new Date();
//      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//  	String formattedDate = formatter.format(date);
//  	Date parsedDate = formatter.parse(formattedDate);
//  	
//  	for(Event temp: event) {
//  		Date tempDate = formatter.parse(temp.getEventDate().toString());
//      	
//      	if (parsedDate.compareTo(tempDate)>0) {
//      		res.addPast(temp);
//
//          } else {
//          	res.addFuture(temp);
//          }
//      	
//  	}
//  	return new ResponseEntity<Object>(res, HttpStatus.OK);
//  	}
//  	catch(Exception ex) {
//  		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
//  	}
//  }

	
}
