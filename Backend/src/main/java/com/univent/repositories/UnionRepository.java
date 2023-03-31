package com.univent.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univent.models.Union;

@Repository
public interface UnionRepository extends JpaRepository<Union , String> {
	
	boolean existsByName(String name);
	Optional<Union> findByName(String name);

}
