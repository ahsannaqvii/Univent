package com.univent.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univent.models.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration , UUID> {

}
