package com.univent.controllers;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.univent.models.Event;
import com.univent.models.EventViewModel;
import com.univent.models.Union;
import com.univent.repositories.EventRepository;
import com.univent.repositories.UnionRepository;
import com.univent.serviceImpl.ImageUtil;

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
	public ResponseEntity<Object> addEvent(@RequestPart("file") MultipartFile file, @RequestBody EventViewModel eventViewModel ) throws IOException{
	
		try {
			Optional<Union> union = unionRepository.findByName(eventViewModel.getUnionName());
			Optional<Event> event = eventRepository.findByName(eventViewModel.getName());
			
			if(union!=null) {
				Event newEvent = new Event(null ,
						eventViewModel.getName() ,
						eventViewModel.getEventType() ,
						eventViewModel.getGuestName() ,
						eventViewModel.getVenue() ,
						eventViewModel.getMeetLink() ,
						eventViewModel.getRegDeadline() ,
						eventViewModel.getEventDate() ,
						eventViewModel.getEventTime(),
						null,
						union.get(),
						null);
				newEvent.setEventImage(ImageUtil.compressImage(file.getBytes()));
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


    //GET Event IMAGE
  	//http://localhost:8080/api/event/getImage?id=1440
    @CrossOrigin(origins = "http://localhost:8081")
  	@GetMapping("/getImage")
    public ResponseEntity<Object> getImage(@RequestParam(name="name") String name){
  		
    	try {
    	Optional<Event> event = eventRepository.findByName(name);
    		byte[] image = ImageUtil.decompressImage(event.get().getEventImage());
    		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/jpeg")).body(image);
    	}catch(Exception ex) {
  			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
    	}
  	}

	
}
