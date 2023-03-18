package com.univent.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.univent.models.Address;
import com.univent.models.AddressViewModel;
import com.univent.models.Student;

public interface AddressRepository extends JpaRepository<Address, UUID>{

	
	boolean existsByStudentId(String student_id);
	void deleteByStudentId(String student_id);
	//Optional<Address> findByEmail(String email);

}

//// Add a Address
//@CrossOrigin(origins = "http://localhost:8081")
//@PatchMapping("/addAddress")
//public ResponseEntity<Object> addAddress(@RequestBody AddressViewModel addressViewModel){
//	
//	if(!(addressRepository.existsByStudentId(addressViewModel.getStudent_id()))){
//		Optional<Student> student = studentRepository.findById(addressViewModel.getStudent_id());
//		if(student!=null) {
//			Address address = new Address(null,addressViewModel.getStreet(),addressViewModel.getCity(),addressViewModel.getCountry(), student.get());
//			return new ResponseEntity<Object>(addressRepository.save(address),HttpStatus.CREATED);
//		
//		}
//		else
//			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);		
//	}
//	else{
//		addressRepository.
//	}
//		
//	
//}
