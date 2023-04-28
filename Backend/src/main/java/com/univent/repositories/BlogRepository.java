package com.univent.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univent.models.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog , UUID> {
	
	Optional<Blog> findByTitle(String title);
	

}
