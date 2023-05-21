package com.univent.controllers;

import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univent.models.Blog;
import com.univent.models.BlogCommentViewModel;
import com.univent.models.BlogComments;
import com.univent.models.BlogViewModel;
import com.univent.repositories.BlogCommentsRepository;
import com.univent.repositories.BlogRepository;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	@Autowired
	BlogRepository blogRepository;
	@Autowired
	BlogCommentsRepository blogCommentsRepository;
	
	
	
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
								blogViewModel.getCategory(),
								blogViewModel.getAuthor(),
								blogViewModel.getTitle(),
								blogViewModel.getContent(),
								blogViewModel.getDate(),
								null
//								null
								)),
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
    		List<Blog> blog = blogRepository.findAll();
    		for(Blog temp : blog) {
    			temp.setBlogComments(blogCommentsRepository.findByBlogId(temp.getId()));
    		}
    	return new ResponseEntity<Object>(blog, HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }
    
    
    //Get BLOG Profile
    //http://localhost:8080/api/blog/getBlog?id=
    @CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/getBlog")
    public ResponseEntity<Object> getBlog(@RequestParam(name="id") UUID id){
    	Optional<Blog> blog = blogRepository.findById(id);
    	try {
    		blog.get().setBlogComments(blogCommentsRepository.findByBlogId(id));
    	return new ResponseEntity<Object>(blog.get(), HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }

    //Post Comment
    //http://localhost:8080/api/blog/postComment
    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping("/postComment")
    public ResponseEntity<Object> postComment(@RequestBody BlogCommentViewModel blogComment){
    	try {
    		Optional<Blog> blog = blogRepository.findById(blogComment.getBlogId());
    		return new ResponseEntity<Object>(blogCommentsRepository.save(
    				new BlogComments(
    						null,
    						blogComment.getName(),
    						blogComment.getComment(),
    						blog.get()
    						)),
    				HttpStatus.OK
    				);
    	}catch(Exception ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    }
    }
    
    //Get Comment by Blog Id
    //http://localhost:8080/api/blog/getCommentByBlogId?id=
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/getCommentByBlogId")
    public ResponseEntity<Object> postComment(@RequestParam(name="id") UUID id){
    	try {
    		return new ResponseEntity<Object>(blogCommentsRepository.findByBlogId(id),HttpStatus.OK);
    	}
    	catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex);
    	}
    }



	
}
