package com.firstSpringProject.Spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstSpringProject.Spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Luan", "luanbelly@gmail.com", "924686055", "1234");
		return ResponseEntity.ok().body(u);
	}
	
	
}
