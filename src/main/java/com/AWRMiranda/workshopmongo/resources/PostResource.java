package com.AWRMiranda.workshopmongo.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AWRMiranda.workshopmongo.domain.Post;
import com.AWRMiranda.workshopmongo.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostService service;


	@GetMapping("/{id}")
	public ResponseEntity<Optional<Post>> findById(@PathVariable String id) {
		Optional<Post> obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	
	}
}
	