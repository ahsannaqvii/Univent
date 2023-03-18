package com.univent.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.univent.models.Address;

public interface AddressRepository extends JpaRepository<Address, UUID>{

	
	Optional<Address> findByStudentId(String student_id);

}
