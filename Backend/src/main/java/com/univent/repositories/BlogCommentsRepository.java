package com.univent.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univent.models.BlogComments;

@Repository
public interface BlogCommentsRepository extends JpaRepository<BlogComments , UUID> {
	
	List<BlogComments> findByBlogId(UUID id);


}
