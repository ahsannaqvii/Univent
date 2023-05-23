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

import com.univent.models.Address;
import com.univent.models.AddressViewModel;
import com.univent.models.EditProfileViewModel;
import com.univent.models.LoginViewModel;
import com.univent.models.Student;
import com.univent.repositories.AddressRepository;
import com.univent.repositories.StudentRepository;
import com.univent.serviceImpl.ImageUtil;
import com.univent.services.MessageService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private MessageService messageService;
	@Autowired
	private AddressRepository addressRepository;
	
	//Signup Method
	//http://localhost:8080/api/student/signup
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
    //http://localhost:8080/api/student/addAddress
    @CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/addAddress")
	public ResponseEntity<Object> addAddress(@RequestBody AddressViewModel addressViewModel){
		
		Optional<Student> student = studentRepository.findById(addressViewModel.getStudent_id());
		Optional<Address> address1 = addressRepository.findByStudentId(addressViewModel.getStudent_id());
		if(student!=null) {
			if(address1.isEmpty()) {
				Address address = new Address(null,addressViewModel.getStreet(),addressViewModel.getCity(),addressViewModel.getCountry(), student.get());
				return new ResponseEntity<Object>(addressRepository.save(address),HttpStatus.CREATED);
			}
			else {
				Address address = new Address(address1.get().getId(),addressViewModel.getStreet(),addressViewModel.getCity(),addressViewModel.getCountry(), student.get());
				return new ResponseEntity<Object>(addressRepository.save(address),HttpStatus.CREATED);
			}
		}
		else
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		
	}
    
    //Get Profile
    //http://localhost:8080/api/student/getProfile?id=1440
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getProfile")
    public ResponseEntity<Object> getStudentbyId(@RequestParam(name="id") String id){
    	Optional<Student> student = studentRepository.findById(id);
    	try {
    	return new ResponseEntity<Object>(student.get(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
	
	
    //Login
    //http://localhost:8080/api/student/login
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
    
    
    //Change Phone no.
  	//http://localhost:8080/api/student/changePhone?id=1440
    @CrossOrigin(origins = "http://localhost:8081")
  	@PostMapping("/changePhone")
  	public ResponseEntity<Object> changePhone(@RequestParam(name="id") String id ,@RequestBody String phone){
    	
    	Optional<Student> student = studentRepository.findById(id);
  		if(student!= null){
  			student.get().setPhone(phone);
  			return new ResponseEntity<Object>(studentRepository.save(student.get()),HttpStatus.CREATED);
  		}
  		else
  			return new ResponseEntity<Object>(HttpStatus.FOUND);
  	}
    
    //Change Email
  	//http://localhost:8080/api/student/changeEmail?id=1475
    @CrossOrigin(origins = "http://localhost:8081")
  	@PostMapping("/changeEmail")
  	public ResponseEntity<Object> changeEmail(@RequestParam(name="id") String id ,@RequestBody String email){
    	
    	Optional<Student> student = studentRepository.findById(id);
  		if(student!= null){
  			student.get().setEmail(email);
  			return new ResponseEntity<Object>(studentRepository.save(student.get()),HttpStatus.CREATED);
  		}
  		else
  			return new ResponseEntity<Object>(HttpStatus.FOUND);
  	}
    
    
    //Change Password
  	//http://localhost:8080/api/student/changePassword?id=1440
    @CrossOrigin(origins = "http://localhost:8081")
  	@PostMapping("/changePassword")
  	public ResponseEntity<Object> changePassword(@RequestParam(name="id") String id ,@RequestBody String password){
    	
    	Optional<Student> student = studentRepository.findById(id);
  		if(student!= null){
  			student.get().setPassword(password);
  			return new ResponseEntity<Object>(studentRepository.save(student.get()),HttpStatus.CREATED);
  		}
  		else
  			return new ResponseEntity<Object>(HttpStatus.FOUND);
  	}
    
    
    //ADD USER IMAGE
  	//http://localhost:8080/api/student/addImage?id=1440
    @CrossOrigin(origins = "http://localhost:8081")
  	@PostMapping("/addImage")
  	public ResponseEntity<Object> addImage(@RequestParam(name="id") String id , @RequestPart("file") MultipartFile file) throws IOException{
  		
    	Optional<Student> student = studentRepository.findById(id);
    	if(student!=null){
    		student.get().setImage(ImageUtil.compressImage(file.getBytes()));
  			return new ResponseEntity<Object>(studentRepository.save(student.get()),HttpStatus.CREATED);
  		}
  		else
  			return new ResponseEntity<Object>(HttpStatus.FOUND);
  	}
    
    //GET USER IMAGE
  	//http://localhost:8080/api/student/getImage?id=1440
    @CrossOrigin(origins = "http://localhost:8081")
  	@GetMapping("/getImage")
    public ResponseEntity<Object> getImage(@RequestParam(name="id") String id){
  		
    	try {
    	Optional<Student> student = studentRepository.findById(id);
    		byte[] image = ImageUtil.decompressImage(student.get().getImage());
    		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/jpeg")).body(image);
    	}catch(Exception ex) {
  			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
    	}
  	}
	 // Edit User Profile
	 // http://localhost:8080/api/student/editUserProfile
	 @CrossOrigin(origins = "http://localhost:8081")
	 @PostMapping("/editUserProfile")
	 public ResponseEntity<Object> editUserProfile(@RequestBody EditProfileViewModel editProfileViewModel) {
	     Optional<Student> student = studentRepository.findById(editProfileViewModel.getId());
	     if (student.isPresent()) {
	         Student existingStudent = student.get();
	         existingStudent.setEmail(editProfileViewModel.getEmail());
	         existingStudent.setPassword(editProfileViewModel.getPassword());
	         existingStudent.setPhone(editProfileViewModel.getPhone());
	         existingStudent.getAddress().setStreet(editProfileViewModel.getStreet());
	         existingStudent.getAddress().setCity(editProfileViewModel.getCity());
	         existingStudent.getAddress().setCountry(editProfileViewModel.getCountry());
	         return new ResponseEntity<>(studentRepository.save(existingStudent), HttpStatus.CREATED);
	     } else {
	         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	     }
	 }
      
}
