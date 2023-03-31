package com.univent.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univent.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, UUID>{

	
	Optional<Address> findByStudentId(String student_id);

}
