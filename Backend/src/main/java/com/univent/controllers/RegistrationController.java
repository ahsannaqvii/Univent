package com.univent.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

import com.univent.models.AttendanceViewModel;
import com.univent.models.Event;
import com.univent.models.GetRegistrationByIdResponse;
import com.univent.models.Registration;
import com.univent.models.RegistrationResponse;
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
				Registration newReg = new Registration(null , student.get() , event.get() , null);
				return new ResponseEntity<Object>(registrationRepository.save(newReg),HttpStatus.CREATED);
			}
			else
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);

		}
	}
	
	//GET ALL Registrations Method
	//http://localhost:8080/api/registration/getAllRegistrations
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getAllRegistrations")
	public ResponseEntity<Object> getAllRegistrations(){
		try {
			List<Registration> reg = registrationRepository.findAll();
			List<RegistrationResponse> res = new ArrayList<RegistrationResponse>();
			for(Registration temp1: reg) {
				RegistrationResponse temp2= new RegistrationResponse(temp1.getRegId(), temp1.getStudent().getId() , temp1.getStudent().getName() , temp1.getEvent().getId() , temp1.getEvent().getName(), temp1.getEvent().getEventDate());
				res.add(temp2);
			}
			return new ResponseEntity<Object>(res,HttpStatus.OK);
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);

		}
	}

	//GET  Registration Method
	//http://localhost:8080/api/registration/getRegistration?eventId=58ab7ee3-8b25-46ac-9d66-3a67011bfa95
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getRegistration")
	public ResponseEntity<Object> getRegistration(@RequestParam(name="eventId") UUID eventId){
		try {
			List<Registration> reg = registrationRepository.findByEventId(eventId);
			List<RegistrationResponse> res = new ArrayList<RegistrationResponse>();
			for(Registration temp1: reg) {
				RegistrationResponse temp2= new RegistrationResponse(temp1.getRegId(), temp1.getStudent().getId() , temp1.getStudent().getName() , temp1.getEvent().getId() , temp1.getEvent().getName() , temp1.getEvent().getEventDate());
				res.add(temp2);
			}
			return new ResponseEntity<Object>(res,HttpStatus.OK);
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);

		}
	}
	
	
	//Add Attendance Method
	//http://localhost:8080/api/registration/addAttendance
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/addAttendance")
	public ResponseEntity<Object> addAttendance(@RequestBody List<AttendanceViewModel> attendanceViewModel){
		
		try {
				for(AttendanceViewModel temp: attendanceViewModel) {
				Optional<Registration> registration = registrationRepository.findById(temp.getRegId());
				if(registration!=null) {
					registration.get().setAttendance(temp.getAttendance().toUpperCase());
					registrationRepository.save(registration.get());
				}
			}
				return ResponseEntity.status(HttpStatus.OK).body(null);
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);

		}
	}
	
	//GET  Attendance Method
	//http://localhost:8080/api/registration/getAttendance?eventId=58ab7ee3-8b25-46ac-9d66-3a67011bfa95
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getAttendance")
	public ResponseEntity<Object> getAttendance(@RequestParam(name="eventId") UUID eventId){
		try {
			List<Registration> reg = registrationRepository.findByEventId(eventId);
			List<RegistrationResponse> res = new ArrayList<RegistrationResponse>();
			for(Registration temp1: reg) {
				if(temp1.getAttendance()==null) {
				RegistrationResponse temp2= new RegistrationResponse(temp1.getRegId(), temp1.getStudent().getId() , temp1.getStudent().getName() , temp1.getEvent().getId() , temp1.getEvent().getName() , temp1.getEvent().getEventDate());
				res.add(temp2);
				}
			}
			return new ResponseEntity<Object>(res,HttpStatus.OK);
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);

		}
	}
	
	//GET Events Registered By StudentID
	//http://localhost:8080/api/registration/getEventsByStudentId?id=19k-1475
	@CrossOrigin(origins="http://localhost:8081")
	@GetMapping("/getEventsByStudentId")
	public ResponseEntity<Object> getEventsByStudentId(@RequestParam(name="id") String id){
		try {
			List<GetRegistrationByIdResponse> response = new ArrayList<GetRegistrationByIdResponse>();
				var registrations = registrationRepository.findByStudentId(id);
				if (registrations!=null) {
				for (Registration temp: registrations) {
					response.add(new GetRegistrationByIdResponse(
							temp.getRegId(),
							temp.getEvent().getId(),
							temp.getEvent().getName()
							));
				}
				return new ResponseEntity<Object>(response , HttpStatus.OK);
				}
				else
					return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
			
		}
	}

}
