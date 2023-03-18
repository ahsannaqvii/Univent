package com.univent.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univent.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student , String>{
	Optional<Student> findByEmail(String email);
}
