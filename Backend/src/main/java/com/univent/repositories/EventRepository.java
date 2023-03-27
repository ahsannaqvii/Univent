package com.univent.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.univent.models.Event;

public interface EventRepository extends JpaRepository<Event , UUID> {
	
	Optional<Event> findByName(String name);

}
