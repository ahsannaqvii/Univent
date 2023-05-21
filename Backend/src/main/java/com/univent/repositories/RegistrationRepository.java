package com.univent.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univent.models.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration , UUID> {
	List<Registration> findByEventId(UUID eventId);
	List<Registration> findByEventName(String eventName);
	List<Registration> findByStudentId(String id);


}

