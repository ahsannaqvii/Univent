package com.univent.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univent.models.Blog;
import com.univent.models.BlogViewModel;
import com.univent.repositories.BlogRepository;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	@Autowired
	BlogRepository blogRepository;
	
	
	
	//Add Blog Method
	//http://localhost:8080/api/blog/addBlog
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/addBlog")
	public ResponseEntity<Object> addBlog(@RequestBody BlogViewModel blogViewModel ){
	
		try {
			Optional<Blog> blog = blogRepository.findByTitle(blogViewModel.getTitle());
			
			if(blog!=null) {
				
				return new ResponseEntity<Object>(blogRepository.save(
						new Blog(
								UUID.randomUUID(),
								blogViewModel.getAuthor(),
								blogViewModel.getTitle(),
								blogViewModel.getContent(),
								blogViewModel.getDate())),
						HttpStatus.CREATED);
			
				
			} else
				return ResponseEntity.status(HttpStatus.FOUND).body(null);
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(ex);
		}
	}
	
	
	//Get ALL BLOGS
    //http://localhost:8080/api/blog/getAllBlogs
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getAllBlogs")
    public ResponseEntity<Object> getAllBlogs(){
    	try {
    	return new ResponseEntity<Object>(blogRepository.findAll(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
    
    
	


	
}
